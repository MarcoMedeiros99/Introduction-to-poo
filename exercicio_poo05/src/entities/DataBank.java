package entities;

public class DataBank {

	private int numeroConta;
	private String name;
	private double saldo;

	public DataBank() {
	}

	public DataBank(int numeroConta, String name) {
		this.numeroConta = numeroConta;
		this.name = name;
	}

	public DataBank(int numeroConta, String name, double aporteInicial) {
		this.numeroConta = numeroConta;
		this.name = name;
		aporte(aporteInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void aporte(double aporte) {
		saldo += aporte;
	}

	public String saque(double saque) {
		int tax = 5;
		String resposta;
		saldo -= saque + tax;

		if (saldo <= saque) {
			resposta = "Saldo insulficiente";
			return resposta;
		} 
		else {
			resposta = "Operação realizada com sucesso!";
			return resposta;
		}
	}

}
