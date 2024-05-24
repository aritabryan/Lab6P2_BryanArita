package lab6p2_bryanarita;

import java.util.ArrayList;

public abstract class Usuarios {

    private String NombreCompleto, NombreDeUsuario, Contrasena, CuentaBancaria;
    private double Dinero;
    private ArrayList<Transaccion> transacciones;

    public Usuarios() {
    }

    public Usuarios(String NombreCompleto, String NombreDeUsuario, String Contrasena, double Dinero, String CuentaBancaria) {
        this.NombreCompleto = NombreCompleto;
        this.NombreDeUsuario = NombreDeUsuario;
        this.Contrasena = Contrasena;
        this.Dinero = Dinero;
        this.CuentaBancaria = CuentaBancaria;
        this.transacciones = new ArrayList<>();
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getNombreDeUsuario() {
        return NombreDeUsuario;
    }

    public void setNombreDeUsuario(String NombreDeUsuario) {
        this.NombreDeUsuario = NombreDeUsuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

}
