
public class TestReferencia3 {

	public static void main(String[] args) {
		Cuenta cuentaDiego = new Cuenta();
		/*Cliente cliente = new Cliente();
		cuentaDiego.titular = cliente;*/
		//cuentaDiego.titular = new Cliente();
		//cuentaDiego.titular.nombre = "Diego";
		
		System.out.println(cuentaDiego.titular.nombre);
	}
}
