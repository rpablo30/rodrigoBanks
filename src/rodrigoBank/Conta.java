package rodrigoBank;

public class Conta {
	// Atributos
	public int numerodaConta;
	protected String tipo;
	private String titular;
	private float saldo;
	private boolean status;

	// Métodos 
	public void estadoAtual() {
		System.out.println("");
		System.out.println("Conta");
		System.out.println("Tipo da conta: " + this.getTipo());
		if (this.getTipo() == "Poupança") {
			System.out.println("Número da Conta: " + this.getNumConta() + "-1");
		} else {
			System.out.println("Número da Conta: " + this.getNumConta());
		}
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo da conta: R$" + this.getSaldo());
		
		
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "Conta Corrente") {
			this.setSaldo(50);

		} else if (t == "Poupança") {
			this.setSaldo(150);
		}
		System.out.println("Seja bem vindo ao nosso Banco , Fico muito feliz pela escolha , sua conta foi aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, ainda existe saldo disponível.");

		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, débitos pendentes.");

		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getTitular());
		} else {
			System.out.println("Impossível depositar - |Conta Fechada|");
		}
	}

	public void sacar(float v) {
		if (this.getStatus()) {

			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getTitular());
			} else {
				System.out.println("Saldo insufuciente para saque.");
			}

		} else {
			System.out.println("Impossível sacar - |Conta Fechada|");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "Conta Corrente") {
			v = 12;
			if (this.getStatus()) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getTitular());
			} else if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
			} else {
				System.out.println("Saldo insufuciente");
			}

		} else {
		System.out.println("Impossível pagar - |Conta Fechada|");
		}
	}

	// Métodos especiais
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void setNumConta(int n) {
		this.numerodaConta = n;
	}

	public int getNumConta() {
		return this.numerodaConta;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTitular(String prop) {
		this.titular = prop;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}

	public boolean getStatus() {
		return this.status;
	}

}
