import FuncionesCajero.ClaseAbstractaPrincipal;
import FuncionesCajero.ConsultaSaldo;

public class Main {
    public static void main(String[] args) {

        ClaseAbstractaPrincipal mensajero = new ConsultaSaldo();
        mensajero.setSaldo(2000);
        mensajero.Operaciones();

    }
}