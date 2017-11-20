
package locadoragit;


public class Locacao {
    
     int NunCopias;
     
     
    public boolean alugar(int NumCopias ){
         int alugados = 0;
        if ( alugados > this.NunCopias ) {
            System.out.println("todos alugados !");
            return false;
        } else {
            System.out.println("divirta-se!");
            return true;
        }
     }
}
