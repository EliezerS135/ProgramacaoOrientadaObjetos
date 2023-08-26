package exe2;

public class TestarCliente {

    public static void main(String[] args) {
        Cliente fulano = new Cliente(2232, 12,"Fulano", 76238 );
        fulano.status();
        fulano.realizarDeposito(20000);
        fulano.realizarSaque(50000);
        fulano.status();

        Cliente beltrano = new Cliente(2232, 12,"Beltrano", 34560 );
        beltrano.status();
        beltrano.realizarDeposito(20000);
        beltrano.realizarSaque(50000);
        beltrano.status();



    }
}
