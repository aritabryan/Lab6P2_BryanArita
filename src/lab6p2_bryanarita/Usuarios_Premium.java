
package lab6p2_bryanarita;

import java.util.ArrayList;

public class Usuarios_Premium extends Usuarios {

    private double Bono;

    public Usuarios_Premium(double Bono, String NombreCompleto, String NombreDeUsuario, String Contrasena, double Dinero, String CuentaBancaria) {
        super(NombreCompleto, NombreDeUsuario, Contrasena, Dinero, CuentaBancaria);
        this.Bono = Bono;
    }

    public Usuarios_Premium() {
    }
}
