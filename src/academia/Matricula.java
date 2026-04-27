package academia;

public class Matricula {

    private Aluno aluno;
    private Recepcionista recepcionista;
    private String data;
    private String plano;
    private double valor;
    private String treino;
    private String evolucao;
    private String observacoes;

    public Matricula(Aluno aluno, Recepcionista recepcionista, String data, String plano, double valor) {
        this.aluno = aluno;
        this.recepcionista = recepcionista;
        this.data = data;
        this.plano = plano;
        this.valor = valor;
    }

    public boolean isAvulso() {
        return plano == null;
    }

    public void registrarTreino(String treino) {
        this.treino = treino;
    }

    public void registrarEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public void registrarObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void getInfo() {
        System.out.println("Informações: Aluno: " + getAluno().getNome() + " | Recepcionista: " + getRecepcionista().getNome() + " | Data: " + getData() + " | Plano: " + (isAvulso() ? "Avulso" : getPlano()) + " | Valor: " + getValor() + " | Treino: " + getTreino() + " | Evolução: " + getEvolucao() + " | Observações: " + getObservacoes());
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the recepcionista
     */
    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    /**
     * @param recepcionista the recepcionista to set
     */
    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the plano
     */
    public String getPlano() {
        return plano;
    }

    /**
     * @param plano the plano to set
     */
    public void setPlano(String plano) {
        this.plano = plano;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the treino
     */
    public String getTreino() {
        return treino;
    }

    /**
     * @return the evolucao
     */
    public String getEvolucao() {
        return evolucao;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }
}
