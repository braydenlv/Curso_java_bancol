package co.com.bancolombia.practica2;

import java.util.ArrayList;
import java.util.Date;

public class Cliente implements ServicioCuentas{
    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuentas=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}' + "\n";
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
            for (int i = 0; i < cuentas.size(); i++) {
                if(cuentas.get(i).getNumero() == numeroCuenta){
                    this.cuentas.get(i).setFechaCancelacion("22-09-2024");
                    this.cuentas.remove(i);
                    return true;
                }
            }
            return false;
        } catch (Exception e){
            throw new RuntimeException("No se pudo cancelar la cuenta " + numeroCuenta + " del cliente " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public void abonarCuenta(int numeroCuenta, double abono) {
        try {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getNumero() == numeroCuenta) {
                    cuenta.setSaldo(cuenta.getSaldo() + abono);
                }
            }
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar la cuenta " + numeroCuenta + " del cliente " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public void retirar(int numeroCuenta, double retiro) {
        try {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getNumero() == numeroCuenta) {
                    if (cuenta.getSaldo() >= retiro) {
                        cuenta.setSaldo(cuenta.getSaldo() - retiro);
                    }
                }
            }
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar la cuenta " + numeroCuenta + " del cliente " + getNombre() + ": " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return this.cuentas;
    }
}
