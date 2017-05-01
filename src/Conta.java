
public class Conta{
	public int contaBancaria;
	public double saldo;
	
	public int getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(int contaBancaria) {
		this.contaBancaria = contaBancaria;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String Saque(double valor){
		if(this.saldo >= valor){
			this.saldo = this.saldo - valor;
		}
		else{
			return "Saldo Insuficiente!!";
		}
		return "Saque efetuado com sucesso de:" + saldo +" Saldo Atual: " + this.saldo;
	}
	public String Deposito(int Valor){
		this.saldo = this.saldo + Valor;
		return "Deposito efetuado com sucesso!! Saldo atual: "+ this.saldo;
	}
}
