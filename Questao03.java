import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(String[] args) {
        
        double peso = 0;
        int numeroPessoa = 0;

        while (peso>=0 && peso<=300) {
            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o seu peso:"));
            numeroPessoa = numeroPessoa + 1;
        }

        System.out.println("Quantidade de pessoas: "+numeroPessoa);

    }

}