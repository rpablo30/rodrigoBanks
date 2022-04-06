package rodrigoBank;

import java.util.Scanner;

public class RodrigoPabloBank {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Conta cc = new Conta();
			int usuario, num ;
			String nome;
			float deposito, cpf;
			int cpfTitular ;
			do {
			
				System.out.println(" ");
				System.out.println("Seja bem vindo ao Rodrigo's Bank ");
				System.out.println("[1] - Abrir Conta Corrente.");
			System.out.println("[2] - Abrir Poupan�a.");
			System.out.println("[3] - Depositar.");
			System.out.println("[4] - Sacar.");
			System.out.println("[5] - Fechar Conta.");
			System.out.println("[0] - Sair");
			
			usuario = teclado.nextInt();
			
			switch (usuario) {
			
			case 1:
				System.out.println("Vamos iniciar o seu cadastro?");
				System.out.println("Iniciando o seu cadastro :");
				System.out.println("Nome completo: ");
				teclado.nextLine();
				nome = teclado.nextLine();
				int numerodaConta = (int)(1000 + Math.random() * (4000));
				System.out.println("N�mero da conta: " + numerodaConta);
				System.out.println("Deseja realizar um dep�sito - |1-SIM| |2-N�O|: ");
				deposito = teclado.nextInt();
				if (deposito == 1) {
					System.out.println("Informe o valor para dep�sito: ");
					float dep = teclado.nextFloat();
					cc.setSaldo(cc.getSaldo() + dep);
				}
				cc.abrirConta(null);
				cc.setTipo("Conta Corrente");
				cc.setTitular(nome);
				cc.setNumConta(numerodaConta);
				
					
				break;
				
			case 2:		
				System.out.println("Realizar cadastro da conta poupan�a: ");
				System.out.println("Nome completo: ");
				teclado.nextLine();
				nome = teclado.nextLine();
				numerodaConta = (int)(1000 + Math.random() * (2000));
				System.out.println("N�mero da conta: " + numerodaConta + "-1");
				System.out.printf("Seja bem vindo %s.%nVoc� gostaria de realizar algum deposito ?:%nDigite [1] para SIM e 2 para N�O: ",nome);
				deposito = teclado.nextInt();
				if (deposito == 1) {
					System.out.println("Informe o valor para dep�sito: ");
					float dep = teclado.nextFloat();
					cc.setSaldo(cc.getSaldo() + dep);
				}
				cc.abrirConta(null);
				cc.setTitular(nome);
				cc.setTipo("Poupan�a");
				cc.setNumConta(numerodaConta);
				cc.setStatus(true);
				cc.estadoAtual();
				break;
				
			case 3:
				System.out.println("Digite o valor do dep�sito: ");
				float deposito3 = teclado.nextFloat();
				cc.depositar(deposito3);
				
				
				
				break;
				
			case 4:
				System.out.println("Valor do saque: ");
				float saq = teclado.nextFloat();
				cc.sacar(saq);
				cc.estadoAtual();
				break;
				
			case 5:
				cc.pagarMensal();
				cc.estadoAtual();
				break;
			}
			
		} while (usuario != 0);
			System.out.println();
		}
	}
