public class Carro implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O carro esta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O carro esta freando");
    }
}
