
package pair;

//import java.util.Scanner;

/**
 *
 * @author luisc
 * @param <T>
 * @param <U>
 
 */
public class Pair<T,U> {
   
    private final T first;
    private final U second;
    private String nombre;
    private int año;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
    
    
    public static void main(String[] args) {
        
        Pair<String,Integer> persona = new Pair<>("Lucas",25);
        System.out.println("Edad y Nombre" + persona);
        System.out.println("Nombre:" + persona.getFirst());
        System.out.println("Edad:" + persona.getSecond());
         
        Pair<String,String> datos = new Pair<>("Sanitas","16-06-1999");
        System.out.println("Eps y Fecha de nacimiento" + datos);
        System.out.println("Eps:" + datos.getFirst());
        System.out.println("Fecha de nacimiento:" + datos.getSecond());
    }
    
}
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingresa tu nombre");
        //String nombre = scanner.nextLine();
        //System.out.println("Ingresa tu edad");
        //int año = scanner.nextInt();
        
        //scanner.nextLine();
        //System.out.print("Ingrese su EPS: ");
        //String eps = scanner.nextLine();
        //System.out.print("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
        //String fecha = scanner.nextLine();
        
        
        //Pairt<String,Integer> persona = new Pairt<>(nombre,año);
       
        //System.out.println("Nombre:" + persona.getFirst());
        //System.out.println("Edad:" + persona.getSecond());
        
        //Pairt<String,String>  datos = new Pairt<>(eps,fecha);
         
        //System.out.println("Eps:" + datos.getFirst());
        //System.out.println("Fecha de nacimiento" + datos.getSecond());