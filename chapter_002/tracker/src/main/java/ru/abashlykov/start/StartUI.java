package ru.abashlykov.start;
import ru.abashlykov.models.*;

public class StartUI {
	private int[] ranges = new int[] {0,1,2,3,4,5};
	private static Input input;
	public static Tracker tracker;
	public StartUI(Input input, Tracker tracker){
		this.input = input;
		this.tracker = tracker;
	}

	public void init() {
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