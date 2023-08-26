package exe2;

public class Cliente {

    int numeroConta, numeroAgencia;
    String nome;
    float saldo;

    public Cliente(){}

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(int mone){
        this.saldo += mone;

        System.out.println(this.nome+ " você adicionou: " + mone+" a sua conta");
    }

    public void realizarSaque(int mone){
        this.saldo -= mone;
        System.out.println(this.nome+ " você retirou: " + mone+" da sua conta");
    }

    public void status(){
        System.out.println(
                "Numero da conta: " + this.numeroConta+"\n"+
                "Nome do cliente: "+this.nome+"\n"+
                "Saldo atual: "+this.saldo+"\n");
    }
}

