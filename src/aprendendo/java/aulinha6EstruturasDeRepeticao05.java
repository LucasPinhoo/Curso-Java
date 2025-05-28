package aprendendo.java;

public class aulinha6EstruturasDeRepeticao05 {
    // Dado o valor de carro, descubra em quantas vezes ele pode ser parcelado
    //Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotalCarro = 30000;
        for (int parcela =  (int)valorTotalCarro; parcela >= 1; parcela--) {
            double valorParcela = valorTotalCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+parcela+ " R$ "+ valorParcela);

        }


    }
}
