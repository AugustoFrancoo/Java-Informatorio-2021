import java.util.* ;

public class Ejerc_07_Mayusc {
    
    public static void main(String[] arg) {
        HashMap<String, String> Abecedario = new HashMap<String, String>();
        cargarAbc(Abecedario);
        
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese el texto que desea convertir a mayúsculas ...");
        String s = scan.next();
        String d = "";
        String var;
        for (int i = 0; i < s.length(); i++) 
            {
            var = Character.toString(s.charAt(i));
            if (Abecedario.containsKey(var))
            {
                d = d + Abecedario.get(var);
            }
        
            }
        scan.close();
        System.out.println(d);
    }

    public static void cargarAbc(HashMap<String, String> Abecedario) {
        
        Abecedario.put("a", "A");
        Abecedario.put("b", "B");
        Abecedario.put("c", "C");
        Abecedario.put("d", "D");
        Abecedario.put("e", "E");
        Abecedario.put("f", "F");
        Abecedario.put("g", "G");
        Abecedario.put("h", "H");
        Abecedario.put("i", "I");
        Abecedario.put("j", "J");
        Abecedario.put("k", "K");
        Abecedario.put("l", "L");
        Abecedario.put("m", "M");
        Abecedario.put("n", "N");
        Abecedario.put("ñ", "Ñ");
        Abecedario.put("o", "O");
        Abecedario.put("p", "P");
        Abecedario.put("q", "Q");
        Abecedario.put("r", "R");
        Abecedario.put("s", "S");
        Abecedario.put("t", "T");
        Abecedario.put("y", "Y");
        Abecedario.put("z", "Z");
        Abecedario.put("á", "Á");
        Abecedario.put("é", "É");
        Abecedario.put("í", "Í");
        Abecedario.put("ó", "Ó");
        Abecedario.put("ú", "Ú");
      }
    }







    
   