import java.util.* ;

public class Ejerc_04_Cursos{
  public static void main(String[] args) {

    ArrayList<String> estudiantes = new ArrayList<String>() ;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el nombre de los estudiantes: ... ");
    
    for(int i = 0; i < 12; i++ )
        {
            estudiantes.add(scan.nextLine());
        }
    scan.close();
    
    ArrayList<String> curso1 = new ArrayList<String>(estudiantes.subList(0, 4)) ;
    ArrayList<String> curso2 = new ArrayList<String>(estudiantes.subList(4, 8)) ;
    ArrayList<String> curso3 = new ArrayList<String>(estudiantes.subList(8, 12)) ;


    System.out.println("Estudiantes del curso 1: ");
    imprimir(curso1);

    System.out.println("Estudiantes del curso 2: ");
    imprimir(curso2);

    System.out.println("Estudiantes del curso 3: ");
    imprimir(curso3);
    
  }
  
  public static void imprimir (ArrayList<String> lista)
    {
        for(int i = 0; i < lista.size(); i++ )
        {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
}
