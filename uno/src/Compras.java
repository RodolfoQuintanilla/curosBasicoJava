import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        double precio;
        int cantidad;

        Scanner dos = new Scanner(System.in);
        Scanner uno = new Scanner(System.in);

        System.out.println("Ingresa el Precio: ");
        precio = uno.nextInt();
        System.out.println("Ingresa la Cantidad; ");
        cantidad = dos.nextInt();

        System.out.println(" El Importe a Pagar es: " + (precio * cantidad));
    }
}
