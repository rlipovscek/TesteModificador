class Conta{
    int numero;
    Cliente titular;
    private double saldo;
    private double limite;
    private static int numeroIncremental = 1;
    
    Conta(){
        this.numero = numeroIncremental;
        numeroIncremental++;
    }
    
    
    public void Saca(double valor){
        if((this.saldo+this.limite)>= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    } 
    
    
    public void Deposita(double valor){
        this.saldo +=valor;
    }
    
    public void setLimite(double valor){
        this.limite = valor;
    }
    
    
    public void getSaldo(){
        System.out.println("Saldo Atual: "+this.saldo);
    }
}

class Cliente{
    String nome;
    String endereco;
    
}

public class TesteModificador {
    public static void main(String[] args){
        
        Conta rodolpho = new Conta();
        Conta thiago = new Conta();
        
        System.out.println(rodolpho.numero+"\n"+thiago.numero);
        
        
    }
}
