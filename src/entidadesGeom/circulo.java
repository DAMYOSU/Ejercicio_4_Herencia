
package entidadesGeom;

import java.util.Scanner;

/**
 *
 * @author DAMY
 */
public class circulo implements calculosFormas{

    
    public void area() {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n*****   CALCULO DEL AREA DEL UN CIRCULO   *****");
        System.out.println("\nIngrese el Radio del Circulo");
        double radio = leer.nextDouble();
        System.out.println("\n!!  El Area del Circulo es: " + pi * (radio*radio));
    }

   
    public void perimetro() {
      Scanner leer = new Scanner(System.in);
       System.out.println("\n*****   CALCULO DEL PERIMETRO DEL UN CIRCULO   *****");
      System.out.println("\nIngrese el Diametro del Circulo");
        double diam = leer.nextDouble();
        System.out.println("\n!!  El Perimetro del Circulo es: " + pi * diam + "\n");
    }
    
}
