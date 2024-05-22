public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();

        System.out.println("ataque:" + e.ataque ()); 
        System.out.println("ataque:" + e.defesa ()); 
        System.out.println("ataque:" + e.especial ()); 
        System.out.println("");

        System.out.println("ataque:" + j.ataque ()); 
        System.out.println("ataque:" + j.defesa ()); 
        System.out.println("ataque:" + j.especial ()); 
        System.out.println("");
    }
}
