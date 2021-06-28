lss Array {
private int arrayA[] = new int[10];
private int arrayB[] = new int[10]; 



public int[] getArrayA(){
    return this.arrayA;
}
public int[] getArrayB(){
    return this.arrayB;
}
public void setArrayA(int x[]){
    this.arrayA = x;
}
public void setArrayB(int x[]){
    this.arrayB = x;
}
public void setArraANaPosicao(int x, int y){
    this.arrayA[y] = x;
}
public void setArraBNaPosicao(int x, int y){
    this.arrayB[y] = x;
}

public void calcula(int a, int b) throws ExcecaoDivisaoResultadoZero{
    if(b==0){
    throw new ArithmeticException("Não é possível dividir por zero");
    }else if(a/b==0){
    throw new ExcecaoDivisaoResultadoZero("Resultado divisão foi 0");
}        
        int c = a/b;
        if(c==0){
            
        }else{
        System.out.println("Resulado: "+ c);
        }
}

public void CalculaDivisaoArrays() throws ExcecaoDivisaoResultadoZero{
    for(int i=0;i<10;i++){
    try{
       calcula(arrayA[i],arrayB[i]);            
    }catch(ArithmeticException | ExcecaoDivisaoResultadoZero ex){
        System.out.println(ex.getMessage());
    }finally{
        System.out.println("A = "+arrayA[i]+" B = "+arrayB[i]);
    }
    }
}




}
 


public class ExcecaoDivisaoResultadoZero extends Exception {
    public ExcecaoDivisaoResultadoZero(String msg){
        super(msg);
    }package TP_04;


public class main {
    public static void main(String[] args)throws ExcecaoDivisaoResultadoZero{
        int a[] = new int[10]; 
        int b[] = new int[10]; 
        for(int i = 0;i<10;i++){
            a[i] = 0;
            b[i] = i;
        }
        Array teste = new Array();
        teste.setArrayA(a);
        teste.setArrayB(b);
        teste.CalculaDivisaoArrays();

    
}
}
    public ExcecaoDivisaoResultadoZero(String msg, Throwable causa){
        super(msg,causa);
    }
    
}
