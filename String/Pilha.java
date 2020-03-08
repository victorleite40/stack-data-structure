package apppilha.string;

public class Pilha {
    
    private int topo;
    private String pilha[];
    
    public Pilha(int quantidade) {
        topo = 0;
        pilha = new String[quantidade];
    }
    
    public Boolean isFull(){
        return topo==pilha.length;
    }
    
    public Boolean isEmpty(){
        return topo==0;
    }
    
    public void push(String dado) {
        if (!isFull()) {
            pilha[topo++]=dado;
        }
    }
    
    public int size(){
        return topo;
    }
    
    public String pop(){
        return !isEmpty() ? pilha[--topo] : "";
    }
     
    public String top(){
        return !isEmpty() ? pilha[topo-1] : "";
    }
    
    public String printPilha(){
        String pilhaStr = "";
        
        for (int i = topo-1 ; i>=0 ; i--) {
            pilhaStr += pilha[i] + "\n";
        }
        
        return pilhaStr;
    }
    
}