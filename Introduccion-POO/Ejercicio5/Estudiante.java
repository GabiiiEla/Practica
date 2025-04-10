//Crea una clase Estudiante con nombre, nota_1, nota_2
//    a) Agrega un método para calcular el promedio
//    b) Agrega un método para verificar si aprobó (promedio &gt;=6)
//    c) Crea tres estudiantes, muestra sus promedios y si aprobaron

package Ejercicio5;

public class Estudiante {
    public String nombre;
    public double nota_1;
    public double nota_2;

    public Estudiante(String nombre, double nota_1, double nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    public double calcularPromedio() {
        return (nota_1 + nota_2) / 2.0;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6.0;
    }

    public static void main(String[] args) {
      
        Estudiante estudiante1 = new Estudiante("Erick", 7.5, 8.0);
        Estudiante estudiante2 = new Estudiante("Nick", 5.0, 6.5);
        Estudiante estudiante3 = new Estudiante("Gabi", 9.9, 9.5);

        System.out.println("Estudiante 1 ");
        System.out.println("Nombre: " + estudiante1.nombre);
        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        System.out.println("¿Aprobó?: " + estudiante1.aprobo());

        System.out.println("\nEstudiante 2");
        System.out.println("Nombre: " + estudiante2.nombre);
        System.out.println("Promedio: " + estudiante2.calcularPromedio());
        System.out.println("¿Aprobó?: " + estudiante2.aprobo());

        System.out.println("\nEstudiante 3");
        System.out.println("Nombre: " + estudiante3.nombre);
        System.out.println("Promedio: " + estudiante3.calcularPromedio());
        System.out.println("¿Aprobó?: " + estudiante3.aprobo());
    }
}