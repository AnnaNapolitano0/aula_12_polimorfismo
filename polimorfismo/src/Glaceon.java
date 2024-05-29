public class Glaceon extends Eevee{

    public Glaceon (String nome, String tipo, int altura, int hP, double peso) {
        super(nome, tipo, altura, hP, peso);
    }
    
    @Override
    public String ataque (){
        return "Blizzard";
    }
    @Override
    public String defesa(){
        return "Aurira Veil";
    }
    @Override
    public String especial(){
        return "Ice Beam";
    }
    @Override
    public String Nome(){
        return "Glaceon";
    }   
    
}
