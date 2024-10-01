public class Main {
    public static void main(String[] args) {
        Credito cartao =  new Credito("Paulo", "235", "123456789","13092000", 1200);
        cartao.realizarPagamento(1201,"13092000");
        Boleto boleto = new Boleto(1200,"123456789");
        boleto.realizarPagamento(1200,"123456789");
    }
}