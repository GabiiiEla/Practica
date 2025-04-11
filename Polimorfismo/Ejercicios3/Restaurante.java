//Un restaurante organiza a su personal mediante las siguientes clases:
//a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
//b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
//sumándole las horas extra, considerando el sueldo por hora y la propina
//en caso de los meseros.
//c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.

class Empleado {
    protected String nombre;
    protected int sueldoMes;

    public Empleado(String nombre, int sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldoMes() {
        return sueldoMes;
    }

    public float SueldoTotal() {
        return (float) sueldoMes;
    }

    public void mostrar(int sueldo) {
        if (this.sueldoMes == sueldo) {
            System.out.println("Nombre: " + this.nombre + ", Sueldo Mensual: " + this.sueldoMes);
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre + ", Sueldo Mensual: " + this.sueldoMes);
    }
}

class Cocinero extends Empleado {
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public float SueldoTotal() {
        return super.SueldoTotal() + (horasExtra * sueldoHora);
    }

    @Override
    public void mostrar() {
        System.out.println("--- Cocinero ---");
        super.mostrar();
        System.out.println("Horas Extra: " + horasExtra + ", Sueldo por Hora: " + sueldoHora);
        System.out.println("Sueldo Total: " + SueldoTotal());
    }
}

class Mesero extends Empleado {
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    @Override
    public float SueldoTotal() {
        return super.SueldoTotal() + (horasExtra * sueldoHora) + propina;
    }

    @Override
    public void mostrar() {
        System.out.println("--- Mesero ---");
        super.mostrar();
        System.out.println("Horas Extra: " + horasExtra + ", Sueldo por Hora: " + sueldoHora + ", Propina: " + propina);
        System.out.println("Sueldo Total: " + SueldoTotal());
    }
}

class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, int sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public void mostrar() {
        System.out.println("--- Administrativo ---");
        super.mostrar();
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo Total: " + SueldoTotal());
    }
}

public class Restaurante {
    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Luz Velez", 3000, 10, 25.5f);
        Mesero mesero1 = new Mesero("Gabi Arista", 5000, 15, 20.0f, 500.0f);
        Mesero mesero2 = new Mesero("Erick Gómez", 2600, 8, 21.0f, 350.0f);
        Administrativo administrativo1 = new Administrativo("Jared Garbert", 4000, "Contador");
        Administrativo administrativo2 = new Administrativo("Luke Hemming", 3500, "RRHH");

        System.out.println("\nPersonal del Restaurante ");
        cocinero1.mostrar();
        mesero1.mostrar();
        mesero2.mostrar();
        administrativo1.mostrar();
        administrativo2.mostrar();

        System.out.println("\nEmpleados con Sueldo Mensual de 2600 ");
        cocinero1.mostrar(2600);
        mesero1.mostrar(2600);
        mesero2.mostrar(2600);
        administrativo1.mostrar(2600);
        administrativo2.mostrar(2600);
    }
}