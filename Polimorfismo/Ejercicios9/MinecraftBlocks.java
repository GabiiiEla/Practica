//Para los bloques del juego Minecraft se usará los siguientes objetos:
//a) Crear e instanciar al menos 2 bloques de cada tipo
//b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
//c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
//   orientaciones (por ejemplo, en el suelo o en la pared).
//d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
//   distintos mensajes según el tipo de bloque y que puede suceder al romperlos.

class Bloque {
    private String tipo;

    public Bloque(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void accion() {
        System.out.println("El bloque realiza una acción genérica.");
    }

    public void colocar() {
        System.out.println("El bloque se coloca en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("El bloque se coloca en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("El bloque se rompe.");
    }
}

class BloqueCofre extends Bloque {
    private int capacidad;
    private int resistencia;

    public BloqueCofre(String tipo, int capacidad, int resistencia) {
        super(tipo);
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    @Override
    public void accion() {
        System.out.println("Se abre el cofre. Capacidad: " + capacidad + ", Resistencia: " + resistencia);
    }

    @Override
    public void romper() {
        System.out.println("Se rompe el cofre y su contenido puede dispersarse.");
    }
}

class BloqueTnt extends Bloque {
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        super(tipo);
        this.daño = daño;
    }

    @Override
    public void accion() {
        System.out.println("¡La TNT explota! Daño: " + daño);
    }

    @Override
    public void romper() {
        System.out.println("Se golpea la TNT. ¡Ten cuidado, podría explotar!");
    }
}

class BloqueHorno extends Bloque {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String tipo, String color, int capacidadComida) {
        super(tipo);
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    @Override
    public void accion() {
        System.out.println("Se interactúa con el horno de color " + color + ". Capacidad de comida: " + capacidadComida);
    }

    @Override
    public void romper() {
        System.out.println("Se rompe el horno y deja de cocinar.");
    }
}

public class MinecraftBlocks {
    public static void main(String[] args) {
        BloqueCofre cofre1 = new BloqueCofre("Cofre de roble", 27, 5);
        BloqueCofre cofre2 = new BloqueCofre("Cofre de abeto", 27, 4);

        BloqueTnt tnt1 = new BloqueTnt("TNT normal", 80);
        BloqueTnt tnt2 = new BloqueTnt("TNT grande", 120);

        BloqueHorno horno1 = new BloqueHorno("Horno de piedra", "gris", 2);
        BloqueHorno horno2 = new BloqueHorno("Alto horno", "negro", 1);

        System.out.println("\n Acciones de los bloques ");
       
        cofre1.accion();
        tnt1.accion();
        horno1.accion();

        System.out.println("\n Colocar bloques ");
        cofre2.colocar();
        tnt2.colocar("pared");
        horno2.colocar("techo");

        System.out.println("\n Romper bloques ");
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
    }
}
