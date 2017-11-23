
package locadoragit;


public class Filme {
    
    
    
        private String titulo ;
        private String formato ;
        private String nomeAtore;
        private String duracao;
        private String anoDeLancamento;

    public Filme(String titulo, String formato, String nomeAtore, String duracao, String anoDeLancamento) {
        this.titulo = titulo;
        this.formato = formato;
        this.nomeAtore = nomeAtore;
        this.duracao = duracao;
        this.anoDeLancamento = anoDeLancamento;
    }
        
        

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getNomeAtore() {
        return nomeAtore;
    }

    public void setNomeAtore(String nomeAtore) {
        this.nomeAtore = nomeAtore;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    
    

     
    
}
