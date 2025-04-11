import java.util.ArrayList;
import java.util.List;

public class Celular {
    private static final int MAX_APLICACIONES = 20;
    private static final int MAX_ESPACIO = 1024; // en MB
    private List<String> aplicacionesInstaladas;
    private int espacioOcupado; // en MB
    private double bateria; // Porcentaje de batería (0 al 100)
    private boolean encendido;

    public Celular() {
        this.aplicacionesInstaladas = new ArrayList<>();
        this.espacioOcupado = 0;
        this.bateria = 100.0;
        this.encendido = true;
    }

    // a) Método para instalar una nueva aplicación
    public boolean instalarAplicacion(String nombreAplicacion, int pesoMB) {
        if (!encendido) {
            System.out.println("El celular está apagado. No se puede instalar la aplicación.");
            return false;
        }
        if (aplicacionesInstaladas.size() < MAX_APLICACIONES && (espacioOcupado + pesoMB) <= MAX_ESPACIO) {
            aplicacionesInstaladas.add(nombreAplicacion);
            espacioOcupado += pesoMB;
            System.out.println(nombreAplicacion + " instalada correctamente. Espacio ocupado: " + espacioOcupado + "MB.");
            return true;
        } else {
            System.out.println("No se pudo instalar " + nombreAplicacion + ". Límite de aplicaciones o espacio alcanzado.");
            return false;
        }
    }

    // b) Método para utilizar una aplicación
    public void utilizarAplicacion(String nombreAplicacion, int tiempoUsoMinutos) {
        if (!encendido) {
            System.out.println("El celular está apagado. No se puede utilizar la aplicación.");
            return;
        }
        if (aplicacionesInstaladas.contains(nombreAplicacion)) {
            int tiempoEnDecenasMinutos = tiempoUsoMinutos / 10;
            if (tiempoUsoMinutos % 10 != 0) {
                tiempoEnDecenasMinutos++; // Consideramos fracciones de 10 minutos
            }
            int pesoMB = obtenerPesoAplicacion(nombreAplicacion); // Necesitarías una forma de almacenar el peso
            double consumoBateria = 0;

            if (pesoMB > 250) {
                consumoBateria = tiempoEnDecenasMinutos * 5.0;
            } else if (pesoMB > 100) {
                consumoBateria = tiempoEnDecenasMinutos * 2.0;
            } else {
                consumoBateria = tiempoEnDecenasMinutos * 1.0;
            }

            if (bateria >= consumoBateria) {
                bateria -= consumoBateria;
                System.out.println("Utilizando " + nombreAplicacion + " durante " + tiempoUsoMinutos + " minutos. Batería restante: " + bateria + "%.");
            } else {
                System.out.println("Batería insuficiente para utilizar " + nombreAplicacion + " durante " + tiempoUsoMinutos + " minutos.");
                apagarCelular();
            }
        } else {
            System.out.println(nombreAplicacion + " no está instalada.");
        }
    }

    // Método auxiliar (simulado) para obtener el peso de una aplicación
    private int obtenerPesoAplicacion(String nombreAplicacion) {
        // En una implementación real, esto podría venir de una estructura de datos
        if (nombreAplicacion.equals("JuegoPesado")) {
            return 300;
        } else if (nombreAplicacion.equals("EditorFotos")) {
            return 150;
        } else {
            return 50;
        }
    }

    // c) Método para mostrar el porcentaje de batería restante
    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%.");
    }

    // d) Método para apagar el celular
    private void apagarCelular() {
        this.encendido = false;
        System.out.println("¡Celular apagado!");
    }

    public static void main(String[] args) {
        Celular miCelular = new Celular();

        miCelular.instalarAplicacion("Whatsapp", 30);
        miCelular.instalarAplicacion("Instagram", 80);
        miCelular.instalarAplicacion("book", 350);
        miCelular.instalarAplicacion("EditorFotos", 120);
        miCelular.instalarAplicacion("Library", 20);

        miCelular.mostrarBateria();

        miCelular.utilizarAplicacion("Whatsapp", 25);
        miCelular.utilizarAplicacion("Book", 15);
        miCelular.utilizarAplicacion("Instagram", 60);
        miCelular.utilizarAplicacion("EditorFotos", 30);
        miCelular.utilizarAplicacion("Library", 40);

        miCelular.mostrarBateria();

        // Intentar usar el celular con poca batería
        miCelular.utilizarAplicacion("Book", 60);

        miCelular.mostrarBateria();
        miCelular.instalarAplicacion("NuevaApp", 10); // No debería instalarse si está apagado
        miCelular.utilizarAplicacion("Whatsapp", 10); // No debería funcionar si está apagado
    }
}