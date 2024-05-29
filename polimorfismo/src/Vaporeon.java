public class Vaporeon extends Eevee {

    public Vaporeon (String nome, String tipo, int altura, int hP, double peso) {
        super(nome, tipo, altura, hP, peso);
    }
    
    @Override
    public String ataque (){
        return "Surf";
    }
    @Override
    public String defesa(){
        return "Acid Armor";
    }
    @Override
    public String especial(){
        return "Hydro Pump";
    }
    @Override
    public String Nome(){
        return "Vaporeon";
    }   
}
