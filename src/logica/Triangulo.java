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
public class Triangulo extends Figura{
    private int base;
    private int altura;


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea() {
       this.area=(this.base*this.altura)/2;
    }

    public void calcularPerimetro() {
       this.perimetro=(int)Math.sqrt((double)Math.pow(this.altura,2)+(double)Math.pow(this.base,2));
    }
}
