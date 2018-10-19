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
//L anueva clase Policia toma atributos de la clse padre como lo es Persona
public class Policia extends Persona {
    //DEclaro este atributo nuevo de la clse policia
    private String rango;
    //Realizo el constructor tomando en cuenta los atributos de la clse padre aunmentando el atributo de mi clase policia 
    public Policia(String n, String a, int e, String ran) {
        super(n, a, e);
        //agrego el nuevo atributo
        setRango(ran);
    }
    //Estas funciones realizar el agregar y obtener 
    public void setRango(String rang) {
        rango = rang;
    }

    public String getRango() {
        return rango;
    }


    @Override
    public String toString() {

        return String.format("%s - %s", super.toString(), getRango());
    }
}
