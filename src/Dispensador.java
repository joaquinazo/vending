/**
 * Created by joaquinlopezamador on 05/10/2016.
 */
public class Dispensador {
    int precio,cantidad;
    String producto;
    Clasificador clasificador;

    public Dispensador(int precio, int cantidad, String producto) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.producto = producto;
    }


    public void dispensar(String producto){
        clasificador.hmDepositos.get(producto).cantidad -=1;
        clasificador.saldo = clasificador.saldo - clasificador.hmDepositos.get(producto).precio;


    }
}
