package lab2;

import java.util.Arrays;

/**
 *
 * A classe calcula a média aritmética se não houver pesos, caso contrário, calcula
 * a ponderada, as duas média sem arredondamento. Por padrão são 4 notas, se alguma
 * nota não for cadrastrada é considerada zero e se alguma for cadrastada mais de uma
 * vez, a última nota é cadrastrada. O aluno é considerado aprovado se a média for maior
 * ou igual a 7.0.
 *
 * @author Lucas Riquelme Ferreira Alexandre
 */

public class Disciplina {
    /** Representa nome da disciplina. */
    private String nomeDisciplina;

    /** Representa horas de estudos. */
    private int horasEstudos;

    /** Representa uma lista de notas do tipo double. */
    private double[] notas;

    /** Representa uma lista de pesos do tipo double*/
    private double[] pesos;

    /**
     * Constrói uma disciplina com uma lista de 4 notas e as horas de
     * estudo zerada.
     *
     * @param nomeDisciplina o nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudos = 0;
        this.notas = new double[4];
    }

    /**
     * Constrói uma disciplina de acordo com nome da disciplina, horas de estudos e
     * uma lista de notas do tamanho do numero de notas.
     *
     * @param nomeDisciplina o nome da disciplina.
     * @param numeroNotas o número de notas da disciplina.
     */

    public Disciplina(String nomeDisciplina, int numeroNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudos = 0;
        this.notas = new double[numeroNotas];
    }

    /**
     * Constrói uma disciplina com o nome, quantidade de notas e uma lista de pesos
     * do tipo double com o peso de cada nota, para calcular a média ponderada.
     *
     * @param nomeDisciplina o nome da disciplina.
     * @param numeroNotas a quantidade de notas.
     * @param pesos a lista de pesos.
     */
    public Disciplina(String nomeDisciplina, int numeroNotas, double[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudos = 0;
        this.notas = new double[numeroNotas];
        this.pesos = pesos;
    }

    /**
     * Acumula a horas de estudos da disciplina.
     *
     * @param horas horas de estudo
     */
    public void cadastraHoras(int horas) {
        horasEstudos += horas;
    }

    /**
     * Cadrasta as notas, se se alguma nota não for cadrastrada é considerada
     * zero e se alguma for cadrastada mais de uma vez, a última nota é cadrastrada.
     *
     * @param nota o indice da nota.
     * @param valorNota o valor da nota.
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Calcula a média ponderada se houver uma lista de pesos de cada nota cadrastrada e se
     * não houver calcula a média aritmética.
     *
     * @param pesos lista dos pesos de cada nota.
     * @return a média aritmética ou ponderada.
     */
    public double calculaMedia(double[] pesos) {
        double soma = 0;
        double ponderada = 0;
        double listaPesos = 0;

        if (pesos == null) {
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
            double mediaPonderada = ponderada / listaPesos;
            return mediaPonderada;
        }
    }

    /**
     * Verifica a situação de aprovação do aluno de acordo com média.
     *
     * @return true se a média for maior ou igual a 7.0, caso
     * contrário retorna false.
     */
    public boolean aprovado() {
        if (calculaMedia(pesos) >= 7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Representa o nome, horas de estudo, média e lista de notas.
     *
     * @return uma String com a representação da disciplina.
     */
    @Override
    public String toString() {
          return nomeDisciplina + " " + horasEstudos + " " + calculaMedia(pesos) + " " + Arrays.toString(notas);
        }
    }
