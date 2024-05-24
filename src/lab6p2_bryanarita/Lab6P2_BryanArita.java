/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p2_bryanarita;

import java.util.*;

public class Lab6P2_BryanArita {

    static Scanner duki = new Scanner(System.in);
    static Scanner duko = new Scanner(System.in);
    static ArrayList<Transaccion> ArrayTransaccion = new ArrayList<>();
    static ArrayList<Usuarios> ArrayUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        Banco BancoFrame = new Banco();
        BancoFrame.setVisible(true);

        System.out.println("[1]Crear Usuario Normal\n[2]Crear Usuario Premium\n[3]Salir");
        int OpcionMenu = duki.nextInt();
        do {
            switch (OpcionMenu) {
                case 1:
                    MenuUsuarioNormal();
                    break;
                case 2:
                    MenuUsuarioPremium();
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
            System.out.println("[1]Crear Usuario Normal\n[2]Crear Usuario Premium\n[3]Salir");

        } while (OpcionMenu != 3);
    }

    static boolean ContrasenaValida(String contrasena) {
        boolean tieneMayuscula = false;
        boolean tieneCaracterEspecial = false;

        for (int i = 0; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) >= 'A' && contrasena.charAt(i) <= 'Z') {
                tieneMayuscula = true;
            } else if (contrasena.charAt(i) >= 33 && contrasena.charAt(i) <= 64) {
                tieneCaracterEspecial = true;
            } else {
                return false;
            }
        }
        return true;

    }

    static void MenuUsuarioNormal() {
        System.out.print("Ingrese Nombre Completo: ");
        String NombreCompleto = duko.nextLine();
        System.out.print("Ingrese Nombre de Usuario: ");
        String NombreUsuario = duko.nextLine();
        System.out.print("Ingrese Contrasena: ");
        String Contrasena = duko.nextLine();
        while (!ContrasenaValida(Contrasena)) {
            System.out.println("Contrasena no valida");
            System.out.print("Ingrese Contrasena: ");
            Contrasena = duko.nextLine();
        }
        System.out.print("Ingrese Dinero: ");
        double Dinero = duki.nextDouble();
        System.out.print("Ingrese Cuenta Bancaria: ");
        String CuentaBancaria = duko.nextLine();
    }

    static void MenuUsuarioPremium() {
        System.out.print("Ingrese Nombre Completo: ");
        String NombreCompleto = duko.nextLine();
        System.out.print("Ingrese Nombre de Usuario: ");
        String NombreUsuario = duko.nextLine();
        System.out.print("Ingrese Contrasena: ");
        String Contrasena = duko.nextLine();
        while (!ContrasenaValida(Contrasena)) {
            System.out.println("Contrasena no valida");
            System.out.print("Ingrese Contrasena: ");
            Contrasena = duko.nextLine();
        }
        System.out.print("Ingrese Dinero: ");
        double Dinero = duki.nextDouble();
        System.out.print("Ingrese Cuenta Bancaria: ");
        String CuentaBancaria = duko.nextLine();
    }

}
