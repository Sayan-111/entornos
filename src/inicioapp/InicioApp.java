
package inicioapp;

import java.util.Scanner;


public class InicioApp {
                 int [] contador;
                 char [] letras;
                 int palabras;
                 int carB = 0;
    public static void main(String[] args) {
                InicioApp ia = new InicioApp();
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Dame una cadena de caracteres");
                String cadena = sc.nextLine();
                
		ia.contarCaracteresTotal(cadena);
                ia.contarTodosCaracteres(cadena);
                ia.contarNumerosPalabras(cadena);
		System.out.println(ia.textoCaracterTotal());
                System.out.println(ia.textoNumeroPalabras());
                System.out.println(ia.textoTodosCaracteres());

    }
    private void contarCaracteresTotal(String cadena){
		for (int i = 0;i<cadena.length();i++){
			char car = cadena.charAt(i); 
			if (car != ' ') carB++; 
                }
    }
    private void contarNumerosPalabras(String cadena){
	palabras = 1; 
                char car2 = ' ';
		for (int i = 0;i<cadena.length();i++){
			char car = cadena.charAt(i);
			if (car == ' ' && car2!=' ') { 
				palabras++;
			}
			car2 = car;
    }
    }
    private void contarTodosCaracteres(String cadena){
        contador = new int[65536];
        letras = new char[65536];        
		for (int i = 0;i<cadena.length();i++){    
			char car = cadena.charAt(i);
			int codigo = car; 
			contador[codigo]++; 
			letras[codigo] = car;	
    }
    }

    public String textoCaracterTotal(){
        return "El total de caracteres es(sin contar los espacios en blanco): " + carB;
    }
    private String textoNumeroPalabras(){
		return"Has introducido " + palabras + " palabras";
    }
    private String textoTodosCaracteres(){
		String resultado="";
		for (int i = 0;i<letras.length;i++) {
			if (contador[i]>0 && letras[i] != ' ') {
				if (contador[i]==1)
					resultado+= ""+letras[i]+ "-->" + contador[i] + " vez.";
				else
					resultado+= ""+letras[i]+ "-->" + contador[i] + " veces.";
			}
                return resultado;
      } 
                
                return "Las letras que se repiten en la cadena que me has dado son:";
    }
}
