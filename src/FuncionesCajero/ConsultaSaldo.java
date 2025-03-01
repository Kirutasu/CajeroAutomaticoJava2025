package FuncionesCajero;

public class ConsultaSaldo extends ClaseAbstractaPrincipal  {


    @Override
    public void Transacciones() {
        System.out.println("---------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
