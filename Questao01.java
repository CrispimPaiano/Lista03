import javax.swing.JOptionPane;

public class Questao01 {

    public static void main(String[] args) {
        
        String nome = "";
        while (!nome.equalsIgnoreCase("sair")) {
            nome = JOptionPane.showInputDialog(null, "digite o seu nome:\nOu digite \"Sair\" para encerrar o programa");
        }


    }

}