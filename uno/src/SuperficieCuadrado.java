import java.util.Scanner;

public class SuperficieCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;
        int superficie;
        System.out.print("Ingresa el lado: ");
        lado = teclado.nextInt();
        superficie = lado * lado;
        System.out.println("La superficie es: " + superficie);
    }
}
