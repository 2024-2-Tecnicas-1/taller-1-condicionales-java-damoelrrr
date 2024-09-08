package javaapplication33;

import java.util.Scanner;

public class JavaApplication33 {

    public static String evaluar(int anno) {
        
        if (anno < 1582) {
            if (anno % 4 == 0) {
                return anno + " es un año bisiesto (calendario juliano)";
            } else {
                return anno + " no es bisiesto (calendario juliano)";
            }
        } 
        
        else {
            if (anno % 400 == 0) {
                return anno + " es un año bisiesto (calendario gregoriano)";
            } else if (anno % 100 == 0) {
                return anno + " no es bisiesto (calendario gregoriano)";
            } else if (anno % 4 == 0) {
                return anno + " es un año bisiesto (calendario gregoriano)";
            } else {
                return anno + " no es bisiesto (calendario gregoriano)";
            }
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año: ");
        int anno = lector.nextInt();

        String respuesta = evaluar(anno);
        System.out.println(respuesta);
    }
}
