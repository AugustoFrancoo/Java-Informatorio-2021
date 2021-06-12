import java.util.* ;

public class Ejerc_06_Empleados {
    public static void main(String[] args) {
        HashSet<Empleado> Empleados = new HashSet<>();
        HashMap<Integer, Integer> salarios = new HashMap<>();

        Empleados.add(new Empleado("Juan Perez", 12538963, 1, 550));
        Empleados.add(new Empleado("Luis Rodriguez", 37520845, 2, 320));
        Empleados.add(new Empleado("Raul Gomez", 25654789, 3, 1200));
        Empleados.add(new Empleado("Fernando Fernandez", 18963147, 6, 720));

        for (Empleado  unEmpleado : Empleados) {
            salarios.put(unEmpleado.getDni(), unEmpleado.getSueldo());
        }
        System.out.println(salarios);
    }
}

class Empleado {
    String nombreyap;
    int dni;
    int horas;
    int valor;

    public Empleado(String nombreyap, int dni, int horas, int valor) 
        {
            this.nombreyap = nombreyap;
            this.dni = dni;
            this.horas = horas;
            this.valor = valor;
        }

    public int getDni() 
        {
            return dni;
        }

    public int getSueldo() 
        {
            return this.horas * this.valor;
        }
}
