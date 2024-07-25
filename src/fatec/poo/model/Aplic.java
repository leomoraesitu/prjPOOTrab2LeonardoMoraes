package fatec.poo.model;

import java.util.Scanner;

/**
 *
 * @author leomoraes
 */
public class Aplic {

    private static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        System.out.print("Digite a sigla do Curso: ");
        String sigla = entrada.nextLine();
        System.out.print("Digite o nome do Curso: ");
        String nomeCurso = entrada.nextLine();
        Curso curso = new Curso(sigla, nomeCurso);

        System.out.print("Digite a carga horária: ");
        int cHor = lerInteiro();
        curso.setCargaHoraria(cHor);

        System.out.print("Digite o valor do curso: ");
        double val = lerNumerico();
        curso.setValor(val);

        System.out.print("\nDigite o codigo do Instrutor: ");
        int codInst = lerInteiro();
        System.out.print("Digite o nome do Instrutor: ");
        String nomeInst = entrada.nextLine();
        Instrutor instrutor = new Instrutor(codInst, nomeInst);

        System.out.print("Escolha a Área de Atuacao do Instrutor: ");
        System.out.println("\n1 - Desenvolvimento Web");
        System.out.println("2 - Banco de Dados");
        System.out.println("3 - Redes");
        System.out.print("\n\tDigite a opcao: ");
        int opcao = lerInteiro();
        switch (opcao) {
            case 1:
                instrutor.setAreaAtuacao("Desenvolvimento Web");
            case 2:
                instrutor.setAreaAtuacao("Banco de Dados");
            case 3:
                instrutor.setAreaAtuacao("Redes");
        }

        System.out.print("\nDigite a data de nascimento do Instrutor: ");
        String nascInst = entrada.nextLine();
        instrutor.setDtNascimento(nascInst);

        System.out.print("Informe o endereco do Instrutor: ");
        String endInst = entrada.nextLine();
        instrutor.setEndereco(endInst);

        System.out.print("Informe o valor da Hora/Trabalho do Instrutor: ");
        int hrTrab = lerInteiro();
        instrutor.setValorHora(hrTrab);

        System.out.print("\nDigite o codigo do Aluno 1: ");
        String codAl = entrada.nextLine();
        System.out.print("Digite o nome do Aluno 1: ");
        String nomeAl = entrada.nextLine();
        Aluno aluno1 = new Aluno(codAl, nomeAl);
        System.out.print("Escolha a Escolaridade do Aluno 1: ");
        System.out.println("\n1 - Ensino Medio");
        System.out.println("2 - Ensino Superior");
        System.out.println("3 - Pos-Graduacao");
        System.out.print("\n\tDigite a opcao: ");
        opcao = lerInteiro();
        switch (opcao) {
            case 1:
                aluno1.setEscolaridade("Ensino Médio");
            case 2:
                aluno1.setEscolaridade("Ensino Superior");
            case 3:
                aluno1.setEscolaridade("Pos-Graduacao");
        }

        System.out.print("Informe a data da matricula do Aluno 1: ");
        String dtMt = entrada.nextLine();
        Matricula matricula1 = new Matricula(dtMt);

        matricula1.setAluno(aluno1);

        System.out.print("Informe a media do Aluno 1: ");
        double medAl = lerNumerico();
        matricula1.setMedia(medAl);

        System.out.print("Digite o numero de faltas do Aluno 1: ");
        int numF = lerInteiro();
        matricula1.setQtdeFaltas(numF);

        Aluno aluno2 = new Aluno(
                "2020", "Susley Rodrigues");
        aluno2.setEscolaridade("Ensino Superior");
        Aluno aluno3 = new Aluno(
                "3030", "Leonardo Rodrigues");
        aluno3.setEscolaridade("Ensino Superior");
        Aluno aluno4 = new Aluno(
                "4040", "Vinicius Moraes");
        aluno4.setEscolaridade("Ensino Medio");
        Aluno aluno5 = new Aluno(
                "5050", "Andrei Lopes");
        aluno5.setEscolaridade("Pos Graduacao");

        Matricula matricula2 = new Matricula("12/01/2023");
        matricula2.setAluno(aluno2);
        matricula2.setMedia(6);
        matricula2.setQtdeFaltas(20);

        Matricula matricula3 = new Matricula("05/01/2023");
        matricula3.setAluno(aluno3);
        matricula3.setMedia(5);
        matricula3.setQtdeFaltas(9);

        Matricula matricula4 = new Matricula("26/12/2022");
        matricula4.setAluno(aluno4);
        matricula4.setMedia(9);
        matricula4.setQtdeFaltas(21);

        Matricula matricula5 = new Matricula("07/01/2023");
        matricula5.setAluno(aluno5);
        matricula5.setMedia(7.5);
        matricula5.setQtdeFaltas(30);

        Turma turma1 = new Turma(1010, "Turma A");
        turma1.addMatricula(matricula1);
        turma1.addMatricula(matricula2);
        turma1.addMatricula(matricula3);
        Turma turma2 = new Turma(2020, "Turma B");
        turma2.addMatricula(matricula4);
        turma2.addMatricula(matricula5);

        instrutor.addTurma(turma1);
        instrutor.addTurma(turma2);
        curso.addTurma(turma1);
        curso.addTurma(turma2);

        turma1.listarAlunos();

    }

    private static int lerInteiro() {
        String digitado = "";

        digitado = entrada.nextLine();

        return Integer.parseInt(digitado);
    }

    private static double lerNumerico() {
        String digitado = "";

        digitado = entrada.nextLine();

        return Double.parseDouble(digitado);
    }

}
