package bank_view;
import javax.swing.*;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.awt.*;
public class pan extends JPanel{
	public void paint(Graphics cs)
	{
		cs.setColor(Color.WHITE);
		cs.setFont(new Font("����",Font.BOLD,30));
		cs.drawString("��������ʱ��", 10, 200);
		cs.drawString("������һ��Я�ִ���", 150, 250);
		cs.drawString("��Ϊ���ʵķ���", 10, 300);
		cs.drawString("��ӭʹ�����й���ϵͳ", 180, 30);
		
	}
	
}
