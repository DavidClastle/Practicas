
public class Principal {

    
    public static void main(String[] args) {
       Prueba[] apArreglo = new Prueba [5];
        System.out.println(apArreglo);
        for (int i = 0; i < apArreglo.length; i++) {
        apArreglo[i]= new Prueba();
            System.out.println(apArreglo[i]);
        }
    }
    
}

class Prueba{}
