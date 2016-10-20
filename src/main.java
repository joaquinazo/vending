/**
 * Created by joaquinlopezamador on 07/10/2016.
 */
public class main {
    public static void main(String[] args) {
        Clasificador clasificador = new Clasificador();
        Interaccion interaccion = new Interaccion();
        clasificador.setInteraccion(interaccion);
        interaccion.setClasificador(clasificador);
        clasificador.interaccion.welcome();


    }
}
