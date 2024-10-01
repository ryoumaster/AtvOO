abstract class FormaPagamento {
    public abstract void realizarPagamento(double valor, String senha);

    public abstract boolean validar(String senha, double valor);
}
