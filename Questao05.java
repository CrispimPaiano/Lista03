import javax.swing.JOptionPane;

public class Questao05 {

    public static void main(String[] args) {

        int opcao = 0;
         
        double valor1=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
        double valor2=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor"));

        while (opcao!=5) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "------MENU------"
               +"\n1------Somar"
               +"\n2------Subtrair"
               +"\n3------Multiplicar"
               +"\n4------Dividir"
               +"\n5------Sair"
               )
            );

            double resultado=0;
            
            if (opcao==1) {
                resultado = valor1+valor2;
            } else if (opcao==2) {
                resultado = valor1-valor2;
            } else if (opcao==3) {
                resultado = valor1*valor2;
            } else if (opcao==4) {
                resultado = valor1/valor2;
            } else if(opcao!=5){
                JOptionPane.showMessageDialog(null,"Parâmetro incorreto, digite novamente");
            }

            if (opcao!=5) {
                JOptionPane.showMessageDialog(null,"O resultado é: "+resultado);
            }

        }

    }
    
}