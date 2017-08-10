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
public class Rectangulo extends Figura{
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
          this.area=this.base*this.altura;
    }

    public void calcularPerimetro() {
       this.perimetro=(this.base*2)+(this.altura*2);
    }
    
}
