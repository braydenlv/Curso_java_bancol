package co.com.bancolombia.entregable1.practica3;

import java.util.ArrayList;

public class Banco implements ServicioClientes {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clientes=" + clientes +
                '}' + "\n";
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        try {
            this.clientes.add(cliente);
            return true;
        } catch (Exception e){
            throw new RuntimeException("No se pudo agregar el cliente " + cliente + " al banco " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public boolean eliminarCliente(int numero) {
        try {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getNumero() == numero){
                    this.clientes.remove(i);
                    return true;
                }
            }
            return true;
        } catch (Exception e){
            throw new RuntimeException("No se pudo eliminar el cliente " + numero + " del banco " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public Cliente consultarCliente(int numero) {
        try {
            for (Cliente cliente : clientes) {
                if (cliente.getNumero() == numero) {
                    return cliente;
                }
            }
            return null;
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar el cliente " + numero + " del banco " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        try {
            return this.clientes;
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar la lista de clientes del banco " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public Cliente buscarClientePorRFN(String rfc) {
        try {
            for (Cliente cliente : clientes) {
                if (cliente.getRfc().equals(rfc)) {
                    return cliente;
                }
            }
            return null;
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar el RFC " + rfc + "del banco " + getNombre() + ": " + e.getMessage());
        }
    }
}
