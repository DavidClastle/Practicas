
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de arreglos 
        int aiDatos[] = new int[10];
       
        System.out.println(aiDatos);
        for(int i = 0;i < aiDatos.length; i++){ 
            aiDatos [i]= (int)(Math.random()*100)+1;
        }
        for(int i=0;i <aiDatos.length;i++){
            System.out.println(aiDatos[i]);
        }
        System.out.println("FOR EACH");
        
        for (int aiDato : aiDatos) { 
            System.out.println(aiDato);
            
        }
            
        }
        
        
    }
    

