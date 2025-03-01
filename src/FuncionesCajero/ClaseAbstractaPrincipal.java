package FuncionesCajero;

import java.util.Scanner;

public abstract class ClaseAbstractaPrincipal {

    protected int transaccion, retiro, deposito; // variables GLOBALES
    private static int saldo; //variable estatica PRIVADA para que no se pueda modificar el saldo del usuario. Hay que crear getters y setters para ello
    Scanner scanner = new Scanner(System.in);


    public void Operaciones() {

        int flag = 0; // para controlar el bucle do-while, aunque prefiero mi version de si entrada vale 4 salir, ver pros y contras
        int entradaUsuario = 0; // variable LOCAL que debe inicializarse

        do {
            do {
                System.out.println("Por favor, selecciona una opcion: \n1. Consulta de saldo \n2. Retirada de efectivo: \n3. Deposito de efectivo: \n4. Salir: ");
                entradaUsuario = scanner.nextInt();

                if (entradaUsuario >= 1 && entradaUsuario <= 4) { // valido que el usuario solo pueda introducir entre 1 y 4
                    flag = 1; //el bucle de mostrar opciones seguirá sucediendo una vez acabe, pero sin devolver mensaje de que la opcion no está disponible
                } else {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Opcion no disponible. Intentalo de nuevo, por favor.");
                    System.out.println("----------------------------------------------------");

                }
            } while (flag == 0);
/* alternativa ifs anidados
            if (entradaUsuario == 1) {
                ClaseAbstractaPrincipal metodoIntermedio = new ConsultaSaldo();
                metodoIntermedio.Transacciones(); // llamamos al metodo de la clase hija con polimorfismo ya que creamos instancia de la clase "padre" pero como clase hija
            } else if (entradaUsuario == 2) {
                ClaseAbstractaPrincipal metodoIntermedio = new RetiraSaldo();
                metodoIntermedio.Transacciones();
            } else if (entradaUsuario == 3) {
                ClaseAbstractaPrincipal metodoIntermedio = new IngresaSaldo();
                metodoIntermedio.Transacciones();
            } else if (entradaUsuario == 4) {
                System.out.println("----------------------");
                System.out.println("Gracias, vuelva pronto");
                System.out.println("----------------------");
                flag = 2;
            }
            */

// probé con switch de inicio pero al compilar salía del bucle while y pensé que era por los break,
// TODO mejorar (Update:) resulta que el problema era que habia puesto while bandera = 2, y no bandera != 2.
// Guardo los if igualmente y me quedo con el switch
            switch (entradaUsuario) {
                case (1):
                    // consulta
                    ClaseAbstractaPrincipal metodoIntermedio1 = new ConsultaSaldo();
                    metodoIntermedio1.Transacciones(); // llamamos al metodo de la clase hija con polimorfismo ya que creamos instancia de la clase "padre" pero como clase hija
                    break;

                case (2):
                    // retirada
                    ClaseAbstractaPrincipal metodoIntermedio2 = new RetiraSaldo();
                    metodoIntermedio2.Transacciones();
                    break;

                case (3):
                    // ingreso
                    ClaseAbstractaPrincipal metodoIntermedio3 = new IngresaSaldo();
                    metodoIntermedio3.Transacciones();
                    break;

                case (4): // User elige salir
                    System.out.println("----------------------");
                    System.out.println("Gracias, vuelva pronto");
                    System.out.println("----------------------");
                    flag = 2;
                    break;

                default: // no deberia llegar nunca

            }
            
 //*/
        } while (flag != 2);
    }

    public void Retirada() { // metodo para solicitar retiro
        retiro = scanner.nextInt();
    }

    public void Deposito() { //metodo para solicitar deposito
        deposito = scanner.nextInt();
    }

    public abstract void Transacciones(); //metodo abstracto para aplicar el polimorfiscmo

    public int getSaldo() { // TODO por qué no statics?
        return saldo;
    }

    public void setSaldo(int saldo) { //TODO por qué no statics?
        this.saldo = saldo;
    }
}

