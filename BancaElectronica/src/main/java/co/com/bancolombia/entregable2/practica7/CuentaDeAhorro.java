package co.com.bancolombia.entregable2.practica7;

public class CuentaDeAhorro extends Cuenta {
    private double tasaInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double calcularIntereses(){
        return super.getSaldo()*tasaInteresMensual;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    @Override
    public String toString() {
        return  "CuentaDeAhorro{" + super.toString() +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }
}
