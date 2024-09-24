package co.com.bancolombia.entregable2.practica5;

// Entrada (int a, String b, float c) -> Salida void
@FunctionalInterface
interface InterfazUno {
    void metodoInterfazUno(int a, String b, float c);
}

// Entrada (A a, B b, C c) -> Salida D
@FunctionalInterface
interface InterfazDos<A, B, C, D> {
    D metodoInterfazDos(A a, B b, C c);
}

// Entrada (String a, String b) -> Salida String
@FunctionalInterface
interface InterfazTres {
    String metodoInterfazTres(String a, String b);
}

// Sin entrada -> Salida void
@FunctionalInterface
interface InterfazCuatro {
    void metodoInterfazCuatro();
}

// Entrada (int a, int b) -> Salida Long
@FunctionalInterface
interface InterfazCinco {
    Long metodoInterfazCinco(int a, int b);
}

// Entrada (Integer a, Long b) -> Salida Number
@FunctionalInterface
interface InterfazSeis {
    Number metodoInterfazSeis(Integer a, Long b);
}

// Entrada (String a, StringBuilder b) -> Salida CharSequence
@FunctionalInterface
interface InterfazSiete {
    CharSequence metodoInterfazSiete(String a, StringBuilder b);
}

// Sin entrada -> Salida Object
@FunctionalInterface
interface InterfazOcho {
    Object metodoInterfazOcho();
}

// Entrada (Object a, Object b) -> Salida String
@FunctionalInterface
interface InterfazNueve {
    String metodoInterfazNueve(Object a, Object b);
}

// Entrada (int a, char b, float c) -> Salida String
@FunctionalInterface
interface InterfazDiez {
    String metodoInterfazDiez(int a, char b, float c);
}

public class PracticaLamdas {
    public static void main(String[] args) {
        //(int a, String b, float c) -> void
        InterfazUno interfazUno = (a, b, c) -> System.out.println("Valores ingresados: " + a + ", " + b + ", " + c);
        interfazUno.metodoInterfazUno(10, "Prueba", 2.13f);

        //(A a, B b, C c) -> D
        InterfazDos<Integer, Character, Boolean, String> interfazDos = (a, b, c) -> a + " " + b + " " + c;
        System.out.println(interfazDos.metodoInterfazDos(73, 'C', true));

        //(String a, String b) -> String
        InterfazTres interfazTres = (a, b) -> a.concat(b);
        System.out.println(interfazTres.metodoInterfazTres("Prueba ", "Tres"));

        //() -> void
        InterfazCuatro interfazCuatro = () -> System.out.println("Solo salida");
        interfazCuatro.metodoInterfazCuatro();

        //(int a, int b) -> Long
        InterfazCinco interfazCinco = (a, b) -> (long) (a + b);
        System.out.println(interfazCinco.metodoInterfazCinco(73, 27));

        //(Integer a, Long b) -> Number
        InterfazSeis interfazSeis = (a, b) -> a + b;
        System.out.println(interfazSeis.metodoInterfazSeis(173, 27L));

        //(String a, StringBuilder b) -> CharSequence
        InterfazSiete interfazSiete = (a, b) -> a + b.toString();
        System.out.println(interfazSiete.metodoInterfazSiete("Prueba ", new StringBuilder("Siete")));

        //() -> Object
        InterfazOcho interfazOcho = () -> new Object();
        System.out.println(interfazOcho.metodoInterfazOcho());

        //(Object a, Object b) -> String
        InterfazNueve interfazNueve = (a, b) -> a.toString() + " " + b.toString();
        System.out.println(interfazNueve.metodoInterfazNueve("Objeto a", "Objeto b"));

        //(int a, char b, float c) -> String
        InterfazDiez interfazDiez = (a, b, c) -> a + " " + b + " " + c;
        System.out.println(interfazDiez.metodoInterfazDiez(73, 'B', 3.14f));

    }
}
