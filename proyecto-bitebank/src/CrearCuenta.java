
public class CrearCuenta {

	public static void main(String[] args) {
		// Variable          =  Valor 
		Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.setSaldo(200);
        System.out.println(primeraCuenta.getSaldo());

        primeraCuenta.depositar(100);
        System.out.println(primeraCuenta.getSaldo());
        
        //  Variable        = Referencia
        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.setSaldo(50);

        System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
        System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

        System.out.println(primeraCuenta);
	}
}
