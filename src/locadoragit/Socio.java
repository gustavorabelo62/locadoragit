
package locadoragit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Socio {
    Scanner entrada = new Scanner(System.in);
    
    //lista de atributos pedido pela questao
    // a IDE pediu para torna os atributos como final qual a importancia disso?
    //nao consigo muda de String para int ou long. pq?
    private ArrayList<String> nome = new ArrayList<>();
    private ArrayList<String> endereco = new ArrayList<>();
    private ArrayList<String> cpf= new ArrayList<>();
    private ArrayList<String> telefone = new ArrayList<>();
    private ArrayList<String> rg = new ArrayList<>();
    //não achei nada sobre array de datas 
    int n;
    Date[] data = new Date[n];
    /*private String endereco;
    *private String cpf;
    *int telefone;
    *int RG;
    */
    
    //contrutor para iniciar 

    public Socio(String nome,String endereco, String cpf, String telefone, String rg) {
        
        this.nome.add(nome);
        this.endereco.add(endereco);
        this.cpf.add(cpf);
        this.telefone.add(telefone);
        this.rg.add(rg);
        
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public void setNome(ArrayList<String> nome) {
        this.nome = nome;
    }

    public void setEndereco(ArrayList<String> endereco) {
        this.endereco = endereco;
    }

    public void setCpf(ArrayList<String> cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(ArrayList<String> telefone) {
        this.telefone = telefone;
    }

    public void setRg(ArrayList<String> rg) {
        this.rg = rg;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setData(Date[] data) {
        this.data = data;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public ArrayList<String> getNome() {
        return nome;
    }

    public ArrayList<String> getEndereco() {
        return endereco;
    }

    public ArrayList<String> getCpf() {
        return cpf;
    }

    public ArrayList<String> getTelefone() {
        return telefone;
    }

    public ArrayList<String> getRg() {
        return rg;
    }

    public int getN() {
        return n;
    }

    public Date[] getData() {
        return data;
    }


    
    
    
    
}
