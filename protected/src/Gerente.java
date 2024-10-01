public class Gerente extends Funcionario{

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        salario = salario + (salario * 0.20);
        return salario;
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente gerencia");
    }
}
