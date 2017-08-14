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
        int op=0;	
        while(op<=4)
	{
         Scanner sc=new Scanner (System.in);
         System.out.println("1.Cuadrado");
         System.out.println("2.Circulo");
         System.out.println("3.Rectangulo");
         System.out.println("4.Triangulo");
         System.out.println("¿A QUE FIGURA DESEA CALCULAR EL AREA Y EL PERIMETRO?  (NUMERO)");
         op=sc.nextInt();
           switch(op){
               case 1:
                    Cuadrado c = new Cuadrado();
                    System.out.println("ingrese el valor del lado");
                    c.setLado(sc.nextInt());
                    c.calcularArea();
                    c.calcularPerimetro();
                    System.out.println("area:"+c.getArea());
                    System.out.println("perimetro:"+c.getPerimetro());
                    System.out.println();
                    break;
                
               case 2:  
                    Circulo r = new Circulo();
                    System.out.println("ingrese el valor del radio");
                    r.setRadio(sc.nextInt());
                    r.calcularArea();
                    r.calcularPerimetro();
                    System.out.println("area:"+r.getArea());
                    System.out.println("perimetro:"+r.getPerimetro());
                    System.out.println();
                    break;
                    
               case 3:  
                    Rectangulo l = new Rectangulo();
                    System.out.println("ingrese el valor de la altura");
                    l.setAltura(sc.nextInt());
                    System.out.println("ingrese el valor de la base");
                    l.setBase(sc.nextInt());
                    l.calcularArea();
                    l.calcularPerimetro();
                    System.out.println("area:"+l.getArea());
                    System.out.println("perimetro:"+l.getPerimetro());
                    System.out.println();
                    break;
                    
               case 4:  
                    Triangulo m = new Triangulo();
                    System.out.println("ingrese el valor de la altura");
                    m.setAltura(sc.nextInt());
                    System.out.println("ingrese el valor de la base");
                    m.setBase(sc.nextInt());
                    m.calcularArea();
                    m.calcularPerimetro();
                    System.out.println("area:"+m.getArea());
                    System.out.println("perimetro:"+m.getPerimetro());
                    System.out.println();
                    break;    
           }
            
         }
    }
    
}

