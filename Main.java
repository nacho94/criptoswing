
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macmini
 */
public class Main {
    public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
                Criptojuego juego = new Criptojuego();
                int numeroTest = juego.pedirNumTests(scan);
		
		
		for(int i=0; i<numeroTest; i++) {
			juego.limpiar();
			juego.pedirTest(scan);
		
			juego.decodificarPalabras();
			juego.resolverCorrespondencias();
			
			juego.imprimirCorrespondencias();
		}
	}
}
