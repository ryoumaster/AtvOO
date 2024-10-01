public class Funcionario {
    private String nome;
    protected Double salario;

    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("O funcionário realiza o trabalho");
    }
}
