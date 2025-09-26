package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	private static final Scanner input = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {
		
		int opcao;
		criarContasTeste();
		while(true){
			
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"    BANCO DAS TCHUTCHUCAS DO CONDADO    	");
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
			
			try {
				opcao = input.nextInt();
				input.nextLine();
			}catch(InputMismatchException e){
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 8");
				input.nextLine();
			}
			
			if(opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBANCO DAS TCHUTCHUCAS - vem tchutchucas lindas!!!");
				sobre();
				input.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas");
					
					listarContas();
					
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar Conta por Numero \n\n");
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados da Conta \n\n");
					keyPress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta \n\n");
					keyPress();
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Sacar \n\n");
					keyPress();
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depositar \n\n");
					keyPress();
					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Transferir valores entre Contas \n\n");
					keyPress();
					break;
				default:
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida!\n");
					keyPress();
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
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		input.nextLine();
	}

	private static void criarContasTeste() {
		contaController.cadastrar(new ContaCorrente(1, 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(2, 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}
	
	private static void listarContas() {
		contaController.listarTodas();
	}
	
	

}
