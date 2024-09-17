package co.com.bancol.ejerciciosfor;

import java.util.ArrayList;

public class PilaDeEjerciciosFor {

    //Ejercicio 1:
    //Imprime los números del 10 al 1:
    //Escribe un programa que utilice un bucle for para imprimir los números del 10 al 1 en orden descendente.
    public static void ejercicioUno() {
        System.out.println("EJERCICIO 1: Imprime los números del 10 al 1.");
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d \n", i);
        }
    }

    //Ejercicio 2:
    //Imprime los números pares del 2 al 20:
    //Escribe un programa que utilice un bucle for para imprimir todos los números pares entre 2 y 20.
    public static void ejercicioDos() {
        System.out.println("EJERCICIO 2: imprime los números pares entre el 2 y el 20.");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d \n", i);
            }
        }
    }

    //    Ejercicio 3:
//    Imprime los números impares del 1 al 19:
//     Escribe un programa que utilice un bucle for para imprimir todos los números impares entre 1 y 19.
    public static void ejercicioTres() {
        System.out.println("EJERCICIO 3: imprime los números impares entre el 1 y el 19.");
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d \n", i);
            }
        }
    }

    //    Ejercicio 4:
//    Imprime la tabla de multiplicar del 5:
//    Escribe un programa que utilice un bucle for para imprimir la tabla de multiplicar del 5, desde 5x1 hasta 5x10.
    public static void ejercicioCuatro() {
        System.out.println("EJERCICIO 4: imprime la tabla de multiplicar del 5");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("5 * %d = %d \n", i, (i * 5));
        }
    }

    //    Ejercicio 5:
//    Imprime los primeros 10 números cuadrados:
//    Escribe un programa que utilice un bucle for para imprimir los primeros 10 números elevados al cuadrado (1², 2², 3², ...).
    public static void ejercicioCinco() {
        System.out.println("EJERCICIO 5: Imprime los primeros 10 números cuadrados.");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d^2 = %.0f \n", i, (Math.pow(i, 2)));
        }
    }

    //    Ejercicio 6:
//    Imprime los números del 1 al 10 y su doble:
//    Escribe un programa que utilice un bucle for para imprimir los números del 1 al 10 junto con su doble (por ejemplo: ""1 - 2"", ""2 - 4"", ...).
    public static void ejercicioSeis() {
        System.out.println("EJERCICIO 6: Imprime los números del 1 al 10 y su doble.");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d - %d \n", i, (i * 2));
        }
    }

    //    Ejercicio7
//    Imprime los primeros 10 números en forma de lista:
//    Escribe un programa que utilice un bucle for para imprimir los primeros 10 números, cada uno en una línea diferente, con el formato: ""Número: X"".
    public static void ejercicioSiete() {
        System.out.println("EJERCICIO 7: Imprime los primeros 10 números en forma de lista.");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Número: %d \n", i);
        }
    }

    //    Ejercicio8
//    Suma de los primeros 10 números:
//    Escribe un programa que utilice un bucle for para calcular la suma de los primeros 10 números enteros (1+2+3+...+10).
    public static void ejercicioOcho() {
        System.out.println("EJERCICIO 8: Suma de los primeros 10 números.");
        int sumatoria = 0;
        for (int i = 0; i <= 10; i++) {
            sumatoria += i;
        }
        System.out.printf("La suma de los 10 primeros número es igual a %d.\n", sumatoria);
    }

    //    Ejercicio 9
