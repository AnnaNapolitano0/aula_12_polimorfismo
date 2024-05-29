public class Espeon extends Eevee{
    
    public Espeon (String tipo, int altura, int hP, double peso) {
        super(tipo, altura, hP, peso);
    }
    
    @Override
    public String ataque (){
        return "Shadow Ball";
    }
    @Override
    public String defesa(){
        return "Morning Sun";
    }
    @Override
    public String especial(){
        return "Psyshock";
    }
    
    
}

