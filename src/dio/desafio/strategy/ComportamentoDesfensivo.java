package dio.desafio.strategy;

public class ComportamentoDesfensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente....");
    }
}
