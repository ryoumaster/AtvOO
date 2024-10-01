public class Boleto extends FormaPagamento{
    private String numero;
    private double valor;

    public Boleto(double valor, String numero) {
        this.valor = valor;
        this.numero = numero;
    }

    @Override
    public void realizarPagamento(double dinheiro, String numero) {
        if(validar(numero, dinheiro)){
            System.out.println("Pagamento no valor de: R$" + valor + " Realizado com sucesso");
        }
        else System.out.println("Erro de processamento");
    }

    @Override
    public boolean validar(String numero, double dinheiro) {
        if(numero == this.numero && dinheiro >= valor){
            System.out.println("Pagamento aprovado");
            return true;
        }else {
            System.out.println("Numero incorreto ou valor insuficiente");
            return false;
        }
    }
}
