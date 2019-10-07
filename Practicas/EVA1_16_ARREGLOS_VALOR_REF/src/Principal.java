
public class Principal {

    public static void main(String[] args) {
    
    int[] arreglo = new int[10];
        System.out.println(arreglo);
    Arreglo(arreglo);
    MadrearArreglo(arreglo);
     System.out.println(arreglo);
        ImprimirArreglo(arreglo);
        
       
        
    }
    public static void Arreglo(int[] arre){
        for (int i = 0; i < arre.length; i++) {
            arre[i]= (int)(Math.random()*100);
        }
        
    }
    public static void ImprimirArreglo(int[] arre){
        for (int i = 0; i < arre.length; i++) {
            System.out.print("["+arre[i]+"]");
        }
        System.out.println("");
    }
    public static void MadrearArreglo(int[] arre){
    arre= new int[100];
        System.out.println(arre);
    }
    
}

