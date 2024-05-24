/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lab6p2_bryanarita;

import java.util.ArrayList;


public class Usuarios_Normales extends Usuarios{
private int contTransacciones;

    public Usuarios_Normales() {
    }

    public Usuarios_Normales(int contTransacciones, String NombreCompleto, String NombreDeUsuario, String Contrasena, double Dinero, String CuentaBancaria) {
        super(NombreCompleto, NombreDeUsuario, Contrasena, Dinero, CuentaBancaria);
        this.contTransacciones = contTransacciones;
    }
}
