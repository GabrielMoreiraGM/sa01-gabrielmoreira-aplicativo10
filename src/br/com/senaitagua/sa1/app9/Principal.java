package br.com.senaitagua.sa1.app9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Dúvida programação estuturada e lógica booleana
		
		int mes=12;
		int opcao=5;
		
	    switch(opcao) {
	       case 1:
	    	   //estrutura de seleção simples
			    if(mes==1)
				    System.out.println("Janeiro");
			        break;
	       case 2:
	    	   //estrutura de seleção composta
	    	   if(mes==1)
				    System.out.println("Janeiro");
			    else
			     	System.out.print("Outro mês");
			    break;
	       case 3:
	    	   //estrutura de seleção composta(encadeado)
	    	   if(mes==1) {
				    System.out.println("Janeiro");
	    	   }else if(mes==2) {
			     	System.out.print("Fevereiro");
	    	   }else {
			    	System.out.println("Outro mês");
	    	   }
			    break;
	       case 4:
	    	   if(mes==12) {
	    		   for(int i=1;i<=12;i++) {
	    			   System.out.println("Feliz Natal-mes:"+i);
	    		   }
	    	   }else {
	    		   System.out.println("Não é natal!");
	    	   }
	    	   break;
	       case 5:
	    	   if(mes==12) {
	    		   JOptionPane.showMessageDialog(null, "Seja bem vindo ao Banco SS");
	    		   int senha;
	    		   int cont=1;
	    		   while(cont<=4) {
	    			   senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
	    			   if(senha==123) {
		    			   JOptionPane.showMessageDialog(null, "Pode sacar!");
		    			   break;
		    		   }else {
		    			   JOptionPane.showMessageDialog(null, "Senha inválida!");System.out.println();
		    		   }
	    			   if(cont==3) {
	    				   JOptionPane.showMessageDialog(null, "Limite de tentativas incorretas excedido, seu cartão foi bloqueado!");
	    				   break;
	    			   }
	    			   cont=cont+1;
	    		   }
	    		   
	    	   }
			default:
				System.out.println("Não tem essa opção não");
	    	     
	    }
		
	}

}