import java.util.* ;

public class Ejerc_03_For {
    
    public static void main(String[] arg) {
        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese un número entero para cálcular la secuncia ...");
        int entrada = scan.nextInt();
        
        for (int i = 1; i <= entrada; ++i)
            {
                for (int j = 1; j <= i; ++j) 
                { 
                    System.out.print( j + " " );
                }
                System.out.println();
            }
        scan.close();
    }
}
