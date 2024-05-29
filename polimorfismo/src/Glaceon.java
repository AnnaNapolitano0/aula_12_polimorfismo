public class Glaceon extends Eevee{

    public Glaceon (String tipo, int altura, int hP, double peso) {
        super(tipo, altura, hP, peso);
    
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
    
}
