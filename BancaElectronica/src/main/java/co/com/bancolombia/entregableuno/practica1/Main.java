package co.com.bancolombia.entregableuno.practica1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /****** SE CREA EL BANCO BANCOLOMBIA ******/
        Domicilio bancolombiaDomicilio = new Domicilio("Av. El Poblado",31,"Medellin","Antioquia",462);
        Banco bancolombia = new Banco("Bancolombia", bancolombiaDomicilio,"rfcBancolombia","6045128080");

        /****** CREACIÓN CLIENTE UNO ******/
        Domicilio clienteUnoDomicilio = new Domicilio("La Central", 23, "Medellin","Antioquia",587);

        Cliente clienteUno = new Cliente(1,"Brayden Lopera",clienteUnoDomicilio,"rfcClienteUno","6047895623","02-05-1996");

        CuentaDeAhorro cuentaAhorroClienteUno = new CuentaDeAhorro(1001,1000001,1.01);
        CuentaDeCheque cuentaChequeClienteUno = new CuentaDeCheque(2001,2000001,12000);

        ArrayList<Cuenta> cuentasClienteUno = new ArrayList<>();
        cuentasClienteUno.add(cuentaAhorroClienteUno);
        cuentasClienteUno.add(cuentaChequeClienteUno);

        clienteUno.setCuentas(cuentasClienteUno);

        System.out.printf(clienteUno.toString() + "\n");

        /****** CREACIÓN CLIENTE DOS ******/
        Domicilio clienteDosDomicilio = new Domicilio("Av. Santa Helena", 43,"Medellin","Antioquia",236);

        Cliente clienteDos = new Cliente(2,"Xiomara Gomez", clienteDosDomicilio,"rfcClienteDos","6047854152","28-07-2001");

        CuentaDeAhorro cuentaAhorroClienteDos = new CuentaDeAhorro(1002,1000002,1.02);
        CuentaDeCheque cuentaChequeClienteDos = new CuentaDeCheque(2002,2000002,22000);

        ArrayList<Cuenta> cuentasClienteDos = new ArrayList<>();
        cuentasClienteDos.add(cuentaAhorroClienteDos);
        cuentasClienteDos.add(cuentaChequeClienteDos);

        clienteDos.setCuentas(cuentasClienteDos);

        System.out.printf(clienteDos.toString() + "\n");

        /****** SE AÑADEN CLIENTES A BANCOLOMBIA ******/
        ArrayList<Cliente> clientesBancolombia = new ArrayList<>();
        clientesBancolombia.add(clienteUno);
        clientesBancolombia.add(clienteDos);

        bancolombia.setClientes(clientesBancolombia);

        System.out.printf(bancolombia.toString() + "\n");
    }
}