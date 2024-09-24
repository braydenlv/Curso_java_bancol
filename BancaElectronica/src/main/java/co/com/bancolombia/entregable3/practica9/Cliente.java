package co.com.bancolombia.entregable3.practica9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

public class Cliente implements ServicioCuentas, Comparable<Cliente> {
    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private LocalDate fechaNacimiento;

    public Cliente(Builder builder) {
        this.numero = builder.numero;
        this.nombre = builder.nombre;
        this.domicilio = builder.domicilio;
        this.rfc = builder.rfc;
        this.telefono = builder.telefono;
        this.cuentas =  new ArrayList<>();
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static class Builder {
        private final int numero;
        private final String nombre;
        private Domicilio domicilio;
        private String rfc;
        private String telefono;
        private LocalDate fechaNacimiento;

        Builder (int numero, String nombre){
            this.numero = numero;
            this.nombre = nombre;
        }

        Builder domicilio (Domicilio domicilio){
            this.domicilio = domicilio;
            return this;
        }

        Builder rfc (String rfc){
            this.rfc = rfc;
            return this;
        }

        Builder telefono (String telefono){
            this.telefono = telefono;
            return this;
        }

        Builder fechaNacimiento (String fechaNacimiento){
            String[] fechaPorcionada = fechaNacimiento.split("-");
            int ano = Integer.parseInt(fechaPorcionada[2]);
            int mes = Integer.parseInt(fechaPorcionada[1]);
            int dia = Integer.parseInt(fechaPorcionada[0]);
            this.fechaNacimiento = LocalDate.of(ano,mes,dia);
            return this;
        }

        Cliente build (){
            return new Cliente(this);
        }
    }

    @Override
    public String toString() {
        return "\n::::::::::::::::::::::::::::: Cliente " + numero + " :::::::::::::::::::::::::::::\n" +
                "Nombre= " + nombre + "\n" +
                "Domicilio= " + domicilio + "\n" +
                "RFC= " + rfc + "\n" +
                "Teléfono= " + telefono + "\n" +
                "Fecha nacimiento= " + fechaNacimiento + "\n" +
                "Cuentas= " + cuentas + "\n";
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        try {
            this.cuentas.add(cuenta);
            return true;
        } catch (Exception e){
            throw new RuntimeException("No se pudo agregar la cuenta " + cuenta + " al cliente " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public boolean cancelarCuenta(int numeroCuenta) {
        try {
            Optional<Cuenta> cuentaAuxiliar = cuentas.stream().filter(cuenta -> cuenta.getNumero() == numeroCuenta).findFirst();
            if (cuentaAuxiliar.isPresent()){
                cuentaAuxiliar.ifPresent(cuenta -> cuenta.setFechaCancelacion("24-09-2024"));
                return true;
            }
            return false;
        } catch (Exception e){
            throw new RuntimeException("No se pudo cancelar la cuenta " + numeroCuenta + " del cliente " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public void abonarCuenta(int numeroCuenta, double abono) {
        try {
            cuentas.stream().filter(cuenta -> cuenta.getNumero() == numeroCuenta).findFirst()
                    .ifPresent(cuenta -> {
                        cuenta.setSaldo(cuenta.getSaldo() + abono);
                    });
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar la cuenta " + numeroCuenta + " del cliente " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public void retirar(int numeroCuenta, double retiro) {
        try {
            cuentas.stream().filter(cuenta -> cuenta.getNumero() == numeroCuenta).findFirst()
                    .ifPresent(cuenta -> {
                        if (cuenta.getSaldo() >= retiro){
                            cuenta.setSaldo(cuenta.getSaldo() - retiro);
                        }
                    });
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar la cuenta " + numeroCuenta + " del cliente " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return this.cuentas;
    }

    @Override
    public int compareTo(Cliente cliente) {
        return Integer.compare(this.numero, cliente.getNumero());
    }
}
