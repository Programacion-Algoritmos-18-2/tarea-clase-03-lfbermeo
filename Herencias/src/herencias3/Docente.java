/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author DELL
 */

//La nueva clse Docente hereda los atrbutos de la clase padre que es Persona
public class Docente extends Persona {
    //Declaro la varibel que varía de la clase docente
    private double sueldo;
    //Realizo el constrcutor totando en cuenta los atributos de la clase padre y aumentando el atributo de la clase docente
    public Docente(String n, String a, int e, double sueldo) {
        //super hace referencia a los atributos de la clase padre
        super(n, a, e);
        //agrego el nuevo atributo
        setSueldo(sueldo);
    }

    //Estas funciones es para agregar y obtener el sueldo 
    public void setSueldo(double suel) {
        sueldo = suel;
    }

    public double getSueldo() {
        return sueldo;
    }

    //Esta función toString hace referencia del metodo principal herencias para presentar datos 
    @Override
    public String toString() {

        return String.format("%s - %f", super.toString(), getSueldo());
    }
}

