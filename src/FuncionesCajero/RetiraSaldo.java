package FuncionesCajero;

public class RetiraSaldo extends ClaseAbstractaPrincipal{


    @Override
    public void Transacciones() {
        System.out.print("¿Cuanto deseas retirar?: ");
        Retirada(); // invocamos desde la clase hija al metodo Retirada de la clase Principal (padre)
        if (retiro <= getSaldo()) {// puedes acceder a variables globales gracias a la HERENCIA. Si el retiro es menor, se lo permitimos
            transaccion = getSaldo();
            setSaldo(transaccion-retiro); //transaccion será el saldo actual del user y se restará la cantidad que el usuario desea (y puede gracias a que está validado)
            System.out.println("---------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo()); // ya está actualizado gracias al setter setSaldo de antes
            System.out.println("---------------------------------");
        } else { //en caso de que quiera retirar MAS de lo que tiene
            System.out.println("-------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("-------------------");

        }
    }
}
