import javax.swing.JOptionPane;

public class rollercoaster {
  public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("how tall are you in inches");
	int Height = Integer.parseInt(input);
	 
	if( Height < 58 ){
			
		System.out.println("you can ride the rollercoster");
			
			
  }
	else {
		System.out.println("you need to grow");
	}
	
	
}
}
