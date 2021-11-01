package com.technoelevate.javabasics.assignment1_11_21;

public class MainMethodComputer {

	public static void main(String[] args) {
		Keybord keybord=new Keybord(52, "English");
		MotherBord motherBord= new MotherBord("Samsung", 5);
		Mouse mouse=new Mouse("Dell", 350);
		Display display=new Display("Super_Amoled", 2024);
		Sounds sounds=new Sounds(2, 100);
		Printer printer=new Printer("Epson", 25000);
		ComputerClass computerClass=new ComputerClass(keybord, motherBord, mouse, display, sounds, printer);
		computerClass.status();
	}

}
