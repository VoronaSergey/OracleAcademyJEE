package ua.vorona;

import ua.vorona.electronics.*;
import ua.vorona.furniture.*;
import ua.vorona.lighting.*;
import ua.vorona.stuff.*;
import ua.vorona.plant.*;

public class Main {

	public static void main(String[] args) {
		MyRoom myRoom = new MyRoom();
		myRoom.addElement(new Cupboard());
		myRoom.addElement(new Couch());
		myRoom.addElement(new Table());
		myRoom.addElement(new Bureau());
		myRoom.addElement(new Laptop());
		myRoom.addElement(new TVSet());
		myRoom.addElement(new WiFiRouter());
		myRoom.addElement(new Shandelier());
		myRoom.addElement(new FloorLamp());
		myRoom.addElement(new TableLamp());
		myRoom.addElement(new Iron());
		myRoom.addElement(new IroningBoard());
		myRoom.addElement(new Mirror());
		myRoom.addElement(new Scales());
		myRoom.addElement(new Cactus());
		myRoom.addElement(new Yucca());
		myRoom.printElements();
	}
}
