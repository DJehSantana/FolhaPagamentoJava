package model;

public class Comissionado extends Funcionario {
    private double salarioBase;
    private double comissao;

    public Comissionado(int registro, String nome, double salarioBase, double comissao) {
       super(registro, nome);
       this.salarioBase = salarioBase;
       this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {        
        return salarioBase + salarioBase * comissao / 100 ;
    }
    
    
}
