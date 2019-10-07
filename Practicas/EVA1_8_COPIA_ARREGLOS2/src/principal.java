
public class principal {

    public static void main(String[] args) {
       
        int aiDatos[]=new int[10];
        int aiCopia[]=new int[10];
        System.out.println("Datos originales");
        for (int i = 0; i < aiDatos.length; i++) {
             aiDatos[i]=(int)(Math.random()*100)+1;
        }
        for (int i = 0; i < aiDatos.length; i++) {
             System.out.println("["+aiDatos[i]+"]");
             
             System.out.println("");
             
                         
        }
         for (int i = 0; i < aiDatos.length; i++) {
                 aiCopia[i] = aiDatos[i];
                
            }
         Imprimir(aiDatos);
         Imprimir(aiCopia);
    }
    public static void Imprimir(int [] args){
    for (int i = 0; i < args.length; i++) {
             System.out.print("["+args[i]+"]");
        }
        System.out.println(args);
    }
    
}
