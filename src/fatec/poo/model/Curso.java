package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author leomoraes
 */
public class Curso {

    private String sigla;
    private String descricao;
    private int cargaHoraria;
    private double valor;
    private ArrayList<Turma> turmas;

    public Curso(String s, String descr) {
        sigla = s;
        descricao = descr;

        turmas = new ArrayList<Turma>();
    }

    public void setCargaHoraria(int cH) {
        cargaHoraria = cH;
    }

    public void setValor(double vLr) {
        valor = vLr;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void addTurma(Turma t) {
        turmas.add(t);
        t.setCurso(this);
    }
}
