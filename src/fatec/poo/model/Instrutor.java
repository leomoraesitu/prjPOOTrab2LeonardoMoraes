package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author leomoraes
 */
public class Instrutor extends Pessoa {

    private int codigo;
    private String areaAtuacao;
    private double valorHora;
    private ArrayList<Turma> turmas;

    public Instrutor(int cod, String nome) {
        super(nome);
        codigo = cod;
        turmas = new ArrayList<Turma>();
    }

    public void addTurma(Turma t) {
        turmas.add(t);
        t.setInstrutor(this);
    }

    public void setAreaAtuacao(String aAt) {
        areaAtuacao = aAt;
    }

    public void setValorHora(double vH) {
        valorHora = vH;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public double getValorHora() {
        return valorHora;
    }
}
