package ejercicios;


import java.util.Scanner;

public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("No es un triángulo válido");
        }else{
        if (a==b && b==c) {
            System.out.println("triangulo equilatero");
        }
        if ((a==b && a==c)||(b==c)) {
            System.out.println("triangulo isósceles");
        }else{System.out.println("triangulo escaleno");
        }
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
