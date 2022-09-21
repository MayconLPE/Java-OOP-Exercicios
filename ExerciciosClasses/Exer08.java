import model.Macaco;

public class Exer08 {
    public static void main(String[] args) {
        /**
         * Exer08: Classe Macaco: Desenvolva uma classe Macaco,que possua 
         * os atributos nome e bucho (estomago) e pelo menos os métodos 
         * comer(),  verBucho() e digerir(). Faça um programa ou teste
         *  interativamente, criando pelo menos dois macacos, alimentando-os 
         * com pelo menos 3  alimentos diferentes e verificando o conteúdo 
         * do estomago a cada refeição. Experimente fazer com que um macaco 
         * coma o outro.  É possível criar um macaco canibal?
         */
        Macaco m1 = new Macaco("M1");
        Macaco m2 = new Macaco("M2");

        m1.comer("Maçã");
        m1.verBucho();
        
        m2.comer("Banana");
        m2.verBucho();

        m1.digerir();
        m2.digerir();

        m1.verBucho();
        m2.verBucho();
        m1.digerir();

        



    }
}
