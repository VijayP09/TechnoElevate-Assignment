package com.technoelevate.javabasics.assignment1_11_21;

public class ComputerClass {
	Keybord keybord;
	MotherBord motherBord;
	Mouse mouse;
	Display display;
	Sounds sounds;
	Printer printer;
	
	public ComputerClass(Keybord keybord, MotherBord motherBord, Mouse mouse, Display display, Sounds sounds,
			Printer printer) {
		this.keybord = keybord;
		this.motherBord = motherBord;
		this.mouse = mouse;
		this.display = display;
		this.sounds = sounds;
		this.printer = printer;
	}
	
	public void status() {
		System.out.println("Computer is ready for use");
	}
	
}
