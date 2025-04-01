package org.example.Diccionario;
import java.util.Scanner;

public class APPDiccionario {
    public static void main(String[] args) {
        // Crear una instancia del diccionario
        Diccionario diccionario = new Diccionario();

        // Cargar el diccionario con algunas palabras
        diccionario.nuevoPar("hola", "hello");
        diccionario.nuevoPar("gato", "cat");
        diccionario.nuevoPar("perro", "dog");
        diccionario.nuevoPar("libro", "book");
        diccionario.nuevoPar("manzana", "apple");

        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        String respuestaUsuario;

        // Iniciar el cuestionario
        System.out.println("¡Bienvenido al cuestionario de Diccionario Español-Inglés!");
        System.out.println("Escribe 'fin' para terminar el programa en cualquier momento.");

        do {
            // Obtener una palabra aleatoria en español
            String palabraEspanol = diccionario.palabraAleatoria();
            // Mostrar la primera letra de la traducción como pista
            System.out.println("¿Cómo se dice '" + palabraEspanol + "' en inglés?");
            System.out.println("Pista: La palabra en inglés empieza con la letra '" + diccionario.primeraLetraTraduccion(palabraEspanol) + "'");

            // Leer la respuesta del usuario
            respuestaUsuario = scanner.nextLine().trim();

            // Si el usuario escribe "fin", salir del bucle
            if (respuestaUsuario.equalsIgnoreCase("fin")) {
                break;
            }

            // Verificar la respuesta
            String traduccionCorrecta = diccionario.traduce(palabraEspanol);
            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
            }
        } while (!respuestaUsuario.equalsIgnoreCase("fin"));

        // Cerrar el scanner
        scanner.close();
        System.out.println("¡Gracias por jugar! El programa ha finalizado.");
    }
}
