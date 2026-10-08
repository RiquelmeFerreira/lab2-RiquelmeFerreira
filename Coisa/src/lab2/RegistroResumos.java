package lab2;

public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int contadorResumo;
    private int indice;

    public RegistroResumos(int numeroDeResumos){
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.contadorResumo = 0;
        this.indice = 0;
    }

    public void adiciona(String tema, String conteudo){
        for (int i = 0; i < contadorResumo; i++){
            if (temas[i].equals(tema)) {
                conteudos[i] = conteudo;
            }
        }
        temas[indice] = tema;
        conteudos[indice] = conteudo;
        indice = (indice + 1) % temas.length;
        if (contadorResumo < temas.length) {
            contadorResumo++;
        }
    }

    public String[] pegaResumos(){
        String[] resumos = new String[contadorResumo];
        for (int i = 0; i < contadorResumo; i++){
            resumos[i] = temas[i] + ": " + conteudos[i];
        }
        return resumos;
    }

    public String imprimeResumos(){
        StringBuilder sc = new StringBuilder();
        sc.append("- ").append(contadorResumo).append(" resumo(s) cadrastro(s)\n");
        for (int i = 0; i < contadorResumo; i++) {
            if (i > 0){
                sc.append(" | ");
            }
            sc.append(temas[i]);
        }
        return sc.toString();
    }

    public int conta() {
        return contadorResumo;
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < contadorResumo; i++){
            if (temas[i].equals(tema)){
                return true;
            }
        }
        return false;
    }
}