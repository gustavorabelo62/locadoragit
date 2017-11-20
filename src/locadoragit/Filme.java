
package locadoragit;

import java.util.ArrayList;


public class Filme {
    
    // a IDE que ininciar dentro do construtor. qual o melhor lugar?
    
    private ArrayList<String> titulo = new ArrayList<>();
    private ArrayList<String> formato = new ArrayList<>();
    private ArrayList<String> nomeAtore = new ArrayList<>();
    private ArrayList<String> duracao = new ArrayList<>();
    private ArrayList<String> anoDeLancamento = new ArrayList<>();
    
    

    public Filme(String titulo, String formato,String nomeAtores, String duracao, String anoDeLancamento) {
        this.titulo.add(titulo);
        this.formato.add(formato);
        this.nomeAtore.add(nomeAtores);
        this.duracao.add(duracao);
        this.anoDeLancamento.add(anoDeLancamento);
        
    
    
    }
    
    
}
