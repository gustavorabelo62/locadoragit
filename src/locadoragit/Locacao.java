
package locadoragit;

import java.util.ArrayList;


public class Locacao {
    
    ArrayList<Filme> CatalagoDeFilmes = new ArrayList<>();
    ArrayList<Socio> ListaDeSocio = new ArrayList<>();
    
    
    
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
}
