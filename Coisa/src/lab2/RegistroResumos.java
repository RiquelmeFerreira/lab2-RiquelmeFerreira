package lab2;

import java.util.Arrays;

public class RegistroResumos {
    private Resumo[] resumos;
    private int contadorResumo;
    private int indice;

    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.contadorResumo = 0;
        this.indice = 0;
    }

    public void adiciona(String tema, String conteudo){
        for (Resumo resumo : resumos) {
            if (!temResumo(tema)) {
                resumos[contadorResumo] = new Resumo(tema, conteudo);
                if (contadorResumo < resumos.length) {
                    contadorResumo++;
                }
                indice++;
            }
        }
        if (indice == resumos.length) {
            indice++;
        }
    }

    public String[] pegaResumos(){
        String[] resumoFinal = new String[contadorResumo];
        for (int i = 0; i < contadorResumo; i++){
           resumoFinal[i] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }
        return resumoFinal;
    }

    public String imprimeResumos(){
        String saidaString = " resumo(s) cadrastrado(s)\n";
        String resumoFinal = "- " + contadorResumo + saidaString;
        resumoFinal += "- ";

        for (int j = 0; j < contadorResumo; j++){
            resumoFinal += resumos[j].getTema();

            if (j < contadorResumo - 1){
                resumoFinal += " | ";
            }
        }
        return resumoFinal;
    }

    public int conta() {
        return contadorResumo;
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < contadorResumo; i++){
            if (resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveDeBusca){
        String[] resumoBuscado = new String[contadorResumo];
        int resumosEncontrados = 0;

        for (int i = 0; i < contadorResumo; i++){
            String conteudo = resumos[i].getConteudo().toLowerCase();
            if (conteudo.contains(chaveDeBusca.toLowerCase())){
                resumoBuscado[resumosEncontrados] = resumos[i].getTema();
                resumosEncontrados++;
            }
        }
        resumoBuscado = Arrays.copyOf(resumoBuscado, resumosEncontrados);
        Arrays.sort(resumoBuscado);
        return resumoBuscado;
    }
}