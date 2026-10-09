package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudos;
    private double[] notas;
    private int numeroNotas;
    private double[] pesos;

    public Disciplina(int numeroNotas) {
        this.numeroNotas = numeroNotas;
        this.notas = new double[numeroNotas];
    }

    public Disciplina(String nomeDisciplina, int numeroNotas, double[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroNotas = numeroNotas;
        this.notas = new double[numeroNotas];
        this.pesos = pesos;
    }

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroNotas = 4;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horas) {
        horasEstudos += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public double calculaMedia(double[] pesos) {
        double soma = 0;
        double ponderada = 0;
        double listaPesos = 0;

        if (pesos == null) {
           // if (notas.length == 0) {
            //    return 0.0;
            //}
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            double media = soma / notas.length;
            return media;

        } else {
            for (int i = 0; i < notas.length; i++) {
                ponderada += notas[i] * pesos[i];
                listaPesos += pesos[i];
            }
            //if (listaPesos == 0) { return 0.0;}
            double mediaPonderada = ponderada / listaPesos;
            return mediaPonderada;
        }
    }

    public boolean aprovado() {
        if (calculaMedia(pesos) >= 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (pesos == null) {
            return nomeDisciplina + " " + horasEstudos + " " + calculaMedia(null) + " " + Arrays.toString(notas);
        } else {
            return nomeDisciplina + " " + horasEstudos + " " + calculaMedia(pesos) + " " + Arrays.toString(notas);
        }
    }
}