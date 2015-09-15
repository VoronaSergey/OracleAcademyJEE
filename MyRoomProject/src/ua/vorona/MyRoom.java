package ua.vorona;

import java.util.ArrayList;
import java.util.List;

public class MyRoom {
	private List<RoomElement> elements = new ArrayList<>();

	public MyRoom() {
	}

	public List<RoomElement> getElements() {
		return elements;
	}

	public void addElement(RoomElement e) {
		elements.add(e);
	}

	public void printElements() {
		System.out.println("In my room are:");
		for (RoomElement item : elements) {
			System.out.println(item);
		}
	}
}
