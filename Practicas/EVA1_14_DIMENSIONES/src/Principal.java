
public class Principal {

   
    public static void main(String[] args) {
        int aMatriz[][] = new int[2][3];
        int aMatriz2[][];
        aMatriz2 = new int[3][];
        aMatriz2[0] = new int [10];
        aMatriz2[1]= new int[100];
        aMatriz2[2]= new int [24];
        for (int i = 0; i < aMatriz2.length; i++) {
            for (int j = 0; j < aMatriz2[i].length; j++) {
                aMatriz2[i][j]= (int)(Math.random()*100);
                
            }
        }
           for (int i = 0; i < aMatriz2.length; i++){
       for (int j = 0; j < aMatriz2[i].length; j++) {
           System.out.print("["+aMatriz2[i][j]+"]");
       }
       System.out.println("");
}
        }
    }
    

