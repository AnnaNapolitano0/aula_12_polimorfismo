public class Leafeon extends Eevee{
    
    public Leafeon (String nome, String tipo, int altura, int hP, double peso) {
        super(nome, tipo, altura, hP, peso);
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
    @Override
    public String Nome(){
        return "Leafeon";
    }   
}
