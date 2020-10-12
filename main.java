import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;



public class main extends Applet implements ActionListener 
{
	Label lbText = new Label();
	Button cmdButton = new Button();
	Frame frame= new Frame();
	int i = 0000;
	
	public void init(){
		cmdButton.setSize(15, 50);
		cmdButton.setLabel("test");
		cmdButton.setBackground(Color.BLUE);
		cmdButton.setForeground(Color.CYAN);
		cmdButton.addActionListener(this);
		add(cmdButton);
		add(lbText);
		setSize(500,500);
	}


	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == this.cmdButton)
		{
			cmdButton.setLabel("test1");
			i++;
			String temp = i + "";
			lbText.setText(temp);
			add(lbText);
		}else if(true){
			
		}
	};
}