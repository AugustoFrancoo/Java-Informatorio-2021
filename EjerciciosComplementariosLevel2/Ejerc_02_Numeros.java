import java.util.* ;

public class Ejerc_02_Numeros{
    
    public static void main(String[] arg) {
        
        ArrayList<String> numeros = new ArrayList<String>();

        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 5 números enteros ...");
        
        for (int i = 0; i < 5; i++) 
            {
                numeros.add(scan.nextLine());
                
            }
        
        System.out.println("Ingrese un numero entero para el inicio...");
        numeros.add(0,scan.nextLine());
        System.out.println("Ingrese un numero entero para el final...");
        numeros.add(numeros.size(),scan.nextLine());
       
        scan.close();
        System.out.println("Elementos antes de agregar ...");   
        for (int i = 1; i < (numeros.size()-1); i++) 
            {
                System.out.print(numeros.get(i)+" ");
            }
        System.out.println();
        System.out.println("Tamaño antes de agregar: "+ (numeros.size()-2)); 
                  
        System.out.println("Elementos despues de agregar ...");   
        for (int i = 0; i < (numeros.size()); i++) 
            {
                System.out.print(numeros.get(i)+" ");
            }
        System.out.println("\n" + "Tamaño despues de agregar: "+numeros.size()); 
          
    }
}
