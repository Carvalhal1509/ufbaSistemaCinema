package cinemaclientes;


public class Parimpar{
    //5 atributos
    private String nome;
    private String idade;
    private boolean parImpar;
    //construtor sem parâmetros
    public Parimpar() {}
    //construtor com os 5 atributos
    public Parimpar(String nome, String idade,boolean parImpar) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.parImpar = parImpar;
}
//metodo imprimir 
    public static String imprimir(Parimpar cinema1, Parimpar cinema2, Parimpar cinema3, Parimpar cinema4) {
        return  System.lineSeparator() + "*****************CINEMA*****************" +
                System.lineSeparator() + "Ingresso 1: " + cinema1.toString();
                
    }
    //metodo toString (imprimir o objeto)
    @Override
    public String toString() {
        return " idade = " + idade + ",nome = " + nome + ", Bool = " + parImpar;
    }
    //metodos de acesso (setters e getters)
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
    this.nome = nome;
    }
    public String getIdade(){
       return idade;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    public boolean isparImpar(){
        return parImpar;
    }
    public void setPcUsado(boolean parImpar){
        this.parImpar = parImpar;
    }
}
