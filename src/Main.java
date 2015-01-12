import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Plaza plaza = new Plaza();
        
        System.out.println("EspacioPublico");
        System.out.println("    Nombre: ");
        String nombre=sc.next();
        plaza.setNombre(nombre);
        System.out.println("    Direccion: ");
        String direccion=sc.next();
        plaza.setDireccion(direccion);
        System.out.println("    Capacidad: ");
        int capacidad=sc.nextInt();
        plaza.setCapacidad(capacidad);
        
        System.out.println("\nEspacioPublico");
        System.out.println("Nombre: "+plaza.getNombre()+" Direccion: "+plaza.getDireccion()+" Capacidad: "+plaza.getCapacidad());
    }
}    