import javax.swing.JOptionPane;

public class MonthSelect {
	public enum Month{January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args){
		
	
	Month [] choice = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.November, 
	Month.December};
	Month select = (Month)JOptionPane.showInputDialog(null,"Select a Month","Month", JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
	while (select != null) {

	switch(select){
	case January:
	case February:
	case December:
		JOptionPane.showMessageDialog(null, "Do You Want to Build a Snowman?");
		break;
	case March:
	case April:
	case May:
		JOptionPane.showMessageDialog(null, "Happy Spring Days");
		break;

	case June:
	case July:
	case August:
		JOptionPane.showMessageDialog(null, "Its Summer Time");
		break;
	case September:
	case October:
	case November:
		JOptionPane.showMessageDialog(null, "Welcome to the foiliage Season");
		break;
	}
	select = (Month)JOptionPane.showInputDialog(null,"Select a Month", "Month", JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
	}


	}
}
