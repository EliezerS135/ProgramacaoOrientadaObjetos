
package exe4;

import java.text.DecimalFormat;

public class Rio {
    public float nivel;
    public boolean poluido;
    public String nome;

    public Rio(){
    }
    public Rio(String nome, float nivel,
               boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void poluir(){
        this.poluido = true;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if (x <= this.nivel){
            this.nivel -= x;
        }
        else System.out.println("Nível não pode ser negativo");
    }
    public void mostra(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Nome: " + this.nome + " Nível: " +
                df.format(this.nivel) + " Poluído: " +
                (this.poluido ? "Sim": "Não"));
    }
}
    