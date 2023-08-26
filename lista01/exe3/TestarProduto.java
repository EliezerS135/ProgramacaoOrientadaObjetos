package exe3;

public class TestarProduto {

    public static void main(String[] args) {

        Produto obj1 = new Produto(1122, 23, "Geladeira G34", 8499);
        obj1.comprar(2);
        obj1.vender(5);
        obj1.subir(300);
        obj1.descer(200);
        System.out.println(obj1.info());


        Produto obj2 = new Produto(3344, 14, "Notebook book3", 2999);
        obj2.comprar(2);
        obj2.vender(5);
        obj2.subir(300);
        obj2.descer(200);
        obj2.status();

    }
}
