
package exe4;

public class TestaRio {


    public static void main(String[] args) {
        Rio obj1 = new Rio("Tiete", 1.4f, false);
        Rio obj2 = new Rio("Parana", 0.9f, true);

        obj1.ensolarar(0.3f);
        obj1.poluir();

        obj2.chover(0.4f);
        obj2.limpar();

        obj1.mostra();
        obj2.mostra();
    }
}