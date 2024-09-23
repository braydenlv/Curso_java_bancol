package co.com.bancolombia.entregableuno.practica2;

import java.util.ArrayList;

public interface ServicioClientes{
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numeroCliente);
    Cliente consultarCliente(int numeroCliente);
    ArrayList<Cliente> obtenerClientes();
    Cliente buscarClientePorRFN(String rfc);
}
