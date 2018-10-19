/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_3pa;

/**
 *
 * @author DELL
 */
public class Trabajador {

    private String nombres;
    private double sueldo_mensual = 0;
    private double[] sueldo_men;
    private String apellidos;

    public void agregar_nombres(String n) {
        nombres = n;
    }

    public void agregar_nombres(String n1, String n2) {
        nombres = String.format("%s-%s", n1, n2);
    }

    public void agregar_sueldo(double sueldo) {
        sueldo_mensual = sueldo;
    }
    //Está función donde recibo un array de la clase principa,
    public void agregar_sueldo(double[] sueldo) {
        //le agrego el valor de sueldo al atributo que recibo
        sueldo_men = sueldo;
        //Recorro los valores ingresados 
        for (int i = 0; i < sueldo_men.length; i++) {
            sueldo_mensual = sueldo_mensual+ sueldo_men[i];
        }
    }

    //Agrego este método donde recibo 4 atributos de la clase principal 
    public void agregar_sueldo(double sueldo_1, double sueldo_2, double sueldo_3, double sueldo_4) {
        //Donde el sueldo mensual es igual ala suma de todos los sueldos
        sueldo_mensual = sueldo_1 + sueldo_2 + sueldo_3 + sueldo_4;
    }

    public void agregar_apellidos(String n) {
        apellidos = n;
    }

    public String obtener_nombres() {
        return nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public double obtener_sueldo_mensual() {
        return sueldo_mensual;
    }

    public String presentar_datos() {
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
}
