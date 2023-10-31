package github_desktop;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("¿Desea crear un usuario nuevo? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();
            
            if (respuesta.equals("S")) {
                System.out.print("Introduce el DNI: ");
                String dni = scanner.nextLine();
                System.out.print("Introduce el nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Introduce los apellidos: ");
                String apellidos = scanner.nextLine();
                
                Usuario usuario = new Usuario(dni, nombre, apellidos);
                System.out.println("Usuario creado: " + usuario.getNombre() + " " + usuario.getApellidos());
            } else if (respuesta.equals("N")) {
                break;
            } else {
                System.out.println("Respuesta no válida. Introduzca 'S' para crear un usuario o 'N' para salir.");
            }
        }
        
        scanner.close();
    }
}

