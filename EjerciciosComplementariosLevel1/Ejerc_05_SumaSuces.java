import java.util.* ;

public class Ejerc_05_SumaSuces {
    
    public static void main(String[] arg) {
        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese dos números enteros para hallar su producto por suma sucesivas ...");
        int uno = scan.nextInt();
        int dos = scan.nextInt();
        int suma = 0;
       
        for (int i = 1; i <= dos; ++i)
            {
               suma = suma + uno;
            }
        System.out.println(uno + " * " + dos + " = " + suma);  
        scan.close();
    }
}
