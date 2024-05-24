
package lab6p2_bryanarita;

public abstract class Usuarios {

    private String NombreCompleto, NombreDeUsuario, Contrasena;
    private double Dinero;
    private int CuentaBancaria;

    public Usuarios() {
    }

    public Usuarios(String NombreCompleto, String NombreDeUsuario, String Contrasena, double Dinero, int CuentaBancaria) {
        this.NombreCompleto = NombreCompleto;
        this.NombreDeUsuario = NombreDeUsuario;
        this.Contrasena = Contrasena;
        this.Dinero = Dinero;
        this.CuentaBancaria = CuentaBancaria;
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

    public int getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(int CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    
}
