
package locadoragit;


public class Copia extends Filme {
    
    
    int numecop;
    
    
    boolean liberaLocacao(){
        if(numecop <= 0){
             System.out.println("filme inexistente");
            return true;
            
        }else{
            System.out.println("divirta-se");
            return false;
        }
    }  
        
    
    public Copia(String titulo, String formato, String nomeAtore, String duracao, String anoDeLancamento) {
        super(titulo, formato, nomeAtore, duracao, anoDeLancamento);
    }
    
}
