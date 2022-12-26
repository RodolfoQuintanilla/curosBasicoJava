import java.util.Scanner;

public class SueldoOperario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horasTrabajadas;
        float costoHora;
        float sueldo;

        System.out.println("Ingrese las Horas trabajadas:");
        horasTrabajadas = teclado.nextInt();

        System.out.println("Ingresa el costo por hora:");
        costoHora = teclado.nextFloat();
        sueldo = horasTrabajadas * costoHora;
        System.out.println("El Total a pagar es: $" + sueldo);

    }
}
