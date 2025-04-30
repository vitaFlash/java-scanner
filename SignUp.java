import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cómo es tu nombre?");
        String name = scanner.nextLine();
        System.out.println("¿Cómo es tu apellido?");
        String lastName = scanner.nextLine();
        System.out.println("¿Elige nombre de usuario?");
        String userName = scanner.nextLine();
        System.out.println("¿Indique tu contraseña?");
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        String password = scanner.nextLine();
        //Imprimir el siguiente resultado:
        System.out.println("\n¿Hola "+name+" "+lastName+", tu nombre de usuario es "+userName+" y tu contraseña es "+password+", gracias por registrarte.");
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
    }
}