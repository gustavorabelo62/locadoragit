
package locadoragit;

import java.util.Date;
import java.util.Scanner;


public class Socio {
    Scanner entrada = new Scanner(System.in);
    
        private String nome;
        private String endereço;
        private String cpf;   //usei estring em cpf e rg por causa do equals pelo que vi so pode ser usado em strings 
        private int telefone;
        private String RG;
        Date data ;

    public Socio(String nome, String endereço, String cpf, int telefone, String RG, Date data) {
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.telefone = telefone;
        this.RG = RG;
        this.data = data;
    }
        
        

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
        
        
    
}
