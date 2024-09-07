
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {
    public static String evaluar(int anno){
        // TODO: Coloca aquí el código del ejercicio 2: Años bisiestos
        
        if (anno <= 1582) {
            System.out.println("calendario juliano");
            if (anno % 4 == 0) {
                System.out.println(anno + " es año bisiesto  ");
            } else {
                System.out.println(anno + " no es bisiesto ");
            }
        }
        if (anno >= 1582) {
            System.out.println("calendario gregoriano ");
            if (anno % 400 == 0) {
                return anno + " es un año bisiesto";
            } else if (anno % 100 == 0) {
                return anno + " no es bisiesto";
            } else if (anno % 4 == 0) {
                return anno + " es un año bisiesto";
            } else {
                return anno + " no es bisiesto";
            }

        }
        
        
        if (anno <= 1582) {
            System.out.println("caso especial aca calculo cuales son los los bisiestos antes de 1582");
            System.out.println("calendario gregoriano ");
            if (anno % 400 == 0) {
                return anno + " es un año bisiesto";
            } else if (anno % 100 == 0) {
                return anno + " no es bisiesto";
            } else if (anno % 4 == 0) {
                return anno + " es un año bisiesto";
            } else {
                return anno + " no es bisiesto";
            }

        }
        

        return "";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anno = lector.nextInt();

        String respuesta = evaluar(anno);
        System.out.println(respuesta);
    }

}
