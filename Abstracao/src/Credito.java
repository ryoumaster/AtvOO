public class Credito extends FormaPagamento{
    private String numeroCartao;
    private String codigo;
    private String titular;
    private String senha;
    private double limite;

    public Credito(String titular, String codigo, String numeroCartao, String senha, double limite) {
        this.titular = titular;
        this.codigo = codigo;
        this.numeroCartao = numeroCartao;
        this.senha = senha;
        this.limite = limite;
    }

    @Override
    public void realizarPagamento(double valor, String senha) {
    if (validar(senha, valor)){
        System.out.println("Pagamento no valor de: R$ " + valor + " realizado com sucesso");
    }
    else System.out.println("Falha no sistema");
    }

    @Override
    public boolean validar(String senha, double valor) {
        if(this.senha == senha && limite >= valor){
            System.out.println("Senha correta");
            return true;
        }else{
            System.out.println("Senha incorreta ou valor acima do limite");
            return false;
        }
    }
}
