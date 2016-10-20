import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by joaquinlopezamador on 05/10/2016.
 */
public class Clasificador {
    Dispensador dispensador;
    int saldo = 100;
    Interaccion interaccion;
    Output output = new Output();
    HashMap<Integer, Deposito> hmDepositos;
    Map<String, Dispensador> hmDispensador;
    ArrayList<Integer> arrayCoin = new ArrayList<Integer>();
    int[] numeros = {200, 100, 50, 20, 10, 5};

    public void setInteraccion(Interaccion interaccion) {

        this.interaccion = interaccion;
    }

    public void insertCoin(int coin) {
        int i = 0;
        if (hmDepositos.containsKey(coin)){
            try {
                hmDepositos.get(coin).cantidad += 1;
            } catch (Exception e) {

            }
        saldo = saldo + coin;
        System.out.println(saldo);
    }else {
            System.out.println("Introduzca una moneda valida");
        }
    }


    public void refundCash() {
        int i = 0;
        try {
            while (saldo > 0) {
                System.out.println("--------------------------------------------");
                if (saldo >= hmDepositos.get(numeros[i]).precio && hmDepositos.get(numeros[i]).cantidad > 0) {
                    System.out.println("cantidad de monedas en deposito antes de restar " + hmDepositos.get(numeros[i]).cantidad);
                    hmDepositos.get(numeros[i]).restarCantidad();
                    System.out.println("cantidad de monedas en deposito antes de restar " + hmDepositos.get(numeros[i]).cantidad);
                    System.out.println("saldo antes de restar " + saldo);
                    saldo = saldo - hmDepositos.get(numeros[i]).precio;
                    System.out.println("saldo despues de restar " + saldo);
                    System.out.println("Dispensador" + hmDepositos.get(numeros[i]).precio + " " + "cantidad " + hmDepositos.get(numeros[i]).cantidad);
                } else {
                    i++;
                }
            }
        } catch (Exception e) {

        }


    }


    public void selectProduct(String producto) {
        try {
            if (saldo >= hmDispensador.get(producto).precio) {
                saldo = saldo - hmDispensador.get(producto).precio;

                hmDispensador.get(producto).cantidad -= 1;

            } else {
                System.out.println("Su saldo no es suficiente");
            }
        } catch (Exception n) {

        }


    }

    public void getProductos() {
        Iterator it = hmDispensador.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Dispensador> entrada = (Map.Entry<String, Dispensador>) it.next();
            System.out.println("Producto: " + entrada.getKey() + "  --> Precio : " + entrada.getValue().precio);


        }
    }


    public Clasificador() {
        hmDepositos = new HashMap<Integer, Deposito>();
        hmDepositos.put(5, new Deposito(5, 10));
        hmDepositos.put(10, new Deposito(10, 10));
        hmDepositos.put(20, new Deposito(20, 10));
        hmDepositos.put(50, new Deposito(50, 10));
        hmDepositos.put(100, new Deposito(100, 10));
        hmDepositos.put(200, new Deposito(200, 10));
        //Productos

        hmDispensador = new HashMap<String, Dispensador>();
        hmDispensador.put("Cocacola", new Dispensador(100, 4, "Cocacola"));
        hmDispensador.put("Fanta", new Dispensador(100, 4, "Cocacola"));


    }

}
