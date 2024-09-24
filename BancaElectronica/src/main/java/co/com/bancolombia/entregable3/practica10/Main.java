package co.com.bancolombia.entregable3.practica10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

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

        ExecutorService executor = Executors.newSingleThreadExecutor();

        List<Future<Cuenta>> futures = new ArrayList<>();

        Future<?> futureReading = executor.submit(() -> {
            try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/co/com/bancolombia/entregable2/practica8/ListadoDeCuentas.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    Callable<Cuenta> task = new CrearCuentaCallable(linea);
                    Future<Cuenta> future = executor.submit(task);
                    futures.add(future);
                }
            } catch (IOException e) {
                throw new RuntimeException("No se pudo procesar el archivo: " + e.getMessage());
            }
        });

        try {
            futureReading.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        for (Future<Cuenta> future : futures) {
            try {
                Cuenta cuenta = future.get();
                System.out.println("Cuenta obtenida: ");
                System.out.println(cuenta);
            } catch (Exception e) {
                throw new RuntimeException("No se pudo obtener la cuenta: " + e.getMessage());
            }
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class CrearCuentaCallable implements Callable<Cuenta> {

    private final String linea;

    public CrearCuentaCallable(String linea) {
        this.linea = linea;
    }

    @Override
    public Cuenta call() throws Exception {
        // Procesar la línea del archivo
        String lineaAuxiliar = linea.replace("[", ",");
        String[] partes = lineaAuxiliar.split(",");
        String tipoCuenta = partes[0].trim();
        int numeroCuenta = Integer.parseInt(partes[1].trim());
        String fechaApertura = partes[2].trim();
        int saldo = Integer.parseInt(partes[3].trim());
        int cargosDeLaCuenta = Integer.parseInt(partes[4].trim());
        int numeroCliente = Integer.parseInt(partes[5].replace("]", "").trim());

        Cuenta cuentaCliente;

        if (tipoCuenta.equals("CA")) {
            cuentaCliente = new CuentaDeAhorro(numeroCuenta, saldo, cargosDeLaCuenta);
        } else {
            cuentaCliente = new CuentaDeCheque(numeroCuenta, saldo, cargosDeLaCuenta);
        }
        cuentaCliente.setFechaApertura(fechaApertura);

        return cuentaCliente;

    }
}
