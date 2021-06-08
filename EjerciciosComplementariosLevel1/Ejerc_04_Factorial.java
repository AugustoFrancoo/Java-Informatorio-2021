import java.util.* ;

public class Ejerc_04_Factorial {
    
    public static void main(String[] arg) {
        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese un número entero para cálcular el factorial ...");
        int entrada = scan.nextInt();
        int n = 1;
        
        for (int i = 1; i <= entrada; ++i)
            {
               n = n * i;
            }
        System.out.println("El factorial de "+ entrada + " es: " + n);  
        scan.close();
    }
}
