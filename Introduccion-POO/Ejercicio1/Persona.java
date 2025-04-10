//1. Crea una clase Persona con nombre, edad y ciudad
//   a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
//   b) Crea tres personas y muestra su saludo
//   c) Agrega un método para verificar si es mayor de edad

public class Persona {
    public String nombre;
    public int edad;
    public String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre +", tengo " + edad + " de edad y soy de la ciudad de " + ciudad);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Erick", 23, "Lima");
        Persona persona2 = new Persona("Jared", 15, "La Paz");
        Persona persona3 = new Persona("Gabi", 22, "Chicago");

       
        persona1.saludar();
        persona2.saludar();
        persona3.saludar();

        System.out.println("\nVerificando si son mayores de edad:");
        System.out.println(persona1.nombre + " es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println(persona2.nombre + " es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println(persona3.nombre + " es mayor de edad: " + persona3.esMayorDeEdad());
    }
}