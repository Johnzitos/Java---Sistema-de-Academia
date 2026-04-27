package academia;

import java.util.ArrayList;

public class Academia {

    private String nome;
    private String endereco;
    private String CNPJ;
    private ArrayList<Personal> personais = new ArrayList<Personal>();
    private ArrayList<Recepcionista> recepcionistas = new ArrayList<Recepcionista>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

    public Academia(String nome, String endereco, String CNPJ) {
        this.nome = nome;
        this.endereco = endereco;
        this.CNPJ = CNPJ;
    }

    public void cadastrarPersonal(Personal p) {
        personais.add(p);
    }

    public void cadastrarRecepcionista(Recepcionista r) {
        recepcionistas.add(r);
    }

    public void cadastrarAluno(Aluno a) {
        alunos.add(a);
    }

    public Matricula realizarMatricula(Aluno aluno, Recepcionista recepcionista, String data, String plano, double valor) {
        Matricula m = new Matricula(aluno, recepcionista, data, plano, valor);
        matriculas.add(m);
        return m;
    }

    public Aluno buscarAluno(String cpf) {
        for (Aluno a : alunos) {
            if (a.getCPF().equals(cpf)) {
                return a;
            }
        }
        return null;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the personais
     */
    public ArrayList<Personal> getPersonais() {
        return personais;
    }

    /**
     * @param personais the personais to set
     */
    public void setPersonais(ArrayList<Personal> personais) {
        this.personais = personais;
    }

    /**
     * @return the recepcionistas
     */
    public ArrayList<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    /**
     * @param recepcionistas the recepcionistas to set
     */
    public void setRecepcionistas(ArrayList<Recepcionista> recepcionistas) {
        this.recepcionistas = recepcionistas;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the matriculas
     */
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    /**
     * @param matriculas the matriculas to set
     */
    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
