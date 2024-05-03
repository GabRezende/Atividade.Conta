package conta;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import contaUtil.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = 0;
		
		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
        // Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
			
		while(true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND 
					         + "**************************************************");
			System.out.println("                                                  ");
			System.out.println("               BANCO DO BRAZIL COM Z              ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("          1 - Criar conta                         ");
			System.out.println("          2 - Listar todas as contas              ");
			System.out.println("          3 - Buscar conta por numero             ");
			System.out.println("          4 - Atualizar dados da conta            ");
			System.out.println("          5 - Apagar conta                        ");
			System.out.println("          6 - Sacar                               ");
			System.out.println("          7 - Depositar                           ");
			System.out.println("          8 - Transferir valores entre contas     ");
			System.out.println("          9 - Sair                                ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("Entre  com a opção desejada:                      ");
			System.out.println("                                                  " + Cores.TEXT_RESET);				
						
			try {
				opcao = leia.nextInt();
				
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				MetodoSobre();
                 		leia.close();
				System.exit(0);
				
				
			switch (opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_WHITE + "\nCriar Conta");
				keyPress();
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE + "\nListar todas as Contas");
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE + "\nConsultar dados da Conta - por número");
				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE + "\nAtualizar dados da Conta");
				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE + "\nApagar a Conta");
				keyPress();
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE + "\nSaque");
				keyPress();
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE + "\nDepósito");
				keyPress();
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE + "\nTransferência entre Contas");
				keyPress();
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!");
				keyPress();
				break;
				}
			}
		}
	}

	private static void MetodoSobre() {
		System.out.println("\n************************************************************************");
		System.out.println("Projeto Desenvolvido por: Gabriel Francisco Rezende de Camargo dos Santos");
		System.out.println("contatogabrezende@gmail.com                                              ");
		System.out.println("github.com/GabRezende/Atividade.Conta.git                                ");
		System.out.println("*************************************************************************"); 
	}
	
	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
