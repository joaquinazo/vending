/**
 * Created by joaquinlopezamador on 05/10/2016.
 */
public class Deposito {
    int precio,cantidad;

    public Deposito(int precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void restarCantidad(){
        this.cantidad--;
    }
}
