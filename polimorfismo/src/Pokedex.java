public class Pokedex {
    public static void main(String[] args) throws Exception {
        //Criando objetos e testando o metodo imprimir
        Eevee e = new Eevee ("evolution", 300 , 55, 6.5 );
        e.imprimir();

        Jolteon j = new Jolteon( "Eletric", 800, 55, 24.5 );
        j.imprimir();

        Espeon es = new Espeon("Psychic",900, 65,26.5  );
        es.imprimir();

        Floreon f = new Floreon("Fire", 900, 65, 25.0);
        f.imprimir();

        Glaceon g = new Glaceon("ice",800,65,25.9 );
        g.imprimir();

        Leafeon l = new Leafeon("Grass", 1, 65,25.5  );
        l.imprimir();

        Sylveon s = new Sylveon("fada", 1, 65, 23.5);
        s.imprimir();

        Umbreon u = new Umbreon("Dark",1,65, 27.0);
        u.imprimir();
        
        Vaporeon v = new Vaporeon("water", 1, 65, 29.0);
        v.imprimir();
    }
}
