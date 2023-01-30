
public class CrearCuenta {

	public static void main(String[] args) {
		// Variable          =  Valor 
		Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo);

        primeraCuenta.saldo += 100;
        System.out.println(primeraCuenta.saldo);
        
        //  Variable        = Referencia
        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 50;

        System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
        System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);

        System.out.println(primeraCuenta);
	}
}
