

import java.util.Scanner;
import java.util.Random;

public class AtaqueAlinigena {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("la invacion ha empezado, debes defender la tierra tienes 20 puntos de vida");
		int vidaTierra = 20, vidaAlien = 10, numAlien, numTierra, diferencial;

		do {
			System.out.println("Cuantos alienigenas quieres atacar en esta ronda? ( maximo : 4)");
			numTierra = sn.nextInt();
			numAlien = rn.nextInt(4) + 1;
			diferencial = numAlien - numTierra;
			System.out.println("Te atacaron con: " + numAlien);

			if (diferencial == 0) {
				vidaAlien = vidaAlien - numTierra;
			} else if (diferencial > 0) { // te quedaste corto
				vidaAlien -= numTierra;
				vidaTierra -= diferencial;
			} else if (diferencial < 0) { // te pasaste
				vidaAlien = vidaAlien - numTierra - diferencial;
				vidaTierra = vidaTierra + diferencial;
			}
			System.out.println("te quedan: " + vidaTierra);
			System.out.println("a alien le quedan: " + vidaAlien);

		} while (vidaTierra > 0 && vidaAlien > 0);
		
		if (vidaTierra <= 0) {
            System.out.println("La Tierra ha sido derrotada");
        } else {
            System.out.println("Has derrotado a los alienígenas");
        }

	}

}
