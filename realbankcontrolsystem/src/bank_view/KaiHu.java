package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bank_dao.find;
public class KaiHu extends JFrame{
	public static int t = 100000;
	public String str1 = null, str2 =null;
    public KaiHu() {
      this.setTitle("欢迎进入开户界面");
  	  this.setSize(330, 400);
  	  this.setLocation(500, 300);
  	  BorderLayout bl=new BorderLayout(10,50);
  	     this.setLayout(bl);

  	  JPanel pane1 =new JPanel();
  	  JPanel pane2 = new JPanel();
  	  JPanel pane3 = new JPanel(new GridLayout(1, 1));
  	  pane1.add(new JLabel("开户姓名"));
  	  JTextField text_1 = new JTextField(20);
  	  pane1.add(text_1);
  	  pane2.add(new JLabel("开户金额"));
  	  JTextField text_2 = new JTextField(20);
  	  pane2.add(text_2);
  	  JButton b1 = new JButton("确认");
  	  b1.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
            	if(!text_1.getText().trim().equals(""))//如果开户姓名不为空执行的操作
            	{
            		str1 = text_1.getText(); 
            	}
            	if(!text_2.getText().trim().equals(""))//如果开户金额不为空执行的操作
            	{
            		str2 = text_2.getText(); 
            	}
            	try {
                    if(str1!=null) 
					{
                    	if(str2!=null) {
                    		if(IO.ok(str2)!=-1) {
                    			new back_KH(str1, str2);
                    		}else {
                    			JOptionPane.showMessageDialog(null, "输入金额不合法", "错误 ",JOptionPane.ERROR_MESSAGE);
                    		}
                    		
                    	}else {
                    		JOptionPane.showMessageDialog(null, "金额不能为空", "警告 ",JOptionPane.WARNING_MESSAGE);
                    	}
					}else {
						JOptionPane.showMessageDialog(null, "开户姓名不能为空", "警告 ",JOptionPane.WARNING_MESSAGE);
					}
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
            }  
              
        });  
  	  
  	  JButton b2 = new JButton("返回");
  	  b2.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
                //new Main_View(); 
                setVisible(false);
            }  
              
        });  
  	  pane3.add(b1);
  	  pane3.add(b2);
  	  this.add(pane1,"North");
  	  this.add(pane2, "Center");
  	  this.add(pane3, "South");
  	  /*Icon bg = new ImageIcon("image3.jpg");
		// 把背景图片显示在一个标签里
		JLabel label = new JLabel(bg);
		//把标签的大小位置设置为图片刚好填充整个面
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		//添加图片到frame的第二层
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//获取frame的最上层面板为了设置其背景颜色（JPanel有设置透明的方法）
		JPanel jp=(JPanel)this.getContentPane();
		jp.setOpaque(false);//设置透明
		center.setOpaque(false);*/
		this.setVisible(true);
		//this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
	{
	    KaiHu k = new KaiHu();
	}
}
