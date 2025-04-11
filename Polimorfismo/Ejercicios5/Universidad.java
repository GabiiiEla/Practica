//Se hace referencia a algunos de los diferentes ambientes de la Universidad
//mediante las siguientes clases:
//a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
//b) Crear un método mostrar() para mostrar los datos de cada objeto
//c) Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente

class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    public void mostrar() {
        System.out.println(" Oficina");
        System.out.println("Número de Sillas: " + nroSillas);
        System.out.println("Número de Escritorios: " + nroEscritorios);
        System.out.println("Número de Estanterías: " + nroEstanterias);
        System.out.println("Cantidad Total de Muebles: " + cantidadMuebles());
    }

    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }

    public int cantidadMuebles(String detalle) {
        System.out.println("Detalle de muebles de la oficina: " + detalle);
        return nroSillas + nroEscritorios + nroEstanterias;
    }

    public int getNroSillas() {
        return nroSillas;
    }

    public int getNroEscritorios() {
        return nroEscritorios;
    }

    public int getNroEstanterias() {
        return nroEstanterias;
    }
}

class Aula {
    private String nombre;
    private int capacidad;
    private int nropupitres;

    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }

    // b) Método mostrar()
    public void mostrar() {
        System.out.println("\n Aula ");
        System.out.println("Nombre del Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Número de Pupitres: " + nropupitres);
        System.out.println("Cantidad Total de Muebles: " + cantidadMuebles());
    }

    public int cantidadMuebles() {
        return nropupitres; 
    }

    public int cantidadMuebles(String detalle) {
        System.out.println("Detalle de muebles del aula: " + detalle);
        return nropupitres;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNropupitres() {
        return nropupitres;
    }
}

class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }

    public void mostrar() {
        System.out.println("\n Laboratorio ");
        System.out.println("Nombre del Laboratorio: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Número de Mesas: " + nroMesas);
        System.out.println("Número de Sillas: " + nroSillas);
        System.out.println("Cantidad Total de Muebles: " + cantidadMuebles());
    }

    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }

    public int cantidadMuebles(String detalle) {
        System.out.println("Detalle de muebles del laboratorio: " + detalle);
        return nroMesas + nroSillas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNroMesas() {
        return nroMesas;
    }

    public int getNroSillas() {
        return nroSillas;
    }
}

public class Universidad {
    public static void main(String[] args) {
        Oficina oficina1 = new Oficina(5, 3, 2);
        Oficina oficina2 = new Oficina(2, 1, 1);

        Aula aula1 = new Aula("buobort 5", 100, 100);
        Aula aula2 = new Aula("Aula 205", 30, 30);

        Laboratorio laboratorio1 = new Laboratorio("Lab. Química", 25, 10, 25);

        System.out.println("\n Ambientes de la Universidad ");
        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        laboratorio1.mostrar();

        System.out.println("\n Cantidad de Muebles con Detalle ");
        System.out.println("Oficina 1 - Total Muebles: " + oficina1.cantidadMuebles("Sillas, escritorios y estanterías"));
        System.out.println("Aula 205 - Total Muebles: " + aula2.cantidadMuebles("Pupitres"));
        System.out.println("Laboratorio Química - Total Muebles: " + laboratorio1.cantidadMuebles("Mesas y sillas"));
    }
}