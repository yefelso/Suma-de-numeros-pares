/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg03;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        Scanner sm = new Scanner (System.in);
        System.out.println("Por favor ingrese un numero:");
        numero = sm.nextInt();
        int suma = 0;
        for(int i=0;i<=numero;i+=2)
        suma = suma + i;
        if (numero%2== 0){
                System.out.println("la suma de los numero pares es:" + suma);
        } else{
            System.out.println("el numero que ingreso no es un numero par");
        }
    
    }
    
}
