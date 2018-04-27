import javax.swing.JOptionPane;

public class Questao08 {

    public static void main(String[] args) {
        String texto = "";
        int quantidadeCaracteres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de caracteres"));

        while (quantidadeCaracteres>0) {
            char caracteres = JOptionPane.showInputDialog("Digite o caractere").charAt(0);
            texto = texto + caracteres;
            quantidadeCaracteres = quantidadeCaracteres-1;
        }

        JOptionPane.showMessageDialog(null, texto);

    }

}