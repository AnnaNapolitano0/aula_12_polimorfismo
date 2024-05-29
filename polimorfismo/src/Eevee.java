public class Eevee {
    private String nome;
    private String tipo;
    private int altura, HP;
    private double peso;

    public String ataque (){
        return "Ataque rápido";
    }
    public String defesa(){
        return "Desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }
    public String Nome(){
        return "Eevee";
    }

    //implementação dos getters e setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    // implementação do construtor;
    
    public Eevee(String nome, String tipo, int altura, int hP, double peso) {
        this.tipo = tipo;
        this.altura = altura;
        HP = hP;
        this.peso = peso;
        this.nome = nome;
    }
     //metodo imprimir
     public void imprimir (){
        System.out.println("Nome:" + getNome ());
        System.out.println("ataque:" + ataque ()); 
        System.out.println("ataque:" + defesa ()); 
        System.out.println("ataque:" + especial ()); 
        System.out.println("Altura:" + getAltura ()); 
        System.out.println("HP:" + getHP ());
        System.out.println("Peso:" + getPeso ());
        System.out.println("tipo:" + getTipo ());
        System.out.println("");
    }
   
}
