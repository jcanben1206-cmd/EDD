import java.util.Random;
public class Ejercicio1 {

    public static void main(String[] args) {
    
    	final int TAM = 3;
    	int [][] numeros = new int [TAM][TAM];
    	int minimo=Integer.MAX_VALUE;
    	
    	Random generador = new Random();
    	
    	for (int i=0;i<numeros.length;i++) {
    		for (int j=0;j<numeros[i].length;j++) {
    			numeros[i][j]=generador.nextInt(0,16);
    		}
    	}
    	
    	for(int i=0;i<numeros.length;i++) {
    		for (int j=0;j<numeros[i].length;j++) {
    			if (numeros [i][j]<10) {
    				System.out.print("[ " + numeros[i][j] + "]");
    			}else {
    				System.out.print("[" + numeros[i][j] + "]");
    			}
    		}
    		System.out.println();
    	}
    	for (int i=0;i<numeros.length;i++) {
    		for(int j=0;j<numeros[i].length;j++) {
    			if (numeros[i][j]<minimo) {
    				minimo=numeros[i][j];
    			}
    		}
    	}
    	System.out.println();
    	System.out.println("El numero más chico es " + minimo);
    }
}
