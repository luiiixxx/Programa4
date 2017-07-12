package paquete_principal;
public class perro {
    
    //Propiedades del perro
    private String nombre;
    private String dice;
    private int edad;    //Metodo constructor
    public perro () {
        
    }
    
    //Metodo punto 3: asignarNombre, le asigna un nombre al perro
    public void asignarNombre (String nombre_perro) {
        this.nombre = nombre_perro;
    }
    
    //Metodo punto 3: obtenerNombre, retorna el nombre del perro
    public String obtenerNombre () {
        return this.nombre;
    }
    
    //Metodo punto 3: asignarDice, le asigna lo que dice el perro
    public void asignarDice (String dice_perro) {
        this.dice = dice_perro;
    }
    
    //Metodo punto 3: obtenerDice, retorna lo que dice el perro
    public String obtenerDice () {
        return this.dice;
    }
    
    //Metodo punto 4: asignarEdad
    public void asignarEdad (int edad_perro) {
        this.edad = edad_perro;
    }
    
    //Metodo punto 4: obtenerEdad
    public int obtenerEdad () {
        return this.edad;
    }
}
