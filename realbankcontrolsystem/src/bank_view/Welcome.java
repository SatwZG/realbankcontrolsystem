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
		this.setTitle("系统登录");		
		this.setSize(430,700);
		this.setLocation(500, 200);
		this.setVisible(true);
		//设置窗口在屏幕中居中显示
		JButton Button_In = new JButton("点击进入");
		this.add(Button_In,"Center");
		Button_In.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
            	 setVisible(false);
  			     new Main_View();
            }
              
        });  
		
		
		
		
		Icon bg = new ImageIcon("timg.jpg");
		// 把背景图片显示在一个标签里
		JLabel label = new JLabel(bg);
		//把标签的大小位置设置为图片刚好填充整个面
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		//添加图片到frame的第二层
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//获取frame的最上层面板为了设置其背景颜色（JPanel有设置透明的方法）
		JPanel jp=(JPanel)this.getContentPane();
		jp.setOpaque(false);//设置透明
		
		
		Button_In.setPreferredSize(new Dimension(150,200));
		Button_In.setBackground(java.awt.Color.white);
		Button_In.setContentAreaFilled(false);//设置按钮透明
		Button_In.setBorderPainted(false);//去除按钮边框
		Button_In.setFont(new java.awt.Font("华文行楷", 1, 20));
		
	}
	
	
	public static void main(String[] args)
	{
		new Welcome();
	}
}
