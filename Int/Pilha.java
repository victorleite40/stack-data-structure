package apppilha;

public class Pilha {
    
    private int topo;
    private int pilha[];
    
    public Pilha(int quantidade) {
        topo = 0;
        pilha = new int[quantidade];
    }
    
    public Boolean isFull(){
        return topo==pilha.length;
    }
    
    public Boolean isEmpty(){
        return topo==0;
    }
    
    public void push(int dado) {
        if (!isFull()) {
            pilha[topo++]=dado;
        }
    }
    
    public int size(){
        return topo;
    }
    
    public int pop(){
        return !isEmpty() ? pilha[--topo] : -1;
    }
     
    public int top(){
        return !isEmpty() ? pilha[topo-1] : -1;
    }
    
    public String printPilha(){
        String pilhaStr = "";
        
        for (int i = topo-1 ; i>=0 ; i--) {
            pilhaStr += Integer.toString(pilha[i]) + "\n";
        }
        
        return pilhaStr;
    }
    
}