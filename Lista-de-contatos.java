//Crie um código sobre uma lista de contatos

public class Contato {
    private String nome;
    private String email;
    Contato(){
        
    }
    Contato(String nome, String email){
        this.nome=nome;
        this.email=email;
        
    }
    public String getNome(){
        return this.nome;
        
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getEmail(){
        return email;
        
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String toString(){
        return "Contato [nome=" + nome + ", email=" + email + "]";
    }
}
public class No{
    private Contato contato;
    private No proximo;
    No(Contato contato){
        this.contato=contato;
        this.proximo=null;
    }
    Contato getContato(){
        return this.contato;
    }
    public void setContato(Contato contato){
        this.contato=contato; 
    }
    public No getProximo(){ 
        return proximo;
    }
    public void setProximo(No proximo){
        this.proximo=proximo;
    }
    public String toString(){
        return "No [contato=" + contato + ", proximo=" + proximo + "]";
    
    }
}
public class Lista {
    private int tamanho;
    private No inicio;
    
    public Lista(){
        tamanho=0;
        inicio = null;
        
    }
    public void adicionar(Contato contato){
        Contato auxiliar = find(contato.getNome());
        if (auxiliar==null){
            No no= new No(contato);
            no.setProximo(inicio);
            inicio = no;
            inicio=no;
            tamanho++;
            
        }else{
            System.out.println("Erro");
            
        }
        
    }
    public Contato find(String email) {
        for(No no=inicio;no!=null;no=no.getProximo()) {
            if(no.getContato().getEmail()==email) {
                return no.getContato();
                
            }
            
        }
        return null;
        
    }
    public void print(){
        for(No no=inicio;no!=null;no=no.getProximo()) {
            System.out.println(no.getContato());
            
        }
    }
}
public class Principal {
    public static void main(String[] args){
        Lista contato = new Lista();
        contato.adicionar(new Contato("Ana","ana@gmail.com"));
        contato.adicionar(new Contato("Paulo","@gmail.com"));
        contato.print(); 
    }
}
