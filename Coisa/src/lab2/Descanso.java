package lab2;

/**
 * Essa Classe acompanha uma rotina de descanso de um estudante, O aluno deve descansar 26 ou
 * mais horas para ser considerado descansado durante a semana, porém não é incluindo horas de
 * sono dessa rotina, Caso contrário, o aluno é considerado cansado.
 *
 * @author Lucas Riquelme Ferreira Alexandre
 */

public class Descanso {
    /** Total de horas de descanso do aluno. */
    private int horasDescanso;

    /** Número de semanas de horas de descanso acumuladas. */
    private int numeroSemanas;

    /**
     * Representa o número de horas de descanso do estudante.
     *
     * @param valorHorasDescanso número de horas descansadas.
     */
    public void defineHorasDescanso(int valorHorasDescanso){
        this.horasDescanso = valorHorasDescanso;
    }

    /**
     * Registra o número de semanas de horas descansadas acumuladas.
     *
     * @param valorNumeroSemanas valor de semanas de horas acumuladas.
     */
    public void defineNumeroSemanas(int valorNumeroSemanas){
        this.numeroSemanas = valorNumeroSemanas;
    }

    /**
     * O retorno será de acordo com as horas de descanso e número de semanas, retornará "Descansado"
     * se o aluno descansar 26 ou mais horas e registrar semanas, caso contrário retornará "Cansado".
     *
     * @return "Descansado" ou "Cansado", de acordo com horas de descando e o número de semanas.
     */
    public String getStatusGeral(){
        int horas = 26 * numeroSemanas;
        if (numeroSemanas > 0 && horasDescanso >= horas){
            return "Descansado";
        } else {
            return "Cansado";
        }
    }
}