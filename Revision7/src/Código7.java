import java.util.HashMap;
import java.util.Scanner;

//este codigo solicita el nombre de un país y devuelve la capital si la conoce, en caso de que
//no la conozca entonces tú pudees decirle cuál es y te agradecerá, para salir del bucle se tiene que
// escribir "salir"

public class Código7 {

    public static void main(String[] args) {
        // se inicia el scaner para leer desde la consola
        Scanner s = new Scanner(System.in);

        // se corrige el hashmap para poder leer pares de String (país, capital)
        HashMap<String, String> ca = new HashMap<>();

        // Se le agregan las capitales a los países 
        ca.put("Canadá", "Ottawa");
        ca.put("Estados Unidos", "Washington DC");
        ca.put("México", "México DF");
        ca.put("Belice", "Belmopán");
        ca.put("Costa Rica", "San José");
        ca.put("El Salvador", "San Salvador");
        ca.put("Guatemala", "Ciudad de Guatemala");
        ca.put("Honduras", "Tegucigalpa");
        ca.put("Nicaragua", "Managua");
        ca.put("Panamá", "Panamá");

        // ISe inicia la variable "c" para almacenar los datos que ponga el usuario
        String c = "";

        // se haceun blucle para que el usuario solo pueda salir si escribe "salir"
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            c = s.nextLine(); // con esto se puede leer el nombre del país
            
            if (!c.equals("salir")) { // se compara con "equals"
                if (ca.containsKey(c)) { // se verifica si el país escrito se encuentra en el hashmap
                    System.out.print("La capital de " + c);
                    System.out.println(" es " + ca.get(c)); // se obtiene la capital
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + c + "?: ");
                    String capital = s.nextLine(); // se lee una capital nueva
                    ca.put(c, capital); // se guarda la nueva capital
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!c.equals("salir")); // se termina el ciclo cuando se escribe "salir"
        
        s.close(); // se cierra el scanner
    }
}
