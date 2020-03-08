package apppilha;

public class AppPilha {

    public static void main(String[] args) {
       
        Pilha pilha = new Pilha(5);
        
        pilha.push(5);
        pilha.push(5);
        pilha.push(3);
        pilha.push(2);
        pilha.push(1);
        
        pilha.pop();
        
        System.out.println("Pilha: \n" + pilha.printPilha());        
        System.out.println("Tamanho: " + pilha.size());        
    }
    
}
