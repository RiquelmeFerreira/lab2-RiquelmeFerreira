package lab2;

public class RegistroResumo {
    private String nomeDisciplina;
    private int tempoOnlineInvestido;
    private int tempoEsperado;

    public RegistroResumo(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroResumo(String nomeDisciplina, int tempoEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    public void adicionaTempoOnline(int tempoOnline) {
        tempoOnlineInvestido += tempoOnline;
    }
}
