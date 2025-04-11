//Sea la clase Videojuego:
//a) Instanciar al menos 2 videojuegos
//b) Sobrecargar el constructor 2 veces
//c) Implementar un método mostrar()
//d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
//   solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar

public class VideoJuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public VideoJuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 0;
    }

    public VideoJuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }

    public VideoJuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Cantidad de Jugadores: " + this.cantidadJugadores);
        System.out.println("--------------------");
    }

    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("Se agregó 1 jugador a " + this.nombre);
        System.out.println("Nueva cantidad de jugadores: " + this.cantidadJugadores);
    }

    public void agregarJugadores(int cantidad) {
        if (cantidad > 0) {
            this.cantidadJugadores += cantidad;
            System.out.println("Se agregaron " + cantidad + " jugadores a " + this.nombre);
            System.out.println("Nueva cantidad de jugadores: " + this.cantidadJugadores);
        } else {
            System.out.println("La cantidad de jugadores a agregar debe ser mayor que cero.");
        }
    }
    public static void main(String[] args) {
        
        VideoJuego juego1 = new VideoJuego("Super Mario Odyssey", "Nintendo Switch", 2);
        VideoJuego juego2 = new VideoJuego("The Last of Us Part II", "PlayStation 5");
        VideoJuego juego3 = new VideoJuego("Class Royale","Movil"); 
    
        System.out.println(" Videojuegos Instanciados ");
        juego1.mostrar();
        juego2.mostrar();
        juego3.mostrar();
    
        System.out.println("\nAgregando Jugadores ");
        juego1.agregarJugadores(); 
        juego2.agregarJugadores(3); 
        juego3.agregarJugadores(2); 
        juego2.agregarJugadores(-1); 
        System.out.println("\nVideojuegos Después de Agregar Jugadores ");
        juego1.mostrar();
        juego2.mostrar();
        juego3.mostrar();
    }

}



