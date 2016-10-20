import java.util.Scanner;

/**
 * Created by joaquinlopezamador on 07/10/2016.
 */
public class Interaccion {
    Clasificador clasificador;

    public void setClasificador(Clasificador clasificador) {
        this.clasificador = clasificador;
    }

    public void welcome() {
        System.out.println("Welcome to vending machine");
        Boolean blfin = false;
        Scanner scanner = new Scanner(System.in);
        while (!blfin) {
            System.out.println("Su saldo total es : " + clasificador.saldo + "ct");
            System.out.println("Choose: ");
            System.out.println("1.InsertCoin ");
            System.out.println("2.Refund Money: ");
            System.out.println("3.Productos: ");

            int eleccion = Integer.parseInt(scanner.nextLine());
            if (eleccion == 1) {
                System.out.println("Introduzca moneda");
                clasificador.insertCoin(scanner.nextInt());
                scanner.nextLine();

            }  else if (eleccion == 3) {
                clasificador.getProductos();
                Scanner sc = new Scanner(System.in);
                System.out.println("Selecciona producto: ");
                clasificador.selectProduct(sc.nextLine());
            } else if (eleccion == 2) {
                clasificador.refundCash();
            }
        }
    }
}
