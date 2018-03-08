package ru.abashlykov.start;
import ru.abashlykov.models.*;

import java.util.ArrayList;

public class StartUI {
	private ArrayList<Integer> ranges = new ArrayList<>();
	private static Input input;
	public static Tracker tracker;
	public StartUI(Input input, Tracker tracker){
		this.input = input;
		this.tracker = tracker;
	}

	private void fillRanges(){
		ranges.add(0);
		ranges.add(1);
		ranges.add(2);
		ranges.add(3);
		ranges.add(4);
		ranges.add(5);
	}

	public void init() {
		fillRanges();
		Tracker tracker = new Tracker();
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		do{
			menu.show();
			menu.select(input.ask("select: ", ranges));
		}while(! "y".equals(this.input.ask("Exit? (y): ")));
	}

	public static void main(String[] args) {
		Input input = new ValidateInput();
		new StartUI(input, tracker).init();
	}
}