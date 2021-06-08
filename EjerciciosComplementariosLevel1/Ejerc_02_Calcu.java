import java.util.* ;

public class Ejerc_02_Calcu {
    
    public static void main(String[] arg) {
        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese dos números enteros para realizar los cálculos ...");
        int uno = scan.nextInt();
        int dos = scan.nextInt();

        int suma = uno + dos;
        System.out.println(uno + " + " +(dos) + " = " + suma);
        int resta = uno - dos;
        System.out.println(uno + " - " + dos + " = " + resta);
        int mult = uno * dos;
        System.out.println(uno + " * " + dos + " = " + mult);

        
        if (uno > dos )
            {
                int div = uno / dos;
                System.out.println(uno + " / " + dos + " = " + div);
            }
        else
            {
                System.out.println("Error: " + uno + " debe ser mayor a " + dos + " para calcular una división de enteros");
            }
        
        int mod = uno % dos;
        System.out.println(uno + " % " + dos + " = " + mod);
        
        scan.close();
    }
}
