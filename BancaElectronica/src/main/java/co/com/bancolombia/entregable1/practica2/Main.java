package co.com.bancolombia.entregable1.practica2;

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

        System.out.println(":::::::::::::::::CLIENTE UNO:::::::::::::::::");
        clienteUno.agregarCuenta(cuentaAhorroClienteUno);
        clienteUno.agregarCuenta(cuentaChequeClienteUno);
        clienteUno.abonarCuenta(1001, 1000);
        clienteUno.retirar(1002, 1);
        System.out.println(clienteUno.obtenerCuentas());
        System.out.println(":::::::::::::::::DESPUÉS DE CANCELACIÓN:::::::::::::::::");
        clienteUno.cancelarCuenta(1001);
        System.out.println(clienteUno.obtenerCuentas());
        System.out.println(":::::::::::::::::TODOS LOS DATOS CLIENTE UNO:::::::::::::::::");
        System.out.printf(clienteUno.toString() + "\n");

        /****** CREACIÓN CLIENTE DOS ******/
        Domicilio clienteDosDomicilio = new Domicilio("Av. Santa Helena", 43, "Medellin", "Antioquia", 236);

        Cliente clienteDos = new Cliente(20, "Xiomara Gomez", clienteDosDomicilio, "rfcClienteDos", "6047854152", "28-07-2001");

        CuentaDeAhorro cuentaAhorroClienteDos = new CuentaDeAhorro(2001, 1000002, 1.02);
        CuentaDeCheque cuentaChequeClienteDos = new CuentaDeCheque(2002, 2000002, 22000);

        System.out.println(":::::::::::::::::CLIENTE DOS:::::::::::::::::");
        clienteDos.agregarCuenta(cuentaAhorroClienteDos);
        clienteDos.agregarCuenta(cuentaChequeClienteDos);
        clienteDos.abonarCuenta(2002, 10000);
        clienteDos.retirar(2001, 1);
        System.out.println(clienteDos.obtenerCuentas());
        System.out.println(":::::::::::::::::DESPUÉS DE CANCELACIÓN:::::::::::::::::");
        clienteDos.cancelarCuenta(2001);
        System.out.println(clienteDos.obtenerCuentas());
        System.out.println(":::::::::::::::::TODOS LOS DATOS CLIENTE DOS:::::::::::::::::");
        System.out.printf(clienteDos.toString() + "\n");

        /****** SE AÑADEN CLIENTES A BANCOLOMBIA ******/
        System.out.println(":::::::::::::::::CLIENTES BANCOLOMBIA:::::::::::::::::");
        bancolombia.agregarCliente(clienteUno);
        bancolombia.agregarCliente(clienteDos);
        System.out.println(bancolombia.obtenerClientes());
        System.out.println(":::::::::::::::::CONSULTAR CLIENTE UNO:::::::::::::::::");
        System.out.println(bancolombia.consultarCliente(10));
        System.out.println(":::::::::::::::::CONSULTAR CLIENTE RFC DOS:::::::::::::::::");
        System.out.println(bancolombia.buscarClientePorRFN("rfcClienteDos"));
        System.out.println(":::::::::::::::::DESPUÉS DE ELIMINACIÓN:::::::::::::::::");
        bancolombia.eliminarCliente(10);
        System.out.println(bancolombia.obtenerClientes());


    }
}