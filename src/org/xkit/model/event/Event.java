package org.xkit.model.event;

import java.util.ArrayList;
import java.util.List;

public class Event {

	private List<EventHandler> handlers;

	private boolean isHandled;

	public boolean isHandled() {
		return isHandled;
	}

	Event() {
		handlers = new ArrayList<EventHandler>();
	}

	public void addHandler(EventHandler handler) {
		handlers.add(handler);
	}

	public void fire() {
		for (EventHandler handler : handlers) {
			handler.handle();
		}
		isHandled = true;
	}

}
