/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
         int num1;
         int e;
         
         Scanner leer=new Scanner(System.in);
         System.out.println("*****Ingresar un numero*****");
         num1=leer.nextInt();
         System.out.println("*****los resultados son*****");
         for(e=1;e<10;e++){
         System.out.println("Los numeros son= "+ Math.round(Math.pow(num1, e)));
             System.out.println("Finalizado");
         
         }

    }

}
        //un programa que enliste tdoas las potencias de un numero ingresado por teclado hasta el 10
        //System.out.println(cadena.length());
        //System.out.println(cadena.toLowerCase());//minusculas todo
        //System.out.println(cadena.toUpperCase());//todo en mayusculas
        //System.out.println(Math.PI);
        //System.out.println(Math.abs(-5));
        //System.out.println(Math.pow(2, 4));
        //System.out.println(Math.abs(84));
        //System.out.println(Math.addExact(21, 15));
        //System.out.println(Math.addExact(5, 21));
        //System.out.println(Math.multiplyExact(5, 6));
        //System.out.println(Math.max(21, 5));//retornara el numero maximo entre los dos
        //System.out.println(Math.min(15, 1));//retornara el numero minimo entre los dos
        //System.out.println(Math.random());
        //System.out.println(Math.negateExact(88));
        //System.out.println(Math.incrementExact(15));
        //System.out.println(Math.atan(-9));
