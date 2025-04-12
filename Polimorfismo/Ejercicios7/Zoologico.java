class Animal {
    public String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void moverse() {
        System.out.println("El animal se mueve");
    }

    public String getNombre() {
        return nombre;
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " corre.");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " salta.");
    }
}

class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Pío pío!");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " vuela.");
    }
}

public class Zoologico {
    public static void main(String[] args) {
        
        Perro firulais = new Perro("Loqui-Chiquis");
        Gato misifu = new Gato("Pushi");
        Pajaro piolin = new Pajaro("Piolín");

        System.out.println("\n Sonidos de los Animales ");
        firulais.hacerSonido();
        misifu.hacerSonido();
        piolin.hacerSonido();

        System.out.println("\n Movimiento de los Animales -");
        firulais.moverse();
        misifu.moverse();
        piolin.moverse();
    }
}