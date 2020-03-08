package apppilha.string;

public class AppPilhaString {

    public static void main(String[] args) {
       
        Pilha pilha = new Pilha(5);
        
        pilha.push("a");
        pilha.push("b");
        pilha.push("c");
        pilha.push("d");
        pilha.push("c");
        
        pilha.pop();
        
        System.out.println("Pilha: \n" + pilha.printPilha());        
        System.out.println("Tamanho: " + pilha.size());        
    }
    
}
