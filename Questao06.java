import javax.swing.JOptionPane;

public class Questao06 {

    public static void main(String[] args) {
        
        int opcao = 0, quantidade=0, bolos=0, doces=0, sanduiches=0, pizzas=0;
        double total = 0, media = 0;

        while(opcao!=16){

            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Código------Tipo------Nome------Valor"
                +"\n1---------Bolos------Bolo Brigadeiro------R$29,50"
                +"\n2---------Bolos------Bolo Floresta Negra------R$2,00"
                +"\n3---------Bolos------Bolo Leite com Nutella------R$29,23"
                +"\n4---------Bolos------Bolo Mousse de Chocolate------R$7,10"
                +"\n5---------Bolos------Bolo Nega Maluca------R$19,33"
                +"\n6---------Doces------Bomba de Creme------R$17,71"
                +"\n7---------Doces------Bomba de Morango------R$4,82"
                +"\n8---------Sanduíches-Filé-Mignon com fritas e cheddar------R$21,16"
                +"\n9---------Sanduíches-Hambúrguer com queijos, champignon e rúcula------R$12,70"
                +"\n10--------Sanduíches-Provolone com salame------R$19,70"
                +"\n11--------Sanduíches-Vegetariano de berinjela------R$28,22"
                +"\n12--------Pizzas-----Calabresa------R$8,98"
                +"\n13--------Pizzas-----Napolitana------R$0,42"
                +"\n14--------Pizzas-----Peruana------R$18,36"
                +"\n15--------Pizzas-----Portuguesa------R$27,50"
                +"\n16------Sair"
                )
            );

            if (opcao>0 && opcao<16) {

                quantidade=quantidade+1;  

                if (opcao<6) {
                    bolos = bolos + 1;

                    if (opcao==1) {
                        total = total + 29.50;
                    } else if (opcao==2) {
                        total = total + 2;
                    } else if (opcao==3) {
                        total = total + 29.23;
                    } else if (opcao==4) {
                        total = total + 7.1;
                    } else if (opcao==5) {
                        total = total + 19.33;
                    }

                } else if(opcao<8){
                    doces = doces + 1;

                    if (opcao==6) {
                        total = total + 17.71;
                    } else if (opcao==7) {
                        total = total + 4.82; 
                    }

                } else if(opcao<12){
                    sanduiches = sanduiches + 1;

                    if (opcao==8) {
                        total = total + 21.16;
                    } else if (opcao==9) {
                        total = total + 12.7;  
                    } else if (opcao==10) {
                        total = total + 19.7;  
                    }else if (opcao==11) {
                        total = total + 28.22;
                    }

                } else {
                    pizzas = pizzas + 1;

                    if (opcao==12) {
                        total = total + 8.98;
                    } else if (opcao==13) {
                        total = total + 0.42;
                    } else if (opcao==14) {
                        total = total + 18.36;
                    }else if (opcao==15) {
                        total = total + 27.5;
                    }

                }

            }

        }

        media = total/quantidade;
      
        JOptionPane.showMessageDialog(null, "Resultados:"
            +"\nTotal do consumido: " + total
            +"\nQuantidade de Produtos Consumido: " + quantidade
            +"\n Bolos-> " + bolos
            +"\n Doces-> " + doces
            +"\n Sanduiches-> " + sanduiches
            +"\n Pizzas-> "+ pizzas
            +"\n Media do consumido: " + (String.format("%.2f",media))
        );

    }
    
}