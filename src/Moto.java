
// CLASSE QUE REPRESENTA UM OBJETO NO MUNDO REAL:

public class Moto {
//PROPRIEDADES PRIVADAS:
    private String modelo;
    private String cor;
    private String nacionalidade;
    private int anoFabricacao;

    //MÉTODO GET E SET (OBTER E DEFINIR O MODELO DA MOTO)

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo= modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor) {
        this.cor= cor;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
// MÉTODO PARA LIGAR, ACELERAR, FREAR E DESLIGAR A MOTO:

    public void ligar(){
        System.out.println("Moto ligada");
    }
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }
    public void frear() {
        System.out.println("A moto está freando!!");
    }
    public void desligar() {
        System.out.println("Moto desligada");
    }
//MÉTODO PARA EXIBIR AS INFORMAÇÕES DA MOTO:
    public void exibirInformacoes() {
        System.out.println("Modelo:" + modelo);
        System.out.println("Cor:" + cor);
        System.out.println("Nacionalidade:" + nacionalidade);
        System.out.println("Ano:" + anoFabricacao);
    }

}


