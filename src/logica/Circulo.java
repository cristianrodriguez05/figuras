/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura{
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public void calcularArea() {
       this.area=(int) (Math.PI*(this.radio*2));
    }
    public void calcularPerimetro() {
       this.perimetro=(int) ((Math.PI*2)*this.radio);
    }
    
}
