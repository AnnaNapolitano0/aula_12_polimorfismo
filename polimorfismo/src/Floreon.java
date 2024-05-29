public class Floreon extends Eevee {
    
    public Floreon (String tipo, int altura, int hP, double peso) {
        super(tipo, altura, hP, peso);
    }
    
    @Override
    public String ataque (){
        return "Flamethrower";
    }
    @Override
    public String defesa(){
        return "Will-O-Wisp";
    }
    @Override
    public String especial(){
        return "Flare Blitz";
    }
}
