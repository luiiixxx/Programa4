package paquete_principal;
public class operadores_relacionales {
    
    //Metodo constructor
    public operadores_relacionales() {
        
    }
    
    //Metodo punto 1: probarEquivalencia, retornar true si dos numeros son iguales
    //de lo contrario retornar false
    
    public boolean probarEquivalencia (int numero_1, int numero_2) {
        //Comparo si los dos numeros son iguales
        if (numero_1 == numero_2) {
            return true;
        }
        else {
            return false;
        }
    }
    
    //Metodo punto 2: mostrarResultado,
    public void mostrarResultado (boolean igualdad) {
        if (igualdad) {
            System.out.println("Los numeros son iguales");
        }
        else {
            System.out.println("Los números son diferentes");
        }
    }
    
    //Metodo punto 5: ifTernario
    public int ifTernario (int i) {
        //Estructura ifTernario (condicion) ? valor1 : valor2
        return (i < 10) ? i * 100 :i * 10;
    }
    
    //Metodo punto 5: ifEstandar
    public int ifEstandar (int i) {
        if (i < 10) {
            return i * 100;
        }
        else {
            return i * 10;
        }
    }
    
}
