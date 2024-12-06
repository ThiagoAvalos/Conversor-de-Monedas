import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        EXTERNA:
        while (true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Pesos Argentinos a dólares\n"
                    + "2 - Pesos Mexicanos a dólares\n"
                    + "3 - Pesos Colombianos a dólares\n"
                    + "4 - Salir");
            System.out.print("INGRESE UNA OPCIÓN: ");
            String opcion = leer.next();

            switch (opcion) {
                case "1":
                    convertir(1012.76, "Pesos Argentinos", leer);
                    break;
                case "2":
                    convertir(20.24, "Pesos Mexicanos", leer);
                    break;
                case "3":
                    convertir(4408.50, "Pesos Colombianos", leer);
                    break;
                case "4":
                    System.out.println("CERRANDO PROGRAMA");
                    break EXTERNA;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
                    break;
            }
        }
        leer.close();
    }

    static void convertir(double valorDolar, String pais, Scanner leer) {
        System.out.printf("Ingrese la cantidad de %s: ", pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;
        dolares = (double) Math.round(dolares * 100d) / 100;

        System.out.println("----------------------------------------------");
        System.out.println("|         Tienes $" + dolares + " Dólares        |");
        System.out.println("----------------------------------------------");
    }
}
