package recursion.controller;

import recursion.view.Popup;

public class Controller 
{
	private Popup display;
	
	public Controller()
	{
		display = new Popup();
	}
	
	public void start()
	{
		recursivePop("Display sample");
	}
	
	private void recursivePop(String message)
	{
		if (message.length() == 1)
		{
			display.displayText(message);
		}
		
		else
		{
			recursivePop(message.substring(1,  message.length()));
			display.displayText(message);
		}
	}
}
