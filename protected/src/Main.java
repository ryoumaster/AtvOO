public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("paulo", 4000.00);
        System.out.println(dev.calcularBonus());
        dev.trabalhar();

        Gerente ger = new Gerente("Eduardo", 8000.00);
        System.out.println(ger.calcularBonus());
        ger.trabalhar();
    }
}