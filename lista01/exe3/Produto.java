package exe3;

public class Produto {

    int id, qtd;
    String descricao;
    float preco;
    public Produto(){

    }
    public Produto(int id, int qtd, String descricao, float preco) {
        this.id = id;
        this.qtd = qtd;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtd += x;
    }
    public void vender(int x){
        this.qtd -= x;
    }
    public void subir(float x){
        this.preco += x;
    }
    public void descer(float x){
        this.preco -= x;
    }
    public String info(){
        return "Id: "+this.id+
                ", quantidade: "+this.qtd+
                ", descricão: "+this.descricao+
                ", preço: "+this.preco+"\n";

    }

    public void status(){
        System.out.println(this.info());
    }
}
