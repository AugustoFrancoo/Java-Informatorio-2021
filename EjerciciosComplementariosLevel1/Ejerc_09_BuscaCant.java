import java.util.* ;

public class Ejerc_09_BuscaCant{
  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Ingrese el texto para la busqueda: ");
      String texto = scan.nextLine();
      System.out.println("Ingrese letra a buscar: ");
      String busca = scan.nextLine();
      scan.close();
      int cant = 0;
      for(int i = 1; i <= texto.length(); i++ ){
          if ( texto.charAt(i - 1) == busca.charAt(0) ) {
              cant = cant + 1;
          }
      }
      System.out.println(cant);
  }
}