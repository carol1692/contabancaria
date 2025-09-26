package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
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
					cadastrarConta();
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas");
					listarContas();
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar Conta por Numero \n\n");
					procurarContaPorNumero();
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados da Conta \n\n");
					atualizarConta();
					keyPress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta \n\n");
					deletarConta();
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
		contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}
	
	private static void listarContas() {
		contaController.listarTodas();
	}
	
private static void cadastrarConta() {
		
		System.out.print("Digite o número da Agência: ");
		int agencia = input.nextInt();
		
		System.out.print("Digite o o nome do Titular: ");
		input.skip("\\R");
		String titular = input.nextLine();
		
		System.out.print("Digite o Tipo da conta (1 - CC | 2 - CP): ");
		int tipo = input.nextInt();
		
		System.out.print("Digite o Saldo inicial: ");
		float saldo = input.nextFloat();
		
		switch(tipo) {
		case 1 ->{
			System.out.print("Digite o Limite inicial: ");
			float limite = input.nextFloat();
			input.nextLine();
			contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
		}
		case 2 -> {
			System.out.print("Digite o dia do aniversário da conta: ");
			int aniversario = input.nextInt();
			input.nextLine();
			contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválido!" + Cores.TEXT_RESET);
		}
	}
	
	private static void procurarContaPorNumero() {
		
		System.out.print("Digite o número da conta: ");
		int numero = input.nextInt();
		input.nextLine();
		
		contaController.procurarPorNumero(numero);
	}
	
	private static void deletarConta() {
		
		System.out.print("Digite o número da conta: ");
		int numero = input.nextInt();
		input.nextLine();
		
		Conta conta = contaController.buscarNaCollection(numero);
		
		if(conta != null) {
		
			System.out.print("\nTem certeza que deseja excluir esta conta? (S/N): ");
			String confirmacao = input.nextLine();
			
			
			if(confirmacao.equalsIgnoreCase("S")) {
				contaController.deletar(numero);
			}else {
				System.out.println("\nOperação cancelada!");
			}
			
		}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}
	
	private static void atualizarConta() {
		
		System.out.print("Digite o número da conta: ");
		int numero = input.nextInt();
		input.nextLine();
		
		Conta conta = contaController.buscarNaCollection(numero);
		
		if(conta != null) {
			
			int agencia = conta.getAgencia();
			String titular = conta.getTitular();
			int tipo = conta.getTipo();
			float saldo = conta.getSaldo();
			
			System.out.printf("A Agência atual: %d\nNova Agência (Pressione ENTER para manter o valor atual): ", agencia);
			String entrada = input.nextLine();
			agencia = entrada.isEmpty() ? agencia : Integer.parseInt(entrada);
			
			System.out.printf("O nome do Titular atual: %s\nNovo Titular (Pressione ENTER para manter o valor atual): ", titular);
			entrada = input.nextLine();
			titular = entrada.isEmpty() ? titular : entrada;
						
			System.out.printf("O Saldo atual: %.2f\nNovo Saldo (Pressione ENTER para manter o valor atual): ", saldo);
			entrada = input.nextLine();
			saldo = entrada.isEmpty() ? saldo : Float.parseFloat(entrada);
			
			switch(tipo) {
			case 1 ->{
				float limite = ((ContaCorrente) conta).getLimite();
				
				System.out.printf("O Limite atual é: %.2f\nNovo Limite (Pressione ENTER para manter o valor atual): ", limite);
				entrada = input.nextLine();
				limite = entrada.isEmpty() ? limite : Float.parseFloat(entrada);
				contaController.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
			}
			case 2 -> {
				
				int aniversario = ((ContaPoupanca) conta).getAniversario();
				
				System.out.printf("O Aniversário atual é: %d\nNovo Aniversário (Pressione ENTER para manter o valor atual): ", aniversario);
				entrada = input.nextLine();
				aniversario = entrada.isEmpty() ? aniversario : Integer.parseInt(entrada);
				contaController.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
			}
			default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválido!" + Cores.TEXT_RESET);
			}
			
		}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}
}
