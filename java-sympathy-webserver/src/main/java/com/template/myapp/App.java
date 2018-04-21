package com.template.myapp;

import samx.function.*;
import sympathy.*;
import sympathy.app.*;

public class App extends WebServer
{
	public boolean initializeServer(HTTPServer server)
	{
		if(super.initializeServer(server) == false) {
			return false;
		}
		HTTPServerRequestHandlerMap handler = new HTTPServerRequestHandlerMap();
		handler.get("", new Procedure1<HTTPServerRequest>() {
			public void execute(HTTPServerRequest req) {
				req.sendTextString("index");
			}
		});
		handler.get("test", new Procedure1<HTTPServerRequest>() {
			public void execute(HTTPServerRequest req) {
				req.sendTextString("test");
			}
		});
		server.pushRequestHandler(handler);
		return true;
	}

	public static void main(String[] args)
	{
		new App().executeMain(args);
	}
}
