package nLayeredDemo.core;

import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManagerAdapter manager = new JLoggerManagerAdapter();
		manager.logToSystem(message);
		
	}

}
