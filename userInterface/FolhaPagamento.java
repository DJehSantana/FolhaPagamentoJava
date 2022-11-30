package userInterface;

import model.Comissionado;
import model.Funcionario;
import model.Gerente;
import model.Horista;

public class FolhaPagamento {
    public static void main(String[] args) {
        Funcionario funcionario, funcionario2, funcionario3;

        funcionario = new Gerente(123, "Rodrigo", 4320.80, 6, 427.50);
        funcionario2 =new Comissionado(456, "Lucio", 1890.70, 15);
        funcionario3 = new Horista(789, "Alfredo", 200, 13.45);

        int qtdeHoras = ((Horista) funcionario3).getQtdeHoras();

        System.out.printf("Funcionario: %d - %S - Salario: R$ %.2f\n", funcionario.getRegistro(), funcionario.getNome(), funcionario.calcularSalario());
        System.out.printf("Funcionario: %d - %S - Salario: R$ %.2f\n", funcionario2.getRegistro(), funcionario2.getNome(), funcionario2.calcularSalario());
        System.out.printf("Funcionario: %d - %S - Horas trabalhadas: %d - Salario: R$ %.2f\n", funcionario3.getRegistro(), funcionario3.getNome(), qtdeHoras, funcionario3.calcularSalario());
    }
}