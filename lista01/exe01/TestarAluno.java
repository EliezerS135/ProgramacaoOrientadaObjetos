package exe01;

public class TestarAluno {


    public static void main(String[] args) {

        Aluno obj1 = new Aluno("Eliezer", 21, 19, 8,10);
        System.out.println(obj1.dadosAluno());
        obj1.passou();

        Aluno obj2 = new Aluno("Santos", 77, 20, 7,10);
        obj2.info();
        obj2.passou();

    }
}
