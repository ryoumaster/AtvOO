public class Trem implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O trem esta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O trem esta freando");
    }
}
