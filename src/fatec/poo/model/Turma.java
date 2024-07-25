package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author leomoraes
 */
public class Turma {

    private int codigo;
    private int qtdeVagas;
    private String sigla;
    private ArrayList<Matricula> matriculas;
    private Instrutor instrutor;
    private Curso curso;

    public Turma(int cod, String sigla) {
        codigo = cod;
        this.sigla = sigla;

        matriculas = new ArrayList<Matricula>();
    }

    public void setQtdeVagas(int qV) {
        qtdeVagas = qV;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void setCurso(Curso c) {
        curso = c;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setInstrutor(Instrutor i) {
        instrutor = i;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public String getSigla() {
        return sigla;
    }

    public void addMatricula(Matricula m) {
        matriculas.add(m);
        m.setTurma(this);
    }

    public int calcQtdeAprovados() {

        int quant = 0;

        for (int i = 0; i < matriculas.size(); i++) {

            if (matriculas.get(i).getMedia() >= 5 && matriculas.get(i).getQtdeFaltas() / curso.getCargaHoraria() <= 0.4) {
                quant++;
            }

        }

        return quant;
    }

    public int calcQtdeReprovados() {

        return matriculas.size() - calcQtdeAprovados();
    }

    public String getSituacaoAluno(Matricula m) {

        int qtdeFaltas = m.getQtdeFaltas(); // 
        int cargaHoraria = curso.getCargaHoraria();

        double porcentagemFalta = (double) qtdeFaltas / cargaHoraria;

        if (m.getMedia() >= 5 && porcentagemFalta <= 0.4) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }

    }

    public void listarAlunos() {

        System.out.println("\n\n---------------------------------------");
        System.out.println("\n\n\t\t\t\tRelação Alunos da Turma\n");

        System.out.println("Sigla do Curso: " + curso.getSigla() + "\t\t" + "Nome do Curso: " + curso.getDescricao());
        System.out.println("\nSigla da Turma: " + sigla);
        System.out.println("\nNome do Instrutor: " + instrutor.getNome());
        System.out.println("");
        System.out.println("\tNome do Aluno\tQtde. Faltas\tMédia\tSituação");

        for (int i = 0; i < matriculas.size(); i++) {

            Matricula m = matriculas.get(i);

            System.out.println("\t" + m.getAluno().getNome() + "\t" + m.getQtdeFaltas() + "\t" + m.getMedia() + "\t" + getSituacaoAluno(m));
        }

        System.out.println("");
        System.out.println("Qtde. de Alunos: " + matriculas.size());
        System.out.println("Qtde. de Alunos Aprovados: " + calcQtdeAprovados());
        System.out.println("Qtde. de Alunos Reprovados: " + calcQtdeReprovados());

    }
}
