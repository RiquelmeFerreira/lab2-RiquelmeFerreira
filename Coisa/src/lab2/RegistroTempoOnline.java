package lab2;

/**
 * A classe registra a quantidade de horas online do estudante dedicada a disciplina, cada
 * disciplina tem por padrão 60 horas e o tempo online na disciplina seria o dobro
 * ou 120 horas. Se o tempo online atingir as 120 horas esperadas, continua acumulando
 * horas online.
 *
 * @author Lucas Riquelme Ferreira Alexandre
 */

public class RegistroTempoOnline {
    /** Representa o nome da disciplina.*/
    private String nomeDisciplina;

    /** Registra o tempo online investidos na disciplina.*/
    private int tempoOnlineInvestido;

    /** Representa o tempo esperado para o aluno focar na disciplina.*/
    private int tempoEsperado;

    /**
     * Registro de Tempo Online de acordo com o nome da disciplina e tempo padrão
     * esperado de 120 horas.
     *
     * @param nomeDisciplina o nome da disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this(nomeDisciplina, 120);
    }

    /**
     * Registro de Tempo Online de acordo com o nome da disciplina e tempo
     * online esperado em 0 horas.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoEsperado o tempo online esperado
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    /**
     * Acumula o tempo online investido na disciplina.
     *
     * @param tempoOnline o tempo online acumulado
     */
    public void adicionaTempoOnline(int tempoOnline) {
        tempoOnlineInvestido += tempoOnline;
    }

    /**
     * Verifica se o tempo online invetido atingiu o tempo online esperado.
     *
     * @return true se o tempo online for maior ou igual ao tempo esperado,
     * caso contrário retorna false.
     */
    public boolean atingiuMetaTempoOnline(){
        if (tempoOnlineInvestido >= tempoEsperado) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o nome da disciplina, tempoOnlin e tempoEsperado.
     *
     * @return uma String com nomeDisciplina tempoOnline/temmpoEsperado
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineInvestido + "/" + tempoEsperado;
    }
}
