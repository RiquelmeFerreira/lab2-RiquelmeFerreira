package lab2;

import java.util.Arrays;

/**
 * A classe representa uma lista de resumo de tamanho limitado.
 * Quando a lista de resumo, o primeiro resumo cadrastrado é substituído.
 *
 * @author Lucas Riquelme Ferreira Alexandre
 */
public class RegistroResumos {
    /**
     * lista de resumos armazenados.
     */
    private Resumo[] resumos;

    /**
     * quantidade de resumos.
     */
    private int contadorResumo;

    /**
     * indice do próximo resumo da lista de resumos.
     */
    private int indice;

    /**
     * Constrói o RegistroResumo com o capacidade de resumos máxima.
     * lista,
     *
     * @param numeroDeResumos o quantidade de resumos
     */
    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.contadorResumo = 0;
        this.indice = 0;
    }

    /**
     * Adiciona um tema na lista, se houver um resumo com o mesmo tema
     * não é adicionado e se a lista estiver cheia, o resumo mais antigo é
     * substituído
     *
     * @param tema o tema do resumo
     * @param conteudo o conteudo do conteudo
     */
    public void adiciona(String tema, String conteudo){
        for (Resumo resumo: resumos){
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

    /**
     * Retorna os resumos armazenados
     *
     * @return array com um resumo cadrastado.
     */
    public String[] pegaResumos(){
        String[] resumoFinal = new String[contadorResumo];
        for (int i = 0; i < contadorResumo; i++){
           resumoFinal[i] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }
        return resumoFinal;
    }

    /**
     * Retorna uma String que representa a lista de resumos com quantidade de resumos,
     * a quantidade resumos cadrastados e os temas.
     *
     * @return representação em String da lista de resumos.
     */
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

    /**
     * Retorna a quantidade de resumos cadrastrados.
     *
     * @return a quantidade de resumos
     */
    public int conta() {
        return contadorResumo;
    }

    /**
     * Verifica se tem algum resumo com o mesmo tema.
     *
     * @param tema o tema do resumos
     * @return true se existir algum resumo com esse tema, caso contrário false.
     */
    public boolean temResumo(String tema){
        for (int i = 0; i < contadorResumo; i++){
            if (resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }

    /**
     * Busca o resumo de acordo com a chave de busca, igorando a diferença
     * de letras minúsculas e maiúscula.
     *
     * @param chaveDeBusca a chave de busca para procurar o conteúdo.
     * @return uma lista com os temas encontrados em ordem alfabética.
     */
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