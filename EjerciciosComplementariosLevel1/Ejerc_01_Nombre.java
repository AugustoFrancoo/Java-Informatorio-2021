
import java.util.* ;

public class Ejerc_01_Nombre {
    
    public static void main(String[] arg) {
        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor a continuación ingrese su nombre ...");
        String name = scan.next();

        
        System.out.println("Hola "+ name);
        scan.close();
    }
}
