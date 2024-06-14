package conta.model;

public class ContaCorrente extends Conta {
	
	private float limite;
	public ContaCorrente(int numero,int agencia,int tipo,String titular,float saldo,float limite) {
		super(numero,agencia,tipo,titular,saldo);
		this.limite = limite;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo()+ this.getLimite()<valor) {
			System.out.println("\n Saldo insuficiente para ser sacado");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("\n Valor sacado com sucesso");
		return true;
	}
}
