package co.com.bancolombia.entregable1.practica4;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /****** SE CREA EL BANCO BANCOLOMBIA ******/
        Domicilio bancolombiaDomicilio = new Domicilio("Av. El Poblado", 31, "Medellin", "Antioquia", 462);
        Banco bancolombia = new Banco("Bancolombia", bancolombiaDomicilio, "rfcBancolombia", "6045128080");

        /****** CREACIÓN CLIENTE UNO ******/
        Domicilio clienteUnoDomicilio = new Domicilio("La Central", 23, "Medellin", "Antioquia", 587);
        //Cliente clienteUno = new Cliente(10, "Brayden Lopera", clienteUnoDomicilio, "rfcClienteUno", "6047895623", "02-05-1996");
        Cliente clienteUno = new Cliente.Builder(10, "Brayden Lopera")
                .domicilio(clienteUnoDomicilio)
                .rfc("rfcClienteUno")
                .telefono("6047895623")
                .fechaNacimiento("02-05-1996")
                .build();
        CuentaDeAhorro cuentaAhorroClienteUno = new CuentaDeAhorro(1001, 1000001, 1.01);
        CuentaDeCheque cuentaChequeClienteUno = new CuentaDeCheque(1002, 2000001, 12000);
        clienteUno.agregarCuenta(cuentaAhorroClienteUno);
        clienteUno.agregarCuenta(cuentaChequeClienteUno);

        /****** CREACIÓN CLIENTE DOS ******/
        Domicilio clienteDosDomicilio = new Domicilio("Av. Santa Helena", 43, "Medellin", "Antioquia", 236);
        //Cliente clienteDos = new Cliente(20, "Xiomara Gomez", clienteDosDomicilio, "rfcClienteDos", "6047854152", "28-07-2001");
        Cliente clienteDos = new Cliente.Builder(20, "Xiomara Gomez")
                .domicilio(clienteDosDomicilio)
                .rfc("rfcClienteDos")
                .telefono("6047854152")
                .fechaNacimiento("28-07-2001")
                .build();
        CuentaDeAhorro cuentaAhorroClienteDos = new CuentaDeAhorro(2001, 1000002, 1.02);
        CuentaDeCheque cuentaChequeClienteDos = new CuentaDeCheque(2002, 2000002, 22000);
        clienteDos.agregarCuenta(cuentaAhorroClienteDos);
        clienteDos.agregarCuenta(cuentaChequeClienteDos);

        /****** SE AÑADEN CLIENTES A BANCOLOMBIA ******/
        bancolombia.agregarCliente(clienteUno);
        bancolombia.agregarCliente(clienteDos);
        System.out.println(" ::::::::::::::::::::::::::::: CLIENTES :::::::::::::::::::::::::::::");
        System.out.println(bancolombia.obtenerClientes());




    }
}