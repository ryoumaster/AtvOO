public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("A bicicleta esta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta esta freando");
    }
}
