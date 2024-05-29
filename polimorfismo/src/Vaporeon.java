public class Vaporeon extends Eevee {

    public Vaporeon (String tipo, int altura, int hP, double peso) {
        super(tipo, altura, hP, peso);
    
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
}
