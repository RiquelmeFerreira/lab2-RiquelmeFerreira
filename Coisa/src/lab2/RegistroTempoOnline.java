package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineInvestido;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina){
        this(nomeDisciplina, 120);
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    public void adicionaTempoOnline(int tempoOnline) {
        tempoOnlineInvestido += tempoOnline;
    }

    public boolean atingiuMetaTempoOnline(){
        if (tempoOnlineInvestido >= tempoEsperado) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineInvestido + "/" + tempoEsperado;
    }
}
