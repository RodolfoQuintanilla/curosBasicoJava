import java.util.Scanner;

public class CuatroNumeros {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        Scanner three = new Scanner(System.in);
        Scanner four = new Scanner(System.in);

        int nUno;
        int nDos;
        int nTres;
        int nCuatro;

        System.out.print("Ingresa Primer Numero: ");
        nUno = one.nextInt();
        System.out.print("Ingresa Segundo Numero: ");
        nDos = one.nextInt();
        System.out.print("Ingresa Tercero Numero: ");
        nTres = one.nextInt();
        System.out.print("Ingresa Cuarto Numero: ");
        nCuatro = one.nextInt();

        System.out.println("la suma de los dos primeros numeros es: " + (nUno + nDos));
        System.out.println("El Producto del 3 y 4 numero es: " + (nTres * nCuatro));
    }
}
