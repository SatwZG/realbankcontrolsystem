package bank_view;
import javax.swing.*;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.awt.*;
public class pan extends JPanel{
	public void paint(Graphics cs)
	{
		cs.setColor(Color.WHITE);
		cs.setFont(new Font("楷体",Font.BOLD,30));
		cs.drawString("互联网的时代", 10, 200);
		cs.drawString("让我们一起携手打造", 150, 250);
		cs.drawString("更为优质的服务", 10, 300);
		cs.drawString("欢迎使用银行管理系统", 180, 30);
		
	}
	
}
