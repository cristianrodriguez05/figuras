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
public abstract class Figura {
    protected int area;
    protected int perimetro;
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    public int getArea(){
        return this.area;
    }
    public int getPerimetro(){
        return this.perimetro;
    }
}
