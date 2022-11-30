package model;

public class Horista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;

    public Horista(int registro, String nome, int qtdeHoras, double valorHora) {
        super(registro, nome);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return qtdeHoras * valorHora;
    }

    
    
}