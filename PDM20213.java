
package pdm20213;

import java.util.Scanner;

public class PDM20213 {
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        /*int valorIngresado;
        System.out.println("Ingrese el numero:");
        valorIngresado=entrada.nextInt();//almacenando el valor ingresado
        System.out.println("El valor que ingresaste es: "+valorIngresado);
        */
        
        System.out.println("Ingrese su nombre y apellido");
        String nombre = entrada.nextLine();
        System.out.println("Su nombre es: "+nombre);
        
        /*sumar();
        int resta = restar(70, 20);
        System.out.println("La resta es = "+resta);*/
    }
    //suma de dos valores
    public static void sumar(){
        int valor1 = 10;
        int valor2 = 15;
        int suma = valor1 + valor2;
        System.out.println("La suma de los valores es: "+suma);
        
    }
    
    public static int restar(int val1, int val2){
        int resta = val1-val2;
        return resta;
    }
    
}
