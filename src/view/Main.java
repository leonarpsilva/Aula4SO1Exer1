package view;

import controller.ServidorController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 21; i++) {
			new ServidorController(i).start();
		}
	}

}
