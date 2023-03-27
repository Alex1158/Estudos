package Aulagua;

public class Conta {

public int numConta;
protected String tipo;
private String dono;
private float saldo;
private boolean status;

public void estadoAtual(){
    System.out.println("------------------------------------------");
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Conta: "+ this.getTipo());
    System.out.println("Dono: "+ this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
}

public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    
    if("CC".equals(t)){
        this.setSaldo(50);
    }else if ("CP".equals(t)){
        this.setSaldo(150);  
    }
     System.out.println("Conta Aberta com sucesso!!");
}
   


public void fecharConta(){
    if (this.getSaldo()>0) {
        System.out.println("Conta não pode ser fechado porque ainda tem dinheiro ");
    }else if (this.getSaldo()<0){
        System.out.println("Conta não poder ser fechada pois tem débitos pendentes");
    }else {
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso!!");
      }       
}
public void depositar(float v){
    if (this.getStatus()){
        //this.saldo = this.saldo + v;
        this.setSaldo(this.getSaldo()+ v);
        System.out.println("Deposito realizado na conta de " + this.getDono());
    }else {
        System.out.println("Impossivel depositar em uma conta fechada !" );
    }        
}
public void sacar(float v){
    if(this.getStatus()){
        if(this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque Realizado da conta de : " + this.getDono());
        }else {
            System.out.println("Saldo insuficiente para saque ");
        }
    }else{
        System.out.println("impossível sacar de uma conta fechada !!! ");
    }
    
}
public void pagarMensal(){
    int v =0;
    if (this.getTipo() == "CC") {
        v=12;
        
    } else if(this.getTipo() == "CP") {
        v = 20;            
    }
    if (this.getStatus()) {
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Mensalidade paga com sucesso por: "+this.getDono());
    }else{
        System.out.println("Impossivel pagar um conta fechada !!");
    }
    
}
 public Conta() {
        this.saldo=0;
        this.status = false;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }public boolean getStatus(){
        return this.status;
    }
            
}

