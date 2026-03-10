import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pila pilaAcciones = new Pila();
        Pila pilaDeshacer = new Pila();

        String textoActual = "";
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Escribe una linea: ");
                    String linea = sc.nextLine();
                    pilaAcciones.push(linea);
                    textoActual += linea + "\n";
                    break;

                case 2:
                    if (!pilaAcciones.isEmpty()) {
                        String ultima = pilaAcciones.pop();
                        pilaDeshacer.push(ultima);
                        textoActual = textoActual.replace(ultima + "\n", "");
                        System.out.println("Deshecho.");
                    } else {
                        System.out.println("Nada para deshacer.");
                    }
                    break;

                case 3:
                    if (!pilaDeshacer.isEmpty()) {
                        String rehacer = pilaDeshacer.pop();
                        pilaAcciones.push(rehacer);
                        textoActual += rehacer + "\n";
                        System.out.println("Rehecho.");
                    } else {
                        System.out.println("Nada para rehacer.");
                    }
                    break;

                case 4:
                    System.out.println("\nTexto actual:");
                    System.out.println(textoActual);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}