//    Imprime una secuencia de asteriscos:
//    Escribe un programa que utilice un bucle for para imprimir 10 asteriscos en una sola línea (**********).
    public static void ejercicioNueve() {
        System.out.println("EJERCICIO 9: Imprime una secuencia de asteriscos (*).");
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    //    Ejercicio 10
//    Imprime los elementos de un array:
//    Escribe un programa que utilice un bucle for para imprimir todos los elementos de un array de números, uno por línea.
    public static void ejercicioDiez() {
        System.out.println("Ejercicio 10: Imprime los elementos de un array.");
        ArrayList<String> listaDeElementos = new ArrayList<>();
        listaDeElementos.add("Uno");
        listaDeElementos.add("Dos");
        listaDeElementos.add("Tres");
        listaDeElementos.add("Cuatro");
        listaDeElementos.add("Cinco");
        listaDeElementos.add("Seis");
        listaDeElementos.add("Siete");
        listaDeElementos.add("Ocho");
        listaDeElementos.add("Nueve");
        listaDeElementos.add("Diez");
        for (String elemento : listaDeElementos) {
            System.out.println(elemento);
        }
    }

    //    Ejercicio 11
//    Suma de los elementos de un array:
//    Escribe un programa que utilice un bucle for para calcular la suma de todos los elementos en un array de números.
    public static void ejercicioOnce() {
        System.out.println("Ejercicio 11: Suma los elementos de un array numérico.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(2);
        listaDeElementos.add(3);
        listaDeElementos.add(4);
        listaDeElementos.add(5);
        listaDeElementos.add(6);
        listaDeElementos.add(7);
        listaDeElementos.add(8);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        int sumatoria = 0;
        for (int elemento : listaDeElementos) {
            sumatoria += elemento;
        }
        System.out.printf("La sumatoria del array es: %d \n", sumatoria);
    }

    //    Ejercicio 12
//    Encuentra el número más grande en un array:
//    Escribe un programa que utilice un bucle for para encontrar y mostrar el número más grande en un array de números.
    public static void ejercicioDoce() {
        System.out.println("EJERCICIO 12: Encuentra el número más grande en un array numérico.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(5);
        listaDeElementos.add(3);
        listaDeElementos.add(15);
        listaDeElementos.add(8);
        listaDeElementos.add(6);
        listaDeElementos.add(2);
        listaDeElementos.add(20);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        int numeroMaximo = 0;
        for (int elemento : listaDeElementos) {
            if (elemento > numeroMaximo) {
                numeroMaximo = elemento;
            }
        }
        System.out.printf("El número máximo del array es: %d \n", numeroMaximo);
    }

    //    Ejercicio 13
//    Cuenta cuántos números son mayores que 10 en un array:
//    Escribe un programa que utilice un bucle for para contar cuántos números en un array son mayores que 10.
    public static void ejercicioTrece() {
        System.out.println("EJERCICIO 13: Cuenta cuántos números son mayores que 10 en un array.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(5);
        listaDeElementos.add(3);
        listaDeElementos.add(15);
        listaDeElementos.add(8);
        listaDeElementos.add(6);
        listaDeElementos.add(2);
        listaDeElementos.add(20);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        int conteo = 0;
        for (int elemento : listaDeElementos) {
            if (elemento > 10) {
                conteo++;
            }
        }
        System.out.printf("Hay %d número(s) mayor(es) a 10 en el array.\n", conteo);
    }

    //    Ejercicio 14
//    Imprime los números del 1 al 100, pero solo los múltiplos de 3:
//    Escribe un programa que utilice un bucle for para imprimir solo los números entre 1 y 100 que sean múltiplos de 3.
    public static void ejercicioCatorce() {
        System.out.println("EJERCICIO 14: Imprime los números del 1 al 100, pero solo los múltiplos de 3.");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d \n", i);
            }
        }
    }

    //    Ejercicio 15
//    Reversa los elementos de un array:
//    Escribe un programa que utilice un bucle for para imprimir los elementos de un array en orden inverso.
    public static void ejercicioQuince() {
        System.out.println("EJERCICIO 15: Reversa los elementos de un array.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(2);
        listaDeElementos.add(3);
        listaDeElementos.add(4);
        listaDeElementos.add(5);
        listaDeElementos.add(6);
        listaDeElementos.add(7);
        listaDeElementos.add(8);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        for (int i = (listaDeElementos.size() - 1); i >= 0; i--) {
            System.out.println(listaDeElementos.get(i));
        }
    }

    //    Ejercicio 16
//    Imprime los primeros 10 números Fibonacci:
//    Escribe un programa que utilice un bucle for para imprimir los primeros 10 números de la secuencia de Fibonacci.
    public static void ejercicioDieciseis() {
        System.out.println("EJERCICIO 16: Imprime los primeros 10 números Fibonacci.");
        int numeroAuxiliarUno = 0;
        int numeroAuxiliarDos = 1;
        int sumatoria = 0;
        for (int i = 1; i <= 10; i++) {
            sumatoria = numeroAuxiliarUno + numeroAuxiliarDos;
            numeroAuxiliarUno = numeroAuxiliarDos;
            numeroAuxiliarDos = sumatoria;
            System.out.printf("%d \n", sumatoria);
        }
    }

    //    Ejercicio 17
//    Imprime las letras de una palabra:
//    Escribe un programa que utilice un bucle for para imprimir cada letra de una palabra (string) en una línea diferente.
    public static void ejercicioDiecisiete() {
        System.out.println("EJERCICIO 17: Imprime las letras de una palabra.");
        String palabraParaDeletrear = "BANCOLOMBIA";
        for (int i = 0; i < palabraParaDeletrear.length(); i++) {
            System.out.printf("%c \n", palabraParaDeletrear.charAt(i));
        }
    }

    //    Ejercicio 18
//    Convierte todos los elementos de un array a mayúsculas:
//    Escribe un programa que utilice un bucle for para recorrer un array de strings y convertir cada elemento a mayúsculas.
    public static void ejercicioDieciocho() {
        System.out.println("EJERCICIO 18: Convierte todos los elementos de un array a mayúsculas.");
        ArrayList<String> listaDeElementos = new ArrayList<>();
        listaDeElementos.add("m");
        listaDeElementos.add("i");
        listaDeElementos.add("n");
        listaDeElementos.add("u");
        listaDeElementos.add("s");
        listaDeElementos.add("c");
        listaDeElementos.add("u");
        listaDeElementos.add("l");
        listaDeElementos.add("a");
        listaDeElementos.add("s");

        for (int i = 0; i < listaDeElementos.size(); i++) {
            listaDeElementos.set(i, listaDeElementos.get(i).toUpperCase());
        }
        for (String elemento : listaDeElementos) {
            System.out.printf("%s", elemento);
        }
        System.out.print("\n");
    }


}
