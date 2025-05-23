import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "Pepita";
        String correctPassword = "pepi123";
        String tryUsername;
        String tryPassword;
        do {
            System.out.println("Introduce el nombre de usuario: ");
            tryUsername = scanner.nextLine();
            System.out.println("Introduce la contraseña: ");
            tryPassword = scanner.nextLine();
            if (!tryUsername.equals(correctUsername) || !tryPassword.equals(correctPassword)) {
                System.out.println("Usuario o contraseña incorrectos. Prueba de nuevo.");
            }
        } while (!tryUsername.equals(correctUsername) || !tryPassword.equals(correctPassword));
        System.out.println("¡Acceso concedido!");
        scanner.close();
    }
}

