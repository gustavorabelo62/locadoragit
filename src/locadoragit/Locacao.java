
package locadoragit;

import java.util.ArrayList;


public class Locacao {
    
    ArrayList<Filme> CatalagoDeFilmes = new ArrayList<>();
    ArrayList<Socio> ListaDeSocio = new ArrayList<>();
    
    	public void cadastrarFilme(Filme f) {
		CatalagoDeFilmes.add(f);
	}
        
        public void cadastraSocio(Socio s){
               ListaDeSocio.add(s); 
        }
        
        

    public Socio buscaSocio(String cpf){
                for (Socio socio : ListaDeSocio){
                    if (socio.getCpf().equals(cpf)){
                        System.out.println("soicio encontrado");
                        return socio;
                    }
                }
                System.out.println("cadatra novo socio");
                        return null;
    
    }

    
    public Filme buscarFilme(String titulo ) {
		for (Filme filme : CatalagoDeFilmes ) {
			if (filme.getTitulo().equals(titulo) ) {
				System.out.println("titulo encotrado...");
				System.out.println(titulo);
				return filme;
			}
		}
		System.out.println("Cfilme  encotrado...");
		return null;
	}
    
    
    public void cadastraFilme(String titulo, String formato, String nomeAtore, String duracao, String anoDeLancamento){
        
    }
    
    public void Socio(String nome, String endereço, String cpf, int telefone, String RG) {
    }
}
