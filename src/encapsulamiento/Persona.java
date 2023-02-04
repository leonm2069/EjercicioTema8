package encapsulamiento;


public class Persona {
    
    private String nombre;
    private long telefono;
    private int edad;

    public Persona (){
    }
    
    public Persona(String nombre, long telefono, int edad){
        this.nombre = nombre;
        this.telefono = telefono;
        this. edad = edad;
    
    }
    
    public int getEdad (){
        return edad;
    }
    public void setEdad (){
        this.edad = edad;
    }
        public long getTelefono() {
        return telefono;
        }
    public String getNombre() {
        return nombre;
    }
    
    
}

