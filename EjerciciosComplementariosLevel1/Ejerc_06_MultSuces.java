import java.util.* ;

public class Ejerc_06_MultSuces {
    
    public static void main(String[] arg) {
        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese dos números enteros para hallar la potencia por multiplicaciiones sucesivas ...");
        int uno = scan.nextInt();
        int dos = scan.nextInt();
        int mult = 1;
        
        if (uno == dos && dos == 0)
            {
                System.out.println("0  elevado a 0 es un indeterminación");
            }
        else 
            {
                for (int i = 1; i <= dos; ++i)
                    {
                    mult = mult * uno;
                    }
                System.out.println(uno + " elevado a " + dos + " = " + mult);  
                scan.close();
            }
    }
}
