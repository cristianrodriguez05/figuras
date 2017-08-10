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
public class Cuadrado extends Figura{
    private int lado;
    
    public void setLado(int lado){
        this.lado=lado;
    }
    public void calcularArea(){
        this.area=this.lado*this.lado;
    }
    public void calcularPerimetro(){
        this.perimetro=this.lado*4;
    }
    public int getLado(){
        return this.lado;
    }
}
