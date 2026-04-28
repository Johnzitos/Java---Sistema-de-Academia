package academia;

import java.util.ArrayList;

public class Personal extends Pessoa {

    private double salario;
    private String h_inicio;
    private String h_fim;
    private ArrayList<Modalidade> modalidades = new ArrayList<Modalidade>();

    public Personal(double salario, String h_inicio, String h_fim, String nome, String CPF, String telefone) {
        super(nome, CPF, telefone);
        this.salario = salario;
        this.h_inicio = h_inicio;
        this.h_fim = h_fim;
    }

    public void adicionarModalidade(Modalidade modalidade) {
        modalidades.add(modalidade);
    }

    public void getInfo() {
        System.out.println("Informações: Nome: " + getNome() + " | CPF: " + getCPF() + " | Telefone: " + getTelefone() + " | Salário: " + getSalario() + " | Horário: " + getH_inicio() + " - " + getH_fim());
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

    /**
     * @return the h_inicio
     */
    public String getH_inicio() {
        return h_inicio;
    }

    /**
     * @param h_inicio the h_inicio to set
     */
    public void setH_inicio(String h_inicio) {
        this.h_inicio = h_inicio;
    }

    /**
     * @return the h_fim
     */
    public String getH_fim() {
        return h_fim;
    }

    /**
     * @param h_fim the h_fim to set
     */
    public void setH_fim(String h_fim) {
        this.h_fim = h_fim;
    }

    /**
     * @return the modalidades
     */
    public ArrayList<Modalidade> getModalidades() {
        return modalidades;
    }

    /**
     * @param modalidades the modalidades to set
     */
    public void setModalidades(ArrayList<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }
}
