import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class EjerciciosJavaSelvinVasquez {
    private final Scanner scanner;


    public EjerciciosJavaSelvinVasquez() {
        this.scanner = new Scanner(System.in);
    }

    // Ejercicio if 1
    public void determinarSigno() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    // Ejercicio if 2
    public void verificarPar() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    // Ejercicio if- 3
    public void encontrarMayorDeTres() {
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println(STR."El mayor de los tres números es: \{mayor}");
    }

    // Ejercicio if 4
    public void determinarBisiesto() {
        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }

    // Ejercicio while 1
    public void imprimirNumerosAscendentes() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    // Ejercicio while 2
    public void imprimirNumerosHasta() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int i = 1;

        while (i <= numero) {
            System.out.println(i);
            i++;
        }
    }

    // Ejercicio while 3
    public void sumarNumeroPositivos() {
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número positivo (o un número negativo para detener): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println(STR."La suma de los números positivos ingresados es: \{suma}");
    }

    // Ejercicio while 4
    public void generarFibonacci() {
        System.out.print("Ingrese un número: ");
        int limite = scanner.nextInt();

        int a = 0, b = 1;
        while (a <= limite) {
            System.out.print(STR."\{a} ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }

    // Ejercicio for 1
    public void imprimirPares() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    // Ejercicio for 2
    public void mostrarTablaMultiplicar() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(STR."\{numero} x \{i} = \{numero * i}");
        }
    }

    // Ejercicio for 3
    public void sumarNumeroPar() {
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println(STR."La suma de todos los números pares desde 1 hasta \{n} es: \{suma}");
    }

    // Ejercicio for 4
    public void calcularFactorial() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println(STR."El factorial de \{numero} es: \{factorial}");
    }
}