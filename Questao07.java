import javax.swing.JOptionPane;

public class Questao07 {

    public static void main(String[] args) {
        
        int jogadores = 2,
        menorNome=Integer.MAX_VALUE,
        maiorNome=Integer.MIN_VALUE,
        maiorVermelho=Integer.MIN_VALUE,
        menorVermelho=Integer.MAX_VALUE,
        maiorAmarelo=Integer.MIN_VALUE,
        menorAmarelo=Integer.MAX_VALUE,
        quantidadeM=0,
        quantidadeF=0;

        double maiorPeso=Double.MIN_VALUE, 
        menorPeso=Double.MAX_VALUE,
        maiorAltura=Double.MIN_VALUE;
        
        while (jogadores>0) {

            String nome = JOptionPane.showInputDialog("Digite o seu nome");
            int quantidadeLetras = nome.length();
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));

            char sexo = JOptionPane.showInputDialog(null, 
                "Selecione seu sexo",
                "Sexo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "M","F"
                },
                ""
            ).toString().charAt(0);

            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));;
            int golsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de gols marcados"));;
            int cartaoAmarelo = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cartão amarelo"));
            int cartaoVermelho = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cartão vermelho"));   

            if (peso > maiorPeso) {
                maiorPeso = peso;
            }

            if (peso < menorPeso) {
                menorPeso = peso;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (quantidadeLetras > maiorNome) {
                maiorNome = quantidadeLetras;
            }

            if (quantidadeLetras < menorNome) {
                menorNome = quantidadeLetras;
            }

            if (cartaoAmarelo > maiorAmarelo) {
                maiorAmarelo = cartaoAmarelo;
            }

            if (cartaoAmarelo < menorAmarelo) {
                menorAmarelo = cartaoAmarelo;
            }

            if (cartaoVermelho > maiorVermelho) {
                maiorVermelho = cartaoVermelho;
            }

            if (cartaoVermelho < menorVermelho) {
                menorVermelho = cartaoVermelho;
            }

            if (sexo=='M') {
                quantidadeM = quantidadeM + 1;
            }

            if (sexo=='F') {
                quantidadeF = quantidadeF + 1; 
            }

            jogadores=jogadores-1;

        }

        JOptionPane.showMessageDialog(null,
            "Menor peso: " + menorPeso
           +"\nMaior peso: " + maiorPeso
           +"\nMaior Altura: " + maiorAltura
           +"\nQuantidade de mulheres: " + quantidadeF
           +"\nQuantidade de homens: " + quantidadeM
           +"\nPessoa com Maior nome: " + maiorNome
           +"\nPessoa com Menor nome: " + menorNome
           +"\nPessoa com Maior Quantidade de Cartões Vermelhos: " + maiorVermelho
           +"\nPessoa com Menor Quantidade de Cartões Vermelhos:" + menorVermelho
           +"\nPessoa com Maior Quantidade de Cartões Amarelos:" + maiorAmarelo
           +"\nPessoa com Menor Quantidade de Cartões Amarelos:" + menorAmarelo
            , 
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );

    }

}