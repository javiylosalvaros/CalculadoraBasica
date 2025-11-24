import java.util.Scanner;
public class Main {

    public static int mcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }

    public static int mcm(int a, int b) {
        return Math.abs(a * b) / mcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;


        System.out.println("===== CALCULADORA SIMPLE =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Máximo Común Divisor (MCD)");
        System.out.println("6. Mínimo Común Múltiplo (MCM)");
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();

                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 5:
                System.out.print("Introduce el primer número entero: ");
                int a1 = sc.nextInt();
                System.out.print("Introduce el segundo número entero: ");
                int b1 = sc.nextInt();
                System.out.println("MCD: " + mcd(a1, b1));
                break;

            case 6:
                System.out.print("Introduce el primer número entero: ");
                int a2 = sc.nextInt();
                System.out.print("Introduce el segundo número entero: ");
                int b2 = sc.nextInt();
                System.out.println("MCM: " + mcm(a2, b2));
                break;


            default:
                System.out.println("Opción no válida.");
        }
    }
}
