package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudos;
    private double[] notas = new double[4];
    private int numeroNotas;
    private int[] pesos = new int[notas.length];

    public Disciplina(int numeroNotas){
        this.numeroNotas = numeroNotas;
    }

    public Disciplina(String nomeDisciplina, int numeroNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.numeroNotas = numeroNotas;
        this.pesos = pesos;
    }
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horas) {
        horasEstudos += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public double calculaMedia(int[] pesos){
        double soma = 0;
        double ponderada = 0;
        double listaPesos = 0;

        if (pesos == null) {
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            double media = soma / notas.length;
            return media;

        }else {
            for (int i = 0; i < notas.length; i++){
                ponderada += notas[i] * pesos[i];
                listaPesos += pesos[i];
            }
            double mediaPonderada = ponderada / listaPesos;
            return mediaPonderada;
        }
    }

    public boolean aprovado() {
        if (calculaMedia(pesos) >= 7){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return nomeDisciplina + " " + horasEstudos + " " + calculaMedia(pesos) + " " + Arrays.toString(this.notas);
    }
}