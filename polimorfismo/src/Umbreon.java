public class Umbreon extends Eevee {

    public Umbreon (String tipo, int altura, int hP, double peso) {
        super(tipo, altura, hP, peso);
    
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
}