package Punto8y9;

public class CuentaAhorro extends CuentaCorriente {
	
	private double interes;
    
    public CuentaAhorro(int num_cuenta, double saldo, double interes){
        super(num_cuenta, saldo);
        this.interes = interes;
    }
    
    public CuentaAhorro(int num_cuenta, double saldo){
        super(num_cuenta, saldo);
        this.interes = 15.3;
    }
    
    public double incremento(){
        this.setSaldo(this.getSaldo() * this.interes / 100);
        return this.getSaldo();
    }

}
