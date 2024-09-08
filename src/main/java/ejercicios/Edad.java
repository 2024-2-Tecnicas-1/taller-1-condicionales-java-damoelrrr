import java.time.LocalDate;
import java.util.Scanner;

public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int m = currentDate.getMonthValue();
        int ww = currentDate.getYear();
        int añ =ww - anno;
        System.out.println(añ);
        
        if (m < mes || (m == mes && day < dia)) {
            añ=añ-1;
        }
        System.out.println("Usted tiene " + añ + " años");
        
        
        
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
