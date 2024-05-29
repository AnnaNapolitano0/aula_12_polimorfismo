public class Sylveon extends Eevee{

    public Sylveon (String nome,String tipo, int altura, int hP, double peso) {
        super(nome, tipo, altura, hP, peso);
    }
    
    @Override
    public String ataque (){
        return "Hyper Voice";
    }
    @Override
    public String defesa(){
        return "Chalm Mind";
    }
    @Override
    public String especial(){
        return "Moonblast";
    }
    @Override
    public String Nome(){
        return "Sylveon";
    }   
}