/**
 * CLASSE QUE REPRESENTA UMA MOTO
 * @AUTOR EMILIO BARBOSA
 * SINCE 2026
 */

// MÉTODO PARA TESTAR A CLASSE MOTO
public class Main {
    public static void main(String[] args) {

        Moto minhaMoto = new Moto();

        //UTILIZANDO MÉTODO SET
        minhaMoto.setModelo("Honda CB300r");
        minhaMoto.setCor("Azul");
        minhaMoto.setNacionalidade("Brasileira");
        minhaMoto.setAnoFabricacao(2011);

        minhaMoto.ligar();
        minhaMoto.acelerar();

        //UTILIZANDO MÉTODO GET:
        System.out.println("Modelo: " + minhaMoto.getModelo());
        System.out.println("Cor: " + minhaMoto.getCor());
        System.out.println("Nacionalidade: " + minhaMoto.getNacionalidade());
        System.out.println("Ano: " + minhaMoto.getAnoFabricacao());

        minhaMoto.frear();
        minhaMoto.desligar();
    }
}
