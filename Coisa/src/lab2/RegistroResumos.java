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

    }

    public String[] pegaResumos(){
        String[] resumos = new String[contadorResumo];
        for (int i = 0; i < contadorResumo; i++){
            resumos[i] = temas[i] + ": " + conteudos[i];
        }
        return resumos;
    }

    public String imprimeResumos(){
        String saidaResumos = "";
        for (int i = 0; i < contadorResumo; i++){
            saidaResumos += temas[i] + ": " + conteudos[i] + "\n";
        }
        return saidaResumos;
    }

    public int conta(){
        return contadorResumo;
    }

    public boolean temResumo(String tema){
        return true;
    }
}
