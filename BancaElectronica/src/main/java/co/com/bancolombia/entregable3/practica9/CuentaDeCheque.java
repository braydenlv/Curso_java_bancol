package co.com.bancolombia.entregable3.practica9;

public class CuentaDeCheque extends Cuenta {

    private double costoManejoMensual;
    public CuentaDeCheque(int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return  "CuentaDeCheque{" + super.toString() +
                "costoManejoMensual=" + costoManejoMensual +
                '}';
    }
}
