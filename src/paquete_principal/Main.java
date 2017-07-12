package paquete_principal;;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //Creando sc objeto tipo Scanner
        Scanner sc =new Scanner(System.in);
        
        //Creando objeto or tipo operadores_relacionales
        operadores_relacionales or =new operadores_relacionales();
        
        //Punto 1: probarEquivalencia
        int num_x, num_y;
        System.out.println("Digite un número entero");
        num_x = sc.nextInt();
        System.out.println("DIgite otro número entero");
        num_y = sc.nextInt();
        boolean probarEquivalencia = or.probarEquivalencia(num_x, num_y);
        
        //Punto 2: mostrarResultado
        or.mostrarResultado(probarEquivalencia);
        
        //Creando objeto Scruffy tipo perro
        perro scruffy =new perro();
        //Creando objeto spot tipo perro
        perro spot =new perro();
        
        //Punto 3: asignarNombre, obtenerNombre, asignarDice, obtenerDice
        spot.asignarNombre("Spot");
        scruffy.asignarNombre("Scruffy");
        spot.asignarDice("Ruff!");
        scruffy.asignarDice("Wurf!");
        System.out.println("El perro " + spot.obtenerNombre() + " dice " + spot.obtenerDice());
        System.out.println("El perro " + scruffy.obtenerNombre() + " dice " + scruffy.obtenerDice());
        
        //Punto 4: asignarEdad, obtenerEdad
        //-- Edad de spot 8, y de scruffy 4
        spot.asignarEdad(8);
        scruffy.asignarEdad(4);
        if (spot.obtenerEdad() > scruffy.obtenerEdad()) {
            System.out.println("El perro " + spot.obtenerNombre() + " es el mayor");
        }
        else if (spot.obtenerEdad() < scruffy.obtenerEdad()) {
            System.out.println("El perro " + scruffy.obtenerNombre() + " es el mayor");
        }
        else {
            System.out.println("Los dos perros tienen la misma edad");
        }
        //-- Hacer que spot sea menor 
        spot.asignarEdad(6);
        scruffy.asignarEdad(10);
        if (spot.obtenerEdad() > scruffy.obtenerEdad()) {
            System.out.println("El perro " + spot.obtenerNombre() + " es el mayor");
        }
        else if (spot.obtenerEdad() < scruffy.obtenerEdad()) {
            System.out.println("El perro " + scruffy.obtenerNombre() + " es el mayor");
        }
        else {
            System.out.println("Los dos perros tienen la misma edad");
        }
        //--Hacer que spot scruffy tengan la misma edad
        spot.asignarEdad(7);
        scruffy.asignarEdad(7);
        if (spot.obtenerEdad() > scruffy.obtenerEdad()) {
            System.out.println("El perro " + spot.obtenerNombre() + " es el mayor");
        }
        else if (spot.obtenerEdad() < scruffy.obtenerEdad()) {
            System.out.println("El perro " + scruffy.obtenerNombre() + " es el mayor");
        }
        else {
            System.out.println("Los dos perros tienen la misma edad");
        }
        
        //Punto 5: ifTernario, ifEstandar
        System.out.println("Prueba ifTernario");
        System.out.println(or.ifTernario(9));
        System.out.println(or.ifTernario(10));
        System.out.println("Prueba ifEstandar");
        System.out.println(or.ifTernario(9));
        System.out.println(or.ifEstandar(10));
        
        //Creando objeto ma tipo operadores_logicos
        operadores_logicos ol =new operadores_logicos();
        
        //Punto 6: HallarFalsoOVerdadero
        ol.HallarFalsoOVerdadero();
        
        //Punto 7: HallarValorVerdad1
        ol.ValorVerdad1();
        
        //Punto 8: HallarValorVerdad2
        ol.ValorVerdad2();
        
       //Punto 9: ObtenerTipoNumero
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        ol.TipoNumero(num);
    }
}
