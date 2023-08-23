//ALEX JOSEPH PENAGOS VALENCIA
package POO_1;

public class POO_1 {

    public static void main(String[] args) {
        int edad = 25;
        double temperatura = 98.6;
        char calificacion = 'A';
        boolean activo = true;
        String nombre = "Alex";
        System.out.println("Hola " + nombre);
        //Crear una instancia de la clase POO_1
        POO_1 instance = new POO_1();

        // Llama al metodo action en la instancia creada
        int result = instance.sum(1, 2);
        System.out.println(result);
    }

    public int sum(int num1, int num2) {
        // System.out.println("Result: " + num1 + num2);
        return (num1 + num2);

    }

}
