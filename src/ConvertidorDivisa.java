import java.util.Scanner;

public class ConvertidorDivisa {

    public static int elegirOpcionMenu(){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(entrada.nextLine());

                // Validación para asegurarse de que esté dentro del rango (1-2)
                if (opcion < 1 || opcion > 2) {
                    System.out.println("\nPor favor, elige una opción válida.\n");
                } else {
                    break;  // Salimos del bucle si la opción es válida
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada no válida. Por favor, ingrese un número.\n");
            }
        }
        return opcion;
    }

    public static int elegirOpcionDivisa(){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(entrada.nextLine());

                // Validación para asegurarse de que esté dentro del rango (1-2)
                if (opcion < 1 || opcion > 5) {
                    System.out.println("\nPor favor, elige una opción válida.\n");
                } else {
                    break;  // Salimos del bucle si la opción es válida
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada no válida. Por favor, ingrese un número.\n");
            }
        }
        return opcion;
    }

    public static double elegirCantidad(){
        Scanner entrada = new Scanner(System.in);
        double cantidad = -1;
        while (true) {
            System.out.print("Indique una cantidad: ");
            try {
                cantidad = Double.parseDouble(entrada.nextLine());

                // Validación para asegurarse de que esté dentro del rango (1-2)
                if (cantidad < 0) {
                    System.out.println("\nPor favor, indique una cantidad valida.\n");
                } else {
                    break;  // Salimos del bucle si la opción es válida
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada no válida. Por favor, ingrese un número.\n");
            }
        }
        return cantidad;
    }

    public static void Menu(){
        int opcion;
        do{
            System.out.println("\n**** MENU ***\n");
            System.out.println("1) Nuevo\n2) Salir");
            opcion = elegirOpcionMenu();

            if(opcion == 1) {
                System.out.println("\nSelecciona la divisa de origen:");
                System.out.println("1) MXN\n2) USD\n3) EUR\n4) GBP\n5) JPY");
                int opcionOrigen = elegirOpcionDivisa();
                System.out.println("\nSelecciona la divisa de destino:");
                System.out.println("1) MXN\n2) USD\n3) EUR\n4) GBP\n5) JPY");
                int opcionDestino = elegirOpcionDivisa();
                System.out.print("\nCantidad\n");
                double cantidad = elegirCantidad();
                convertirDivisa(opcionOrigen, opcionDestino, cantidad);
            }
            else
                System.out.println("Adios!");
        } while (opcion != 2);
    }

    public static void convertirDivisa(int opcionOrigen, int opcionDestino, double cantidad){
        Divisa divisa = null;
        switch (opcionOrigen){
            case 1:
                divisa = new MXN(cantidad);
                divisa.convertir(opcionDestino);
                break;
            case 2:
                divisa = new USD(cantidad);
                divisa.convertir(opcionDestino);
                break;
            case 3:
                divisa = new EUR(cantidad);
                divisa.convertir(opcionDestino);
                break;
            case 4:
                divisa = new GBP(cantidad);
                divisa.convertir(opcionDestino);
                break;
            case 5:
                divisa = new JPY(cantidad);
                divisa.convertir(opcionDestino);
                break;
        }
    }
}
