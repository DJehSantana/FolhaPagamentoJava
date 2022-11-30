package model;

public class Gerente extends Funcionario {
    private double salarioBase;
    private double adicional;
    private double ticketRefeicao;

    public Gerente(int registro, String nome, double salarioBase, double adicional, double ticketRefeicao) {
        super(registro, nome);
        this.salarioBase = salarioBase;
        this.ticketRefeicao = ticketRefeicao;
        this.adicional = adicional;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getAdicional() {
        return adicional;
    }

    public double getTicketRefeicao() {
        return ticketRefeicao;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTicketRefeicao(double ticketRefeicao) {
        this.ticketRefeicao = ticketRefeicao;
    }

    @Override
    public double calcularSalario() {        
        return salarioBase + salarioBase * adicional / 100 + ticketRefeicao;
    }
}