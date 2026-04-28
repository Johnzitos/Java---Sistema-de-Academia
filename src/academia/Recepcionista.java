package academia;

public class Recepcionista extends Pessoa {

    private double salario;

    public Recepcionista(double salario, String nome, String CPF, String telefone) {
        super(nome, CPF, telefone);
        this.salario = salario;
    }

    public void getInfo() {
        System.out.println("Informações: Nome: " + getNome() + " | CPF: " + getCPF() + " | Telefone: " + getTelefone() + " | Salário: " + getSalario());
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
