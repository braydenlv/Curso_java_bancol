package co.com.bancolombia.entregable1.practica4;

import java.util.ArrayList;

public interface ServicioCuentas {
    boolean agregarCuenta(Cuenta cuenta);
    boolean cancelarCuenta(int numeroCuenta);
    void abonarCuenta(int numeroCuenta, double abono);
    void retirar(int numeroCuenta, double retiro);
    ArrayList<Cuenta> obtenerCuentas();
}
