package org.xkit.model.event;

import org.xkit.model.event.predefined.SomeArgs;

public class Main {

	private static Event testEvent = new Event();

	public static void main(String[] args) {
		testEvent.addHandler(new EventHandler(new Args()) {
			@Override
			public void handle() {
				System.out.println("handler something!");
			}
		});

		testEvent.addHandler(new EventHandler(new SomeArgs("hello")) {
			@Override
			public void handle() {
				System.out.println("handler!" + ((SomeArgs) getArgs()).getMsg());
			}
		});

		testEvent.fire();

		System.out.println(testEvent.isHandled());
	}
}
