package co.com.bancolombia.entregable3.practica9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /****** SE CREA EL BANCO BANCOLOMBIA ******/
        Domicilio bancolombiaDomicilio = new Domicilio("Av. El Poblado", 31, "Medellin", "Antioquia", 462);
        Banco bancolombia = new Banco("Bancolombia", bancolombiaDomicilio, "rfcBancolombia", "6045128080");

        /****** CREACIÓN CLIENTE UNO ******/
        Domicilio clienteUnoDomicilio = new Domicilio("La Central", 23, "Medellin", "Antioquia", 587);
        Cliente clienteUno = new Cliente.Builder(1, "Brayden Lopera")
                .domicilio(clienteUnoDomicilio)
                .rfc("rfcClienteUno")
                .telefono("6047895623")
                .fechaNacimiento("02-05-1996")
                .build();

        /****** CREACIÓN CLIENTE DOS ******/
        Domicilio clienteDosDomicilio = new Domicilio("Av. Santa Helena", 43, "Medellin", "Antioquia", 236);
        Cliente clienteDos = new Cliente.Builder(2, "Xiomara Gomez")
                .domicilio(clienteDosDomicilio)
                .rfc("rfcClienteDos")
                .telefono("6047854152")
                .fechaNacimiento("28-07-2001")
                .build();

        /****** CREACIÓN CLIENTE TRES ******/
        Domicilio clienteTresDomicilio = new Domicilio("Calle La Esperanza", 96, "Medellin", "Antioquia", 876);
        Cliente clienteTres = new Cliente.Builder(3, "Estefania Vasquez")
                .domicilio(clienteTresDomicilio)
                .rfc("rfcClienteTres")
                .telefono("6044734152")
                .fechaNacimiento("07-07-2000")
                .build();
        try {
            String rutaDelArchivo = "src/main/java/co/com/bancolombia/entregable2/practica8/ListadoDeCuentas.txt";
            List<String> informacionCuentas = leerArchivoDeCuentas(rutaDelArchivo);

            for (String cuenta : informacionCuentas) {
                String cuentaAuxiliar = cuenta.replace("[", ",");
                cuenta = cuentaAuxiliar.replace("]", "");
                String[] partes = cuenta.split(",");
                String tipoCuenta = partes[0].trim();
                int numeroCuenta = Integer.parseInt(partes[1].trim());
                String fechaApertura = partes[2].trim();
                int saldo = Integer.parseInt(partes[3].trim());
                int cargosDeLaCuenta = Integer.parseInt(partes[4].trim());
                int numeroCliente = Integer.parseInt(partes[5].trim());

                Cuenta cuentaCliente;

                if (tipoCuenta.equals("CA")) {
                    cuentaCliente = new CuentaDeAhorro(numeroCuenta, saldo, cargosDeLaCuenta);
                } else {
                    cuentaCliente = new CuentaDeCheque(numeroCuenta, saldo, cargosDeLaCuenta);
                }
                cuentaCliente.setFechaApertura(fechaApertura);

                switch (numeroCliente) {
                    case 1:
                        clienteUno.agregarCuenta(cuentaCliente);
                        break;
                    case 2:
                        clienteDos.agregarCuenta(cuentaCliente);
                        break;
                    case 3:
                        clienteTres.agregarCuenta(cuentaCliente);
                        break;
                    default:
                        throw new RuntimeException("No se encontró el cliente");
                }

            }
        }catch (Exception e){
            throw new RuntimeException("No fue posible la carga de las cuentas desde el archivo: " + e.getMessage());
        }

        System.out.println(clienteUno);
        System.out.println(clienteDos);
        System.out.println(clienteTres);

        clienteUno.abonarCuenta(1234, 3333);
        clienteDos.retirar(123456, 878);

        /****** SE AÑADEN CLIENTES A BANCOLOMBIA *******/
        bancolombia.agregarCliente(clienteUno);
        bancolombia.agregarCliente(clienteDos);
        System.out.println(" ::::::::::::::::::::::::::::: CLIENTES :::::::::::::::::::::::::::::");
        System.out.println(bancolombia.obtenerClientes());


    }

    public static List<String> leerArchivoDeCuentas(String nombreArchivo) {
        List<String> cuentas = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                cuentas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return cuentas;
    }
}