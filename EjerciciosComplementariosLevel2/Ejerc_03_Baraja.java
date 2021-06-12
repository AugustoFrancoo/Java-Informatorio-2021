import java.util.* ;

public class Ejerc_03_Baraja{
  public static void main(String[] args) {

      ArrayList<Integer> baraja = new ArrayList<Integer>() ;
      
      //Cargo la baraja
      for(int i = 0; i < 10; i++ )
        {
            baraja.add(i+1);
        }
      System.out.println("Elementos de la baraja: ");
      imprimir(baraja);

      System.out.println("Elementos de la baraja en orden inverso: ");
      Collections.reverse(baraja);
      imprimir(baraja);

      System.out.println("Elementos de la baraja mezclados: ");
      Collections.shuffle(baraja);
      imprimir(baraja);
     
  }
  
  public static void imprimir (ArrayList<Integer> lista)
    {
        for(int i = 0; i < lista.size(); i++ )
        {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
}
