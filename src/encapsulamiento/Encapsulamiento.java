package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
       
        Persona person = new Persona();
        Persona person2= new Persona ("Manuel", 385460221, 25);
        
        System.out.println("nombre: " + person2.getNombre());
        System.out.println("telefono: " + person2.getTelefono());
        System.out.println("edad: " + person2.getEdad());
    
    }
    
}
