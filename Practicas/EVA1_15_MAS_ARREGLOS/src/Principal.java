public class Principal {

 
    public static void main(String[] args) {
        int iNume=10;
        System.out.println("valor "+iNume);
        incrementa(iNume);
        System.out.println("valor "+ iNume);
        Prueba obj = new Prueba();
        obj.iVal=10;
        System.out.println("valor "+obj.iVal);
        incrementaObj(obj);
        System.out.println("valor "+ obj.iVal);
        
    }
    public static void incrementa(int iVal){
    iVal++;
    
    }
    public static void incrementaObj (Prueba obj){
    obj.iVal++;
    }
}
class Prueba{
int iVal;
}
