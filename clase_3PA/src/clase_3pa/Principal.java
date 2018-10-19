/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_3pa;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        //Le pido al usuario que ingrese la opción que desea y dependiendo de eso seguirá corriendo el código
        System.out.println("Por favor ingrese 1 si desea ingresar su sueldo total, ingrese 2 para ingresar semananalmente y 3 si desea ingresar el sueldo semanal");
        int sueldo_total = scanner.nextInt();
        //Si el uduario ingresa 1 el usuario deberá igresar su sueldo total
        if (sueldo_total == 1) {
            System.out.println("Ingrese el sueldo del trabajador");
            double sueldo = scanner.nextDouble();
            //Hago referencia al método donde solo le envio un oslo valor
            t.agregar_sueldo(sueldo);
        }
        //Si el usuario ingresa dos, con un ciclo for se le preguntará las veces al ccuál el arreglo se lo definió
        if (sueldo_total == 2) {
            double[] sueldo_men = new double[4];
            for (int i = 0; i < sueldo_men.length; i++) {
                System.out.printf("Porfavor ingrese su sueldo semanal:  ");
                sueldo_men[i] = scanner.nextDouble();
                //Hago referenci a la funión donde se le envía los valores del un array
                
            }
            t.agregar_sueldo(sueldo_men);
        } else {
            //Y si la respuesta es diferente se le preguntará 4 veces al usuario su sueldo
            System.out.println("Ingrese sueldo1");
            double sueldo_1 = scanner.nextDouble();
            System.out.println("Ingrese sueldo2");
            double sueldo_2 = scanner.nextDouble();
            System.out.println("Ingrese sueldo3");
            double sueldo_3 = scanner.nextDouble();
            System.out.println("Ingrese sueldo4");
            double sueldo_4 = scanner.nextDouble();
            //Hago referencia a la función donde se le envía 4 atributos
            t.agregar_sueldo(sueldo_1, sueldo_2, sueldo_3, sueldo_4);

        }

        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());

    }
}
