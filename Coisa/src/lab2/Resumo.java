package lab2;

/**
 * A classe representa um resumo de estudo, que tem tema e conteudo que
 * o resumo não está associado a disciplina.
 *
 * @author Lucas Riquelme Ferreira Alexandre
 */
public class Resumo {
    /** tema do resumo*/
    private String tema;

    /** conteudo do resumo*/
    private String conteudo;

    /**
     * Constrói um Resumo com o tema e o conteúdo do resumo.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteudo do resumo
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Recebe o tema do resumo.
     *
     * @return tema do resumo
     */
    public String getTema() {
        return tema;
    }

    /**
     * Recebe o conteudo do resumo
     *
     * @return conteudo do resumo
     */
    public String getConteudo() {
        return conteudo;
    }
}
