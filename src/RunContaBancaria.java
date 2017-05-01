import com.senac.SimpleJava.Console;

public class RunContaBancaria {
	public void run(){
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Console.println(conta.Deposito(100));
		
		cliente.contaBancaria = conta;
				
		Console.println(conta.Saque(50));
		
	}
}
