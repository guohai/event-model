package org.xkit.model.event;

public class EventHandler {

	EventHandler(Args a) {
		args = a;
	}

	public void handle() {

	}

	private Args args;

	public Args getArgs() {
		return args;
	}
}
