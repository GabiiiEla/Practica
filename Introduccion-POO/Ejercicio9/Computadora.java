//Realiza la abstracción de una Computadora
//a) Muestra los componentes principales de la computadora
//b) Muestra el estado de la computadora (encendido o apagado)
//c) Crea una instancia y simula encender y apagar la computadora.

public class Computadora {
    private String procesador;
    private String memoriaRAM;
    private String discoDuro;
    private String tarjetaGrafica;
    private String placaMadre;
    private boolean encendida;

    public Computadora(String procesador, String memoriaRAM, String discoDuro, String tarjetaGrafica, String placaMadre) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.tarjetaGrafica = tarjetaGrafica;
        this.placaMadre = placaMadre;
        this.encendida = false; 
    }

    public void mostrarComponentes() {
        System.out.println(" \nComponentes de la Computadora ");
        System.out.println("\nProcesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM);
        System.out.println("Disco Duro: " + discoDuro);
        System.out.println("Tarjeta Gráfica: " + tarjetaGrafica);
        System.out.println("Placa Madre: " + placaMadre);
    }

    public void mostrarEstado() {
        if (encendida) {
            System.out.println("\nLa computadora está: Encendida");
        } else {
            System.out.println("La computadora está: Apagada");
        }
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("\nEncendiendo la computadora");
        } else {
            System.out.println("La computadora ya está encendida");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("\nApagando la computadora");
        } else {
            System.out.println("La computadora ya está apagada");
        }
    }

    public static void main(String[] args) {
        Computadora miComputadora = new Computadora("Intel Core i7", "16GB DDR4", "1TB SSD", "NVIDIA GeForce RTX 3060", "ASUS ROG Strix Z690");

        miComputadora.mostrarComponentes();
        miComputadora.mostrarEstado();
        miComputadora.encender();
        miComputadora.mostrarEstado();
        miComputadora.encender();
        miComputadora.apagar();
        miComputadora.mostrarEstado();
        miComputadora.apagar();
    }
}