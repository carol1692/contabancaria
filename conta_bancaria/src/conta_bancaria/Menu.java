package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opcao;
						
		while(true){
			
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"         BANCO DAS TCHUTCHUCAS          	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   1 - Criar Conta                      	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   2 - Listar todas as Contas           	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   3 - Buscar Conta por Numero          	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   4 - Atualizar Dados da Conta         	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   5 - Apagar Conta                     	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   6 - Sacar					");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   7 - Depositar                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   8 - Transferir valores entre Contas  	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   0 - Sair                             	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"Entre com a opção desejada:             	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	" + Cores.TEXT_RESET);
			
			opcao = input.nextInt();
			
			if(opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBANCO DAS TCHUTCHUCAS - vem tchutchucas lindas!!!");
				sobre();
				input.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas");
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar Conta por Numero \n\n");
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados da Conta \n\n");
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta \n\n");
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Sacar \n\n");
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depositar \n\n");
					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Transferir valores entre Contas \n\n");
					break;
				default:
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida!\n");
					break;
					
			}
		}
		
	}
	
	public static void sobre() {
		System.out.println("\n****************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Ana Lemos - acsomel@outlook.com");
		System.out.println("https://github.com/carol1692/contabancaria");
		System.out.println("******************************************");
	}
	
	

}
