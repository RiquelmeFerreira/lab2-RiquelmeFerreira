package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudos;
    private double valorNota;
    private double[] notas = new double[4];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horas) {
        horasEstudos += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public double calculaMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        return media;
    }

    public boolean aprovado() {
        if (calculaMedia() >= 7){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return nomeDisciplina + " " + horasEstudos + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}