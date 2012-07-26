package org.xkit.model.event.predefined;

import org.xkit.model.event.Args;

public class SomeArgs extends Args {

	public SomeArgs(String msg) {
		this.msg = msg;
	}

	private String msg;

	public String getMsg() {
		return msg;
	}
}
