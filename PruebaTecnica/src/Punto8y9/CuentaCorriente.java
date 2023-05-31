package Punto8y9;

public class CuentaCorriente {
	
	private String nombre;
    private String apellidos;
    private int edad; 
    private int num_cuenta;
    private double saldo;
    
    public CuentaCorriente(int num_cuenta, double saldo){
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }
    
    public CuentaCorriente(String nombre, String apellidos, int edad, int num_cuenta, double saldo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }
    
    // get and set of nombre
    public String getNombre() {
    return nombre;
    }
    
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    
    // get and set of apellido
    public String getApellido() {
        return apellidos;
    }
    
    public void setApellido(String apellidos) {
    this.apellidos = apellidos;
    }
    
    // get and set of edad
    public int getEdad() {
    return edad;
    }
    
    public void setEdad(int edad) {
    this.edad = edad;
    }
    
    // get and set of num_cuenta
    public int getNum_cuenta() {
    return num_cuenta;
    }
    
    public void setNum_cuenta(int num_cuenta) {
    this.num_cuenta = num_cuenta;
    }
    
    // get and set of saldo
    public double getSaldo() {
    return saldo;
    }
    
    public void setSaldo(double saldo) {
    this.saldo = saldo;
    }
    
    public double ingresar(double ingreso){
        saldo = saldo + ingreso;
        return saldo;
    }
    
    public double reintegro(double valor){
        saldo = saldo - valor;
        return saldo;
    }
    
    public String concatenar(int nc, double s){
        String cadena = nc + " "+s;
        return cadena;
    }

}
