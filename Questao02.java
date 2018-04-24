import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {
        
        int idade = 0;
        while (idade<128) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a sua idade:\nOu digite \"Sair\" para encerrar o programa"));
        }


    }

}