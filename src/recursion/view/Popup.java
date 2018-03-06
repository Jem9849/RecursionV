package recursion.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * This class sets up the Popup, which displays the text using popups.
 * 
 * @author Jeremy
 */
public class Popup
{
	/**
	 * These are variables that are used for the Chatbot icon, and the window's title.
	 */
	private ImageIcon icon;
	private String windowTitle;
	
	/**
	 * This I think basically just displays the text.
	 * @param message that is used for displaying the message.
	 */
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
	/**
	 * I think this takes what the user says and returns an answer.
	 * @param question is used to help form the answer I think.
	 * @return the answer that was formed.
	 */
	public String collectResponse(String question)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
		
		return answer; 
	}
}

