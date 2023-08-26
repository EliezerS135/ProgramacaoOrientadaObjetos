package exe01;

public class Aluno {
    public String nome;
    public int numeroAluno, idade;
    public float p1, p2;

    public Aluno(){}

    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){ return (this.p1 + this.p2) / 2;
    }

    public void passou() {
        if (this.notaFinal() >= 6) {
            System.out.println("Passou");
        } else {
            System.out.println("Não passou");
        }
    }

    public String dadosAluno(){
        return "Número do aluno: " + this.numeroAluno +
                ", Nome: " + this.nome +
                ", Idade: " + this.idade +
                ", Média: " + this.notaFinal();
    }

    public void info(){
        System.out.println(this.dadosAluno());
    }
}
