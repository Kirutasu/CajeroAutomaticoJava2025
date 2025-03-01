package FuncionesCajero;

import java.util.Scanner;

public abstract class ClaseAbstractaPrincipal {

    protected int transacciones, retiro, deposito; // variables GLOBALES
    private static int saldo; //variable estatica PRIVADA para que no se pueda modificar el saldo del usuario
    Scanner scanner = new Scanner(System.in);


    public void Operaciones() {

        int entradaUsuario = 0; // variable LOCAL que debe inicializarse
        int flag = 0; // para controlar el bucle do-while, aunque prefiero mi version de si entrada vale 4 salir, ver pros y contras

        do {
            do {
                System.out.println("Por favor, selecciona una opcion: \n1. Consulta de saldo \n2. Retirada de efectivo: \n3. Deposito de efectivo: \n4. Salir: ");
                entradaUsuario = scanner.nextInt();

                if (entradaUsuario >= 1 && entradaUsuario <= 4) {
                    flag = 1;
                } else {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Opcion no disponible. Intentalo de nuevo, por favor.");
                    System.out.println("----------------------------------------------------");

                }
                switch (entradaUsuario) {
                    case (1):
                    case (2):
                    case (3):
                    case (4):
                    default:

                }
            } while (flag == 0);
        } while (flag == 2);

    }

}

}
