public class Umbreon extends Eevee {

    public Umbreon (String nome, String tipo, int altura, int hP, double peso) {
        super(nome, tipo, altura, hP, peso);
    }
    
    @Override
    public String ataque (){
        return "Foul Play";
    }
    @Override
    public String defesa(){
        return "Protec";
    }
    @Override
    public String especial(){
        return "Special Defense";
    }
    @Override
    public String Nome(){
        return "Umbreon";
    }   
}