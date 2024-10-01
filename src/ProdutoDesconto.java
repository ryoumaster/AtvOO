public class ProdutoDesconto extends Produto{
    public ProdutoDesconto(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public void AplicarDesconto(double desconto){
        double total = 0;
        double aplicarDesc;
        aplicarDesc = desconto/100;
        if (aplicarDesc <= 0.50){
            total = this.getPreco() * aplicarDesc;
            this.setPreco(total);
            System.out.println("Novo valor: " + total);
        }else System.out.println("Desconto invalido");

    }
}
