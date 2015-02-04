/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macmini
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Criptojuego {
	private static boolean logenabled = false;
	private static int numTest = 0;
	private static int numLetras = 0;
	private static int numPalabras = 0;
	private static ArrayList <String> palabras = new ArrayList <String>();
	private static ArrayList <ArrayList <Integer>> palabrasDecodificadas = new ArrayList <ArrayList <Integer>>();
	private static String clave = "";
	private static ArrayList <String> diccionario = new ArrayList <String>();
	private static HashMap <String, Integer> correspondencias = new HashMap < String,Integer>();
	private static ArrayList <ArrayList <Integer>> palabrasNoCodificadas = new ArrayList <ArrayList <Integer>>();
        
        public Criptojuego(ArrayList<String> encriptadas,ArrayList<String> diccionarios,String cl,int letras) {
            limpiar();
            this.palabras = encriptadas; 
                this.numLetras = letras;
                this.clave = cl;
                String linea = "";
                for(String s : diccionarios) {
                    this.diccionario.add(s);
                    inicializarCorrespondencias(s);
                }
		
        }
	public static void limpiar () {
		numLetras = 0;
		
		
		palabrasDecodificadas.clear();
		clave = "";
		diccionario.clear();
		correspondencias.clear();
		palabrasNoCodificadas.clear();

	}
	
	public static void pedirTest() {

		inicializarCorrespondencias(clave);
		log("clave= " + clave);
		int indice = 1;
		for(char c : clave.toCharArray()) {
			if(anyadirCorrespondencia(c + "" ,indice)) {
				indice++;
			}

		}
		
		
	}

	public static void inicializarCorrespondencias(String palabra) {
		log("inicializarCorrespondencias= " + palabra);
		for(int i=0; i<palabra.length(); i++) {
			if(!correspondencias.containsKey(palabra.charAt(i) + "")) {
				//log("correspondencia= " + palabra.charAt(i));
				correspondencias.put(palabra.charAt(i) + "",0);
			}
		}
		log("correspondencias= " + correspondencias);
	}

	public static void decodificarPalabras() {
		for (int i=0; i<palabras.size(); i++) {
			ArrayList <Integer> a = new ArrayList <Integer>();
			for(String s : palabras.get(i).split(" ")) {
				if(!s.equals("0")) {
					a.add(Integer.parseInt(s));
				}
			}
			palabrasDecodificadas.add(a);
			log("palabrasDecodificadas: " +palabras.get(i) + "----" + palabrasDecodificadas.get(i));
		}

	}
	public static boolean existeValorCorrespondecia(int numero) {
		return correspondencias.containsValue(numero);

	}
	public static boolean anyadirCorrespondencia(String letra ,Integer numero) {

		
		if(!existeValorCorrespondecia(numero) && correspondencias.get(letra)<=0) {

			correspondencias.put(letra,numero);
			log("anadircorrespondencia: letra= "+ letra + "  numero= "  + Integer.toString(numero));
			return true;
		}
		log("NO anadircorrespondencia: letra= "+ letra + "  numero= "  + Integer.toString(numero));
		return false;
	}

	public static void anyadirCorrespondencias(String palabra, ArrayList <Integer> numeros) {
		//comprobar que la longitud de palabra y numeros sea la misma
		for ( int i=0; i<palabra.length(); i++){
			anyadirCorrespondencia(palabra.charAt(i) + "",numeros.get(i));
		}
		log("correspondencias=" + correspondencias);
	}

	public static void resolverCorrespondencias() {

		for(ArrayList <Integer> enteros : palabrasDecodificadas ) {
			limpiarDiccionario();
			String s = buscarCorrespondencia(enteros);
			if(s.equals("")) {
				palabrasNoCodificadas.add(enteros);
				continue;
			}
			if(s.equals("e")) {
				
				continue;
			}
			anyadirCorrespondencias(s,enteros);
		}

		int limite = 100;
		while(!comprobar() && limite-->0) {
			log("[PALABRASNOCODIFICADAS]= " + palabrasNoCodificadas);

			for(ArrayList <Integer> enteros1 : palabrasNoCodificadas ) {
				limpiarDiccionario();
				String s = buscarCorrespondencia(enteros1);
				if(s.equals("")) {
					
					continue;
					
				}
				if(s.equals("e")) {
					
					continue;
				}
				anyadirCorrespondencias(s,enteros1);
				
			}

		}
		if(limite<=0) {
			log("ERROR: bucle infinito");
		}

	}
	public static boolean comprobar() {
		int contador = 0;
		Iterator it = correspondencias.keySet().iterator();
		
		while(it.hasNext()){
		  String key = (String) it.next();
		  
		  	if(correspondencias.get(key)!=0) {
			 contador++;
		 	}
		}
		
		return contador == numLetras;
	}

	public static ArrayList <String> devolverPlalabrasNLetras(int n) {
		ArrayList <String> result = new ArrayList <String> ();
		for(String s : diccionario) {
			if(s.length()==n) {
				result.add(s);
			}
		}
		return result;
	}

	public static int[] posicionDeMaximo(ArrayList <Integer> m) {
		return posicionDeMaximo(m,0);
	}

	public static int[] posicionDeMaximo(ArrayList <Integer> m, int offset) {
		int [] resultado = new int [3];
		int posicion = 0;
		int maximo = 0;
		for (int i=0; i<m.size(); i++) {

			int numero = m.get(i);
			
			if(numero >= maximo) {
				maximo = m.get(i);
				resultado[0]=i; // Posicion del maximo
				resultado[1]=maximo; // valor del maximo
			}
		}
		resultado[2]=0; // numero de veces que se repite el maximo
		for (int i=0; i<m.size(); i++) {
			if(m.get(i)==resultado[1]) {
				resultado[2]++;
			}

		}
		return resultado;
	}

	public static void limpiarDiccionario() {
		Iterator <String> it = diccionario.iterator();
		while(it.hasNext()) {
			String p = it.next();
			if(tieneTodasLasLetrasAsignadas(p)) {
				log("borrando palabra " + p);
				it.remove();
			}
		}
		ArrayList<String> lista = new ArrayList<String>();
Iterator <String> itr = diccionario.iterator();
		while(itr.hasNext()) {
			String elemento = itr.next();
			if(!lista.contains(elemento)) {
				lista.add(elemento);
			}
		}
		log("lista= " + lista);
		diccionario.clear();
		diccionario = lista;
		
       
		
		
		log("diccionario= " + diccionario);
	}

	public static boolean tieneTodasLasLetrasAsignadas(String palabra) {
		boolean result = true;
		for(char c : palabra.toCharArray()) {
			result = result && correspondencias.get(c + "")!=0;

			
		}
		return result;
	}

	public static String buscarCorrespondencia(ArrayList <Integer> p) {
		log("buscarCorrespondencia: N= " + Integer.toString(p.size()));
		ArrayList <String> pnl = devolverPlalabrasNLetras(p.size());
		log("palabras de n letras= " + pnl);
		if(pnl.isEmpty()) {
			return "e";
		}
		ArrayList <Integer> probabilidades = new ArrayList <Integer>();
		log("pnl= " + pnl);
		for(String s : pnl) {
			int coincidencias = 0;
			for(int i=0; i<p.size(); i++) {
				String letra = s.charAt(i) + "";
				/*log("LETRA= " + letra);*/
				if(correspondencias.containsKey(letra)) {
					
						if(i>0 && s.charAt(i-1)==(s.charAt(i)) ){
							if(p.get(i-1)!=p.get(i)) {
								coincidencias=(-1);
								break;
							}
					}
					
					if(correspondencias.get(letra)!=0) {
						if(correspondencias.get(letra)!=p.get(i)){
							coincidencias=-1;
							log("-------------------------");
							break;
						}
					}
					if(correspondencias.get(letra)==p.get(i)) {
						coincidencias++;

					}
				}
			}
			probabilidades.add(coincidencias);
		}
		log("probabilidades= " + probabilidades);
		int [] posicion = posicionDeMaximo(probabilidades);
		log("posicion Maximo= " + Integer.toString(posicion[0]));
		if(posicion[2]>1) {
			log("palabra con " + Integer.toString(posicion[2]) + " maximos " + pnl.get(posicion[0]));
			
			return "";
		}
		return pnl.get(posicion[0]);
	}

	public static String imprimirCorrespondencias() {
                
                String result = "";
		ArrayList<String> a = new ArrayList<String>();
		
		Iterator it = correspondencias.keySet().iterator();
		
		for(int i=0; i<correspondencias.size(); i++){
			a.add(i,"%");
		}
		while(it.hasNext()){
		  String key = (String) it.next();
		  
		  	if(correspondencias.get(key)!=0) {
			  a.remove((int)correspondencias.get(key)-1);
			  a.add((int)correspondencias.get(key)-1,key);
		 	}
		}
		
		for(int j=0; j<a.size(); j++){
			if(!a.get(j).equals("%")){
				result+=a.get(j);
			}
		}

		return result;
		
	}

	public static void log(String msj) {
		if(logenabled) {
			System.out.println(msj);
		}
	}
}