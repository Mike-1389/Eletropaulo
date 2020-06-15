
package eletro;

import javax.swing.JOptionPane;


public class Registro {
    String nomeproprietario;
    String endereco;
    double leiturant;
    double leituratual;
       
    public String getNome(){
        return nomeproprietario;
    }
   
    public void setNome(String nomeproprietario){
    this.nomeproprietario=nomeproprietario;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
    this.endereco=endereco;
    }
   
     public double getLeitAnt(){
        return leiturant;
    }
    public void setLeitAnt(double leiturant){
    this.leiturant=leiturant;
    }
      public double getLeitAtu(){
        return leituratual;
    }
    public void setLeitAtu(double leituratual){
    this.leituratual=leituratual;
    }
    public double fazLeitura(double leiturant, double leituratual){
   double leituradif= leituratual-leiturant;
    
    return leituradif;
    }
     public double calculataxas(double leituradif){
 
 double Tusd= leituradif*0.30; 
 double Te= leituradif*0.29;  
 double taxas= Tusd+Te;
 double taxafinal= taxas*1.25;
return taxafinal;
    }
   
      public void calculabandeira(double leituradif,double taxafinal){
      double valorFinal;
        if (leituradif<=100){
      valorFinal=taxafinal; 
       JOptionPane.showMessageDialog(null,"Nome do proprietário:"+nomeproprietario
               +"\n Endereço: "+endereco+
               "\nConsumo: "+leituradif
                +"\nO valor sem bandeira é: R$"+taxafinal
               +"\nO valor da sua conta é: R$"+valorFinal
               +"\nBandeira verde");
      }
        else if(leituradif>=101 && leituradif<=150){
        valorFinal= ((leituradif*0.013)*1.25)+taxafinal;
          JOptionPane.showMessageDialog(null,"Nome do proprietário:"+nomeproprietario
               +"\n Endereço: "+endereco+
               "\nConsumo: "+leituradif
                +"\nO valor sem bandeira é: R$"+taxafinal
               +"\nO valor da sua conta é: R$"+valorFinal
             +"\nBandeira amarela");
        
        }
    else if (leituradif>=151 && leituradif<=200){
        valorFinal= ((leituradif*0.042)*1.25)+taxafinal;
             JOptionPane.showMessageDialog(null,"Nome do proprietário:"+nomeproprietario
               +"\n Endereço: "+endereco+
               "\nConsumo: "+leituradif
                +"\nO valor sem bandeira é: R$"+taxafinal
               +"\nO valor da sua conta é: R$"+valorFinal
                +"\nBandeira vermelha 1");
        
        }
        else {
        valorFinal= ((leituradif*0.062)*1.25)+taxafinal;
             JOptionPane.showMessageDialog(null,"Nome do proprietário:"+nomeproprietario
               +"\n Endereço: "+endereco+
               "\nConsumo: "+leituradif+" kw/h"
                +"\nO valor sem bandeira é: R$"+taxafinal
               +"\nO valor da sua conta é: R$"+valorFinal
                +"\nBandeira vermelha 2");
        
        }
   
      }
    
    
    
}
