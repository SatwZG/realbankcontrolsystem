package bank_view;
import java.awt.*;
import java.net.URL;
import javax.swing.*;

import javafx.scene.paint.Color;

import java.awt.Dimension;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

public class Welcome extends JFrame
{
	
	@SuppressWarnings("deprecation")
	public Welcome()
	{
		this.setTitle("ϵͳ��¼");		
		this.setSize(430,700);
		this.setLocation(500, 200);
		this.setVisible(true);
		//���ô�������Ļ�о�����ʾ
		JButton Button_In = new JButton("�������");
		this.add(Button_In,"Center");
		Button_In.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
            	 setVisible(false);
  			     new Main_View();
            }
              
        });  
		
		
		
		
		Icon bg = new ImageIcon("timg.jpg");
		// �ѱ���ͼƬ��ʾ��һ����ǩ��
		JLabel label = new JLabel(bg);
		//�ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		//���ͼƬ��frame�ĵڶ���
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//��ȡframe�����ϲ����Ϊ�������䱳����ɫ��JPanel������͸���ķ�����
		JPanel jp=(JPanel)this.getContentPane();
		jp.setOpaque(false);//����͸��
		
		
		Button_In.setPreferredSize(new Dimension(150,200));
		Button_In.setBackground(java.awt.Color.white);
		Button_In.setContentAreaFilled(false);//���ð�ť͸��
		Button_In.setBorderPainted(false);//ȥ����ť�߿�
		Button_In.setFont(new java.awt.Font("�����п�", 1, 20));
		
	}
	
	
	public static void main(String[] args)
	{
		new Welcome();
	}
}
