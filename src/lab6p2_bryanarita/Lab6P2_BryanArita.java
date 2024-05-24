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
        Usuarios UsuNormal2 = new Usuarios_Normales(0, "Jose Lopez", "JoseLO", "1234", 600, "34567");
        Usuarios UsuNormal1 = new Usuarios_Normales(0, "Eduardo Mejia", "EduMej", "1234", 300, "23456");
        Usuarios UsuPremium1 = new Usuarios_Premium(3000, "Jose Luis", "JL", "1234", 200, "12345");
        Usuarios UsuPremium2 = new Usuarios_Premium(3000, "Maria Teresa", "LOLA", "1234", 500, "45678");

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
            }
        }
        if (tieneMayuscula == true && tieneCaracterEspecial == true) {
            return true;
        }
        return false;
    }

    static void MenuUsuarioNormal() {
        System.out.print("Ingrese Nombre Completo: ");
        String NombreCompleto = duko.nextLine();
        System.out.print("Ingrese Nombre de Usuario: ");
        String NombreUsuario = duko.nextLine();
        while (!UsuarioValido(NombreUsuario)) {
            System.out.println("Usuario no valido");
            System.out.print("Ingrese Nombre de Usuario: ");
            NombreUsuario = duko.nextLine();
        }
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
        while (!CuentaValida(CuentaBancaria)) {
            System.out.println("Cuenta Bancaria no valida");
            System.out.print("Ingrese Cuenta Bancaria: ");
            CuentaBancaria = duko.nextLine();
        }
        Usuarios UsuNormal = new Usuarios_Normales(0, NombreCompleto, NombreUsuario, Contrasena, Dinero, CuentaBancaria);
        ArrayUsuarios.add(UsuNormal);
    }

    static void MenuUsuarioPremium() {
        System.out.print("Ingrese Nombre Completo: ");
        String NombreCompleto = duko.nextLine();
        System.out.print("Ingrese Nombre de Usuario: ");
        String NombreUsuario = duko.nextLine();
        while (!UsuarioValido(NombreUsuario)) {
            System.out.println("Usuario no valido");
            System.out.print("Ingrese Nombre de Usuario: ");
            NombreUsuario = duko.nextLine();
        }
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
        while (!CuentaValida(CuentaBancaria)) {
            System.out.println("Cuenta Bancaria no valida");
            System.out.print("Ingrese Cuenta Bancaria: ");
            CuentaBancaria = duko.nextLine();
        }
        Usuarios UsuPremium = new Usuarios_Premium(3000, NombreCompleto, NombreUsuario, Contrasena, Dinero, CuentaBancaria);
        ArrayUsuarios.add(UsuPremium);
    }

    static boolean UsuarioValido(String usuario) {
        for (Usuarios ArrayUsuario : ArrayUsuarios) {
            if (ArrayUsuario.getNombreDeUsuario().equalsIgnoreCase(usuario)) {
                return false;
            }
        }
        return true;
    }

    static boolean CuentaValida(String Cuenta) {
        for (Usuarios ArrayUsuario : ArrayUsuarios) {
            if (ArrayUsuario.getCuentaBancaria().equals(Cuenta)) {
                return false;
            }
        }
        return true;
    }
}
