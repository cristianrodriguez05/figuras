/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.Scanner;
import logica.Figura;

/**
 *
 * @author Estudiantes
 */
public class Logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc=new Scanner (System.in);
         System.out.println("1.Cuadrado,2.Circulo,3.Rectangulo,4.Traiangulo");
         System.out.println("¿A QUE FIGURA DESEA CALCULAR EL AREA Y EL PERIMETRO");
         int op =sc.nextInt();
           switch(op){
               case 1:
                    Cuadrado c = new Cuadrado();
                    System.out.println("ingrese el valor del lado");
                    c.setLado(sc.nextInt());
                    c.calcularArea();
                    c.calcularPerimetro();
                    System.out.println("area:"+c.getArea());
                    System.out.println("perimetro:"+c.getPerimetro());
                    break;
                
               case 2:  
                    Circulo r = new Circulo();
                    System.out.println("ingrese el valor del radio");
                    r.setRadio(sc.nextInt());
                    r.calcularArea();
                    r.calcularPerimetro();
                    System.out.println("area:"+r.getArea());
                    System.out.println("perimetro:"+r.getPerimetro());
                    break;
           }
            
         }
    }
    

