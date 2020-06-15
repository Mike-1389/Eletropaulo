
package eletro;

import javax.swing.JOptionPane;

public class Eletro {

 
    public static void main(String[] args) {
      Registro dados= new Registro();
       dados.setNome((JOptionPane.showInputDialog("Digite o nome do proprietário: ")));
        dados.setEndereco((JOptionPane.showInputDialog("Digite o endereço: ")));
      dados.setLeitAnt(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura anterior: ")));
    dados.setLeitAtu(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura atual: "))); 
   
    double leitura= dados.fazLeitura(dados.getLeitAnt(),dados.getLeitAtu());
    double taxas=dados.calculataxas(leitura);
    dados.calculabandeira(leitura, taxas);
    }
    
    
}
