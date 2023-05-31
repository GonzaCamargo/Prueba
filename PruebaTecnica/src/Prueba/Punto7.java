package Prueba;

public class Punto7 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Punto7 a = new Punto7();
//        a.cadena("Hola");
//	}
	
	public void cadena(String c){
        System.out.println("Mayuscula: "+c.toUpperCase());
        
        System.out.println("Minuscula: "+c.toLowerCase()); 
        
		char[] chars = c.toCharArray();
        System.out.println("Primeros 2: "+chars[0]+chars[1]); 
        
        int l = c.length();
        System.out.println("Ultimos 2: "+chars[l-2]+chars[l-1]); 
        
        
        char lChar = c.charAt(c.length() - 1);
        int count = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == lChar) {
                count++;
            }
        }
        System.out.println("Ocurrencias: " + count);
        
        String aste = "***";
        System.out.println("Tres asteriscos: " + aste+c+aste);
        
        String rever = "";
        for (int i = c.length() - 1; i >= 0; i--) {
            rever += c.charAt(i);
        }
        System.out.println("Reversa: " + rever);
    }

}
