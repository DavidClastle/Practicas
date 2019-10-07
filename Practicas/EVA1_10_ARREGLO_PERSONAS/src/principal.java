
import java.util.Scanner;


public class principal {

    public static void main(String[] args) {
       Persona[] aPersonas= new Persona[5];
       Scanner d= new Scanner(System.in);
        for (int i = 0; i < aPersonas.length; i++) {
            aPersonas[i]= new Persona();
            System.out.println("Introduce tu nombre");
            aPersonas[i].nombre = d.nextLine();
        }
        imprimirArreglo(aPersonas);
        //COPIA DEL ARREGLO
        Persona[] aCopias = new Persona[aPersonas.length];
        for (int i = 0; i < aCopias.length; i++) {
            aCopias[i] = new Persona();
            aCopias[i].nombre = aPersonas[i].nombre;
            
        }
    }
    public static void imprimirArreglo(Persona[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("nombre: "+ args[i].nombre);
        }
    }
}
class Persona{
String nombre;
}
