package FuncionesCajero;

public class IngresaSaldo extends ClaseAbstractaPrincipal {


    @Override
    public void Transacciones() {
        System.out.print("¿Cuanto deseas ingresar?");
        Deposito(); //se le llama desde aqui al metodo de la clase padre para poder trabajar con ello

        transaccion = getSaldo(); //para poder utilizar el saldo
        setSaldo(transaccion + deposito); //para establecer el nuevo saldo sumando el previo mas lo que ingresa el user
        System.out.println("---------------------------------");
        System.out.println("Ingresaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo()); // consulta de la variable saldo
        System.out.println("---------------------------------");
    }
}
