package academia;

public class Aluno extends Pessoa {

    private String endereco;
    private String dt_nascimento;
    private String objetivo;

    public Aluno(String endereco, String dt_nascimento, String objetivo, String nome, String CPF, String telefone) {
        super(nome, CPF, telefone);
        this.endereco = endereco;
        this.dt_nascimento = dt_nascimento;
        this.objetivo = objetivo;
    }

    public void getInfo() {
        System.out.println("Informações: Nome: " + getNome() + " | CPF: " + getCPF() + " | Telefone: " + getTelefone() + " | Endereço: " + getEndereco() + " | Nascimento: " + getDt_nascimento() + " | Objetivo: " + getObjetivo());
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dt_nascimento
     */
    public String getDt_nascimento() {
        return dt_nascimento;
    }

    /**
     * @param dt_nascimento the dt_nascimento to set
     */
    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
