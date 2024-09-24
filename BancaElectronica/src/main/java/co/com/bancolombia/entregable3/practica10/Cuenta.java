package co.com.bancolombia.entregable3.practica10;

import java.time.LocalDate;

public abstract class Cuenta implements Comparable<Cuenta>{
    private int numero;
    private LocalDate fechaApertura;
    private double saldo;
    private LocalDate fechaCancelacion;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        String[] fechaPorcionada = fechaApertura.split("-");
        int ano = Integer.parseInt(fechaPorcionada[2]);
        int mes = Integer.parseInt(fechaPorcionada[1]);
        int dia = Integer.parseInt(fechaPorcionada[0]);
        this.fechaApertura = LocalDate.of(ano,mes,dia);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        String[] fechaPorcionada = fechaCancelacion.split("-");
        int ano = Integer.parseInt(fechaPorcionada[2]);
        int mes = Integer.parseInt(fechaPorcionada[1]);
        int dia = Integer.parseInt(fechaPorcionada[0]);
        this.fechaCancelacion = LocalDate.of(ano,mes,dia);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cuenta cuenta) {
        return Double.compare(this.saldo, cuenta.getSaldo());
    }
}
