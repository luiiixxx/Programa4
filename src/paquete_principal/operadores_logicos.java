package paquete_principal;
public class operadores_logicos {

    //Metodo constructor
    public operadores_logicos() {
        
    }
    
    //Metodo punto 6: Determinar false o true según la operación 
    public void HallarFalsoOVerdadero () {
        int a = 33;
        if (!((a > 10) && (a < 20))) {
            System.out.println("La expresión es verdadera");
        }
        else {
            System.out.println("La expresión es falsa");
        }
        
    }
    
    // Metodo punto 7: Hallar el valor de verdad de las expresiones
    public void ValorVerdad1 () {
        int a = 10, b = 12, c = 13, d = 10;
        if (((a > b) || (a < c)) && ((a == c) || (a >= b))) {
            System.out.println("El valor de verdad de la expresión 1 es verdadera");
        }
        else {
            System.out.println("El valor de verdad de expresión 1 es falso");
        }
        
        if (((a >= b) || (a < d)) && ((a >= d) && (c > d))) {
            System.out.println("El valor de verdad de la expresión 2 es verdadera");
        }
        else {
            System.out.println("El valor de verdad de la expresión 2 es falso");
        }
        
        if (!(a == c) && (c > b)) {
            System.out.println("El valor de verdad de la expresión 3 es verdadera");
        }
        else {
            System.out.println("El valor de verdad de la expresión 3 es falso");
        }
    }

    // Metodo punto 8: Devolver valor verdad de la expresión
    public void ValorVerdad2 () {
        int m = 8, n = 9, r = 5, s = 5, t = 4, v = 7;
        if (!((m > n && r > 5) || (!(t < v && s > m)))) {
            System.out.println("La expresión es verdadera");
        }
        else {
            System.out.println("La expresión es falsa");
        }
    }
    
    //Metodo punto 9: Determinar si un numero es 0, positivo ó negativo
    public void TipoNumero (int numero) {        
        if (numero > 0)
            System.out.println(numero + " es positivo");
        else if (numero < 0)
            System.out.println(numero + " es negativo");
        else
            System.out.println("es cero");
    }
}
