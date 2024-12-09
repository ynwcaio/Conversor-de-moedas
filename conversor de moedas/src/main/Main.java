package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class Main {
    public static void main(String[] args) {
        String x;
        int op;
        double real, resultado;
        
        JOptionPane.showMessageDialog(null,"Bem-vindo ao conversor de moedas!!");
        
        x = JOptionPane.showInputDialog(null,"Digite 1 para converter em dólar\n Digite 2 para converter em euros");
        op = Integer.parseInt(x);
        
        if(op==1){
            x = JOptionPane.showInputDialog(null,"Digite o valor em reais");
            real = Double.parseDouble(x);
            resultado = real * 6.01; 
            resultado = Math.round(resultado); 
            JOptionPane.showMessageDialog(null, "O valor em dólares é: " + resultado);
        }else if(op ==2){
            x = JOptionPane.showInputDialog(null,"Digite o valor em reais");
            real = Double.parseDouble(x);
            resultado = real * 6.36; 
            resultado = Math.round(resultado); 
            JOptionPane.showMessageDialog(null, "O valor em euros é: " + resultado);
        }else{
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        
    }
    
}
