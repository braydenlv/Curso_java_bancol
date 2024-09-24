package co.com.bancolombia.entregable1.practica3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /****** SE CREA EL BANCO BANCOLOMBIA ******/
        Domicilio bancolombiaDomicilio = new Domicilio("Av. El Poblado", 31, "Medellin", "Antioquia", 462);
        Banco bancolombia = new Banco("Bancolombia", bancolombiaDomicilio, "rfcBancolombia", "6045128080");

        /****** CREACIÓN CLIENTE UNO ******/
        Domicilio clienteUnoDomicilio = new Domicilio("La Central", 23, "Medellin", "Antioquia", 587);
        Cliente clienteUno = new Cliente(10, "Brayden Lopera", clienteUnoDomicilio, "rfcClienteUno", "6047895623", "02-05-1996");
        CuentaDeAhorro cuentaAhorroClienteUno = new CuentaDeAhorro(1001, 1000001, 1.01);
        CuentaDeCheque cuentaChequeClienteUno = new CuentaDeCheque(1002, 2000001, 12000);

        System.out.print(":::::::::::::::::CLIENTE UNO:::::::::::::::::");
        clienteUno.agregarCuenta(cuentaAhorroClienteUno);
        clienteUno.agregarCuenta(cuentaChequeClienteUno);
        System.out.printf(clienteUno.toString() + "\n");

        /****** CREACIÓN CLIENTE DOS ******/
        Domicilio clienteDosDomicilio = new Domicilio("Av. Santa Helena", 43, "Medellin", "Antioquia", 236);
        Cliente clienteDos = new Cliente(20, "Xiomara Gomez", clienteDosDomicilio, "rfcClienteDos", "6047854152", "28-07-2001");
        CuentaDeAhorro cuentaAhorroClienteDos = new CuentaDeAhorro(2001, 1000002, 1.02);
        CuentaDeCheque cuentaChequeClienteDos = new CuentaDeCheque(2002, 2000002, 22000);

        System.out.print(":::::::::::::::::CLIENTE DOS:::::::::::::::::");
        clienteDos.agregarCuenta(cuentaAhorroClienteDos);
        clienteDos.agregarCuenta(cuentaChequeClienteDos);
        System.out.printf(clienteDos.toString() + "\n");

        /****** CREACIÓN CLIENTE TRES ******/
        Domicilio clienteTresDomicilio = new Domicilio("La Esperanza", 96, "Medellin", "Antioquia", 747);
        Cliente clienteTres = new Cliente(30, "Estefania Vasquez", clienteTresDomicilio, "rfcClienteTres", "6048525623", "02-12-2000");
        CuentaDeAhorro cuentaAhorroClienteTres = new CuentaDeAhorro(3001, 1000003, 1.03);
        CuentaDeCheque cuentaChequeClienteTres = new CuentaDeCheque(3002, 2000003, 32000);

        System.out.print(":::::::::::::::::CLIENTE TRES:::::::::::::::::");
        clienteTres.agregarCuenta(cuentaAhorroClienteTres);
        clienteTres.agregarCuenta(cuentaChequeClienteTres);
        System.out.printf(clienteTres.toString() + "\n");

        /****** SE AÑADEN CLIENTES A BANCOLOMBIA ******/
        bancolombia.agregarCliente(clienteUno);
        bancolombia.agregarCliente(clienteDos);
        bancolombia.agregarCliente(clienteTres);
        System.out.println(":::::::::::::::::CLIENTES BANCOLOMBIA SIN ORDENAR:::::::::::::::::");
        System.out.println(bancolombia.obtenerClientes());
        System.out.println(":::::::::::::::::CLIENTES BANCOLOMBIA ORDENADOS:::::::::::::::::");
        Collections.sort(bancolombia.obtenerClientes());
        System.out.println(bancolombia.obtenerClientes());



    }
}