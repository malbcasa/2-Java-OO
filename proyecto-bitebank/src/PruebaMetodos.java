
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.saldo = 300;
		cuentaDiego.depositar(200);
		System.out.println(cuentaDiego.saldo);
		
		cuentaDiego.retirar(100);
		System.out.println(cuentaDiego.saldo);
		
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.depositar(1000);
		boolean puedeTransferir = cuentaJimena.transferir(400, cuentaDiego);
		
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No puede transferir");
		}
		
		System.out.println(cuentaJimena.saldo);
		System.out.println(cuentaDiego.saldo);
	}

}
