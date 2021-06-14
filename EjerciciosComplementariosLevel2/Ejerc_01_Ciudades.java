import java.util.* ;

public class Ejerc_01_Ciudades {
    
    public static void main(String[] arg) {
        
        ArrayList<String> ranking = new ArrayList<String>();

        // El objeto scan recibe los valores de entrada del usuario
        Scanner scan = new Scanner(System.in);
               
        System.out.println("Ingrese las ciudades o  T para terminar ...");
        String ciudad = scan.nextLine();

        while (ciudad.charAt(0) != 'T')
            {
                ranking.add(ciudad);
                ciudad = scan.nextLine();
            }
        
        scan.close();

        for (int i = 0; i < ranking.size(); i++) 
            {
                System.out.println("#"+(i+1)+" - "+ranking.get(i));
            }
            
        /* System.out.println("Hola "+ ciudad);
        scan.close(); */
    }
}
