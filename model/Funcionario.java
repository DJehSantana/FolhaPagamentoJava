package model;

public abstract class Funcionario {
    protected int registro;
    protected String nome;

    public Funcionario(int registro, String nome) {
        super();
        this.registro = registro;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    //métodos que devem ser implementados pelas subclasses
    public abstract double calcularSalario();    
    
}