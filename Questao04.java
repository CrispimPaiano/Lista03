import javax.swing.JOptionPane;

public class Questao04 {

    public static void main(String[] args) {
        
        double mediaValorCarro = 0;
        int mediaAnoCarro=0,mediaCarro=0,quantidadeCarro=0,carrosG=0,carrosA=0;

        quantidadeCarro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de carros a serem cadastrados"));
        mediaCarro = quantidadeCarro;

        while (quantidadeCarro>0) {

            String modeloCarro = JOptionPane.showInputDialog(null, "Digite o modelo do carro");
            modeloCarro = modeloCarro.trim().toLowerCase();
            char letra = modeloCarro.charAt(0);

            double valorCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do carro:"));
            int anoCarro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do carro:"));

            mediaAnoCarro = mediaAnoCarro + anoCarro;
            mediaValorCarro = mediaValorCarro + valorCarro;

            if (letra=='g') {
                carrosG = carrosG + 1;
            } else if (letra=='a') {
                carrosA = carrosA + 1;
            } 

            quantidadeCarro=quantidadeCarro-1;

        }

        mediaAnoCarro = mediaAnoCarro/mediaCarro;
        mediaValorCarro = mediaValorCarro/mediaCarro;

        JOptionPane.showMessageDialog(null, "Média de ano dos carros: "+ mediaAnoCarro
            +"\nMédia de valor dos carros: "+ mediaValorCarro
            +"\nCarros com inicial G: "+carrosG
            +"\nCarros com inicial A: "+carrosA);

    }
    
}