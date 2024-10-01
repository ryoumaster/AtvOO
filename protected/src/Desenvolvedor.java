public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }
    public double calcularBonus(){
        salario = salario + (salario * 0.10);
        return salario;
    }

    @Override
    public void trabalhar() {
        System.out.println("O desenvolvedor desenvolve");
    }
}
