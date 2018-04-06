package clase;

public class Cuenta 
{
	//atributos de la clase
	private float saldo;
	private static int numCuenta=0;
	private String tipoCuenta;//caja de ahorro, cuenta sueldo o cuenta corriente
	
	//constructores
	public Cuenta ()
	{
		saldo=0;
		numCuenta++;
		tipoCuenta=null;
	}
	public Cuenta (float saldoInicial)
	{
		saldo=saldoInicial;
		numCuenta++;
		tipoCuenta=null;
	}
	public Cuenta (float saldoInicial, String tipoInge)
	{
		saldo= saldoInicial;
		numCuenta++;
		tipoCuenta=tipoInge;
	}
	public Cuenta (String tipo)
	{
		saldo= 0;
		numCuenta++;
		tipoCuenta=tipo;
	}
	
	//getters
	
	public float ObtenerSaldo (int numCuentaIngre)
	{
		
		if (numCuenta==numCuentaIngre)
		{
			return saldo;
		}
		else
		{
			return -1;//como hago con el retorno en caso que el num de cuenta no sea el correcto??
		}
	}
	
	public String ObtenerTipoCuenta ()
	{
		return tipoCuenta;
	}
	
	//metodos
	public void IngresarDinero (float dinero)
	{
		saldo=saldo+dinero;
	}
	
	public boolean SacarDinero (float dineroRetirar)
	{
		if (saldo<=dineroRetirar)
		{
			return false;
		}
		else
		{
			saldo=saldo-dineroRetirar;
			return true;
		}
	}	
}
