public class Leafeon extends Eevee{
    
    public Leafeon (String tipo, int altura, int hP, double peso) {
        super(tipo, altura, hP, peso);
    }
    
    @Override
    public String ataque (){
        return "Leaf Tornado";
    }
    @Override
    public String defesa(){
        return "Magical Leaf";
    }
    @Override
    public String especial(){
        return "Leaf Blade";
    }
}
