package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Main_View extends JFrame{
	public Main_View()
	{
		this.setTitle("银行管理系统");
		this.setSize(670,810);
		this.setLocation(600,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//框架中加载面板
		pan p =new pan();
		this.add(p);
		JPanel south = new JPanel(new GridLayout(4,3,100,100));
		JButton button_1 = new JButton("存款");
		south.add(button_1);
		south.add(new JLabel (""));
		
		button_1.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
            	new SM();
            }  
              
        });  
		
		JButton button_2 = new JButton("取款");
		south.add(button_2);
		
		button_2.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
               new DM();
            }  
              
        });  
		
		
		JButton button_3 = new JButton("转账");
		south.add(button_3);
		button_3.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
               new ZhuanZhang(); 
            }  
              
        });  
		
		
		
		south.add(new JLabel (""));
		JButton button_4 = new JButton("查询");
		south.add( button_4);
		
		button_4.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
               new Select();
            }  
              
        });  
		
		JButton button_6 = new JButton("销户");
		south.add(button_6);
		button_6.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
               new XiaoHu();
            }  
              
        }); 
		
		south.add(new JLabel (""));
		JButton button_8 = new JButton("开户");
		south.add(button_8);
		button_8.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
              new KaiHu();
            }  
              
        });  
		
		
		
		JButton button_5 = new JButton("修改密码");
		south.add(button_5);
		
		button_5.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
               
            	new XiuGai_Password(); 
                
            }  
              
        });  
		
		
		
		
		south.add(new JLabel (""));
		JButton button_7 = new JButton("日志查询");
		south.add( button_7);
		
		button_7.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
               new rizhichaxun();
            }
              
        });  
		
		Icon bg = new ImageIcon("image1.jpg");
		// 把背景图片显示在一个标签里
		JLabel label = new JLabel(bg);
		//把标签的大小位置设置为图片刚好填充整个面
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		//添加图片到frame的第二层
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//获取frame的最上层面板为了设置其背景颜色（JPanel有设置透明的方法）
		JPanel jp=(JPanel)this.getContentPane();
		jp.setOpaque(false);//设置透明
		
		
		south.setBackground(Color.darkGray);
	
		this.add(south, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
}
