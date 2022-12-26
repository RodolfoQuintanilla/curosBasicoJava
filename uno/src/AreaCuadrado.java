import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;
        int resultado;

        System.out.println("Ingresa el valor de lado del cuadrado: ");
        lado = teclado.nextInt();
        resultado = lado * 4;

        System.out.println("El Area de el cuadrado es: " + resultado);
    }
}
