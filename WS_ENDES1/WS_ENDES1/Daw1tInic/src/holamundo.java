
/**
 * Ejemplo de documentación con javadoc
 */
public class holamundo {

	
	/**
	 * @param a es el primer parámetro de tipo {@code int}
	 * @param b es el segundo parámetro de tipo {@code int}
	 * @return la suma de los parámetros de entrada dando un valor {@code int}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static int suma(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	} 
	
	public static int resta(int a, int b) {
		int rest;
		rest = a - b;
		return rest;
	} 
	
	public static int producto(int a, int b) {
		int prod;
		prod = a * b;
		return prod;
	} 
	
	 
	/**
	 * @param args
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		String texto;
		int dato1,dato2,Resultado;
		
		texto = "Hola mundo";
		System.out.println(texto);
		texto = "Adios mundo";
		System.out.println(texto);
		
		//System.out.println
		
		dato1 = 5;
		dato2 =20;
		
		Resultado = Math.addExact(dato1, dato2);
		texto = "La suma de " + dato1 + " y " + dato2 + " es " + Resultado;
		System.out.println(texto);
		
		/**
		 * Ejemplo de documentación con javadoc otro comentario
		 */
		
		dato1 = 10;
		dato2 = 30;
		Resultado = holamundo.suma(dato1,dato2);
		
		dato1 = Resultado;
		dato2 = Resultado + 20;
		
		Resultado = holamundo.resta(dato1,dato2);
		
		dato1 = 10;
		dato2 = 40;
		holamundo.producto (dato1,dato2);

	}
	

}
