public class Jolteon extends Eevee {
    
    public Jolteon (String nome, String tipo, int altura, int hP, double peso) {
        super(nome, tipo, altura, hP, peso);
    }

    @Override
     public String ataque (){
    return "Trovoada";
    }
    @Override
    public String defesa(){
    return "Carga - Wild charge";
    }
    @Override
    public String especial(){
    return "Raio - Thunder";
    }
    @Override
    public String Nome(){
        return "Joelton";
    }   
        
    
}
