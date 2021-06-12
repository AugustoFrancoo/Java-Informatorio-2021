import java.util.* ;

public class Ejerc_05_Sueldos{
  public static void main(String[] args) {

    ArrayList<Integer> horas = new ArrayList<Integer>() ;
    ArrayList<Integer> valor = new ArrayList<Integer>() ;
    //Cargo las horas trabajadas
    horas.add(10);
    horas.add(14);
	horas.add(8);
	horas.add(9);
    horas.add(3);
    //Cargo el valor por hora
    valor.add(200);
    valor.add(320);
	valor.add(300);
	valor.add(420);
    valor.add(420);
    
    liquidacion(horas, valor);
  }
  
  public static void liquidacion (ArrayList<Integer> horas , ArrayList<Integer> valores)
    {
        ArrayList<Integer> totales = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++ )
        {
            totales.add(horas.get(i)*valores.get(i));
        }
        System.out.println(totales);
        Integer total = 0;
        for(int i = 0; i < 5; i++ )
        {
            total += totales.get(i);
        }
        System.out.println("Total final: $" + total);
    }
}
