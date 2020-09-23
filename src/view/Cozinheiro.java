package view;

import java.util.concurrent.Semaphore;

import controller.ThreadPratos;

public class Cozinheiro {

	public static void main(String[] args) {
		
		Semaphore semaforo = new Semaphore(1);
		
		for (int i = 0; i < 5; i++){
			ThreadPratos tPrato = new ThreadPratos(semaforo);
			tPrato.start();
			
		}

	}

}
