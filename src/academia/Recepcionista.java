/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;

/**
 *
 * @author john
 */
public class Recepcionista extends Pessoa {
    private double salario;

    public Recepcionista(double salario, String nome, String CPF, String telefone) {
        super(nome, CPF, telefone);
        this.salario = salario;
    }

    public void getInfo(){
    
        
        
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
