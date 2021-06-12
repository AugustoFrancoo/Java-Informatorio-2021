import java.util.* ;

 public class Ejerc_07_FizzBuzz {
    public static void main(String[] args) {

        System.out.println(FizzBuzz(1,10 ));
    
    }
    public static ArrayList<String> FizzBuzz(int uno, int dos){
        if (uno < dos){
            ArrayList<String> lista = new ArrayList<String>();
            for(Integer i = uno; i < dos; i++ ){
                if (i % 2 == 0 && (i % 3 == 0)){
                    lista.add("FizzBuzz");
                }
                else if (i % 2 == 0){
                    lista.add("Fizz");
                }
                else if (i % 3 == 0){
                    lista.add("Buzz");
                }
                else {
                    lista.add(i.toString());
                }
           }
           return lista;
        }
        else{
                throw new RuntimeException("El primer numero debe ser menor al segundo");
            }         
    }

} 
