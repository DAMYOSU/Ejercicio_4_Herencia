
package entidadesGeom;

import java.util.Scanner;

/**
 *
 * @author DAMY
 */
public class rectangulo implements calculosFormas{

   
    public void area() {
      Scanner leer = new Scanner(System.in);
        System.out.println("\n*****   CALCULO DEL AREA DEL UN RECTANGULO   *****");
        System.out.println("\nIngrese la Base del Rectangulo:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la Altura del Rectangulo:");
        double altura = leer.nextDouble();
        System.out.println("\n!!  El Area del Reactangulo es: " + base*altura );
    }

    public void perimetro() {
        Scanner leer = new Scanner(System.in);
       System.out.println("\n*****   CALCULO DEL PERIMETRO DEL UN RECTANGULO   *****");
     System.out.println("\nIngrese la Base del Rectangulo:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la Altura del Rectangulo:");
        double altura = leer.nextDouble();
        System.out.println("\n!!  El Perimetro del Rectangulo es: " + (base + altura)*2+ "\n");
    }
    
}
