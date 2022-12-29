import java.util.Scanner;

public class CutroDos {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        Scanner a1 = new Scanner(System.in);
        Scanner b1 = new Scanner(System.in);
        Scanner c1 = new Scanner(System.in);
        Scanner d1 = new Scanner(System.in);

        System.out.print("Ingresa el Primer Numero: ");
        a = a1.nextInt();
        System.out.print("Ingresa el segundo Numero: ");
        b = b1.nextInt();
        System.out.print("Ingresa el tercero Numero: ");
        c = c1.nextInt();
        System.out.print("Ingresa el cuarto Numero: ");
        d = d1.nextInt();

        System.out.println("La Suma de todos los numeros es: " + (a + b + c + d));
        System.out.println("La Multiplicacion de todos los numeros es: " + (a * b * c * d));
    }
}
