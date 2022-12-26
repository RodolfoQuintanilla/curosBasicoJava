import java.util.Scanner;

public class Secuela {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        int suma;
        int producto;

        System.out.print("Ingresa Primer Numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingresa segundo Numero: ");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        producto = num1 * num2;

        System.out.println("La el resultado de la sume es: " + suma);
        System.out.print("El resultado del producto es: " + producto);
    }

}
