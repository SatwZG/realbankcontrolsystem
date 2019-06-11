package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bank_dao.find;
import bank_dao.xiugai;
@SuppressWarnings("serial")
public class XiuGai_Password extends JFrame{
	String str1,str2,str3,str4;
	JButton  button_1 = new JButton("确定");
	JButton  button_2 = new JButton("完成");
	public XiuGai_Password(){  
    	this.setSize(350, 550);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(400,400);
        BorderLayout bl=new BorderLayout(50,60);
        this.setLayout(bl);
    	JPanel south = new JPanel(new GridLayout(1,2,0,20));
    	south.add(button_1);
    	south.add(button_2);
    	JPanel north = new JPanel(new GridLayout(8,1,0,30));
    	JLabel lable_1 = new JLabel("输入账号");
    	north.add(lable_1);
    	JTextField text_1=new JTextField(20);
    	north.add(text_1);
    	
    	JLabel label_2 = new JLabel("输入密码");
    	north.add(label_2);
    	JPasswordField text_2=new JPasswordField(20);
    	north.add(text_2);
    	
    	JLabel label_3 = new JLabel("输入新密码");
    	north.add(label_3);
    	JPasswordField text_3=new JPasswordField(20);
    	north.add(text_3);
    	
    	JLabel label_4 = new JLabel("再次输入新密码");
    	north.add(label_4);
    	JPasswordField text_4=new JPasswordField(20);
    	north.add(text_4);
    	
        button_1.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
            	if(!text_1.getText().trim().equals(""))
            	  {
                	  str1 = text_1.getText();
            	  }//获取需要改密的账户
            	if(!text_2.getText().trim().equals(""))
            	  {
                	  str2 = text_2.getText();
            	  } //获取需要改密的密码
            	if(!text_3.getText().trim().equals(""))
          	  {
              	  str3 = text_3.getText();
          	  }
            	if(!text_4.getText().trim().equals(""))
            	  {
                	  str4 = text_4.getText();
            	  }
               try {
            	   if(str1!=null) {
            		   if(find.findId(str1)==1) {
   						
            			   if(str2!=null) {
            					if(find.findkey(str1, str2)==1)
       						 {
       								if(str3!=null) {
       									if(str4!=null) {
       										if(str3.equals(str4)) {
               									xiugai.password(str1, str3);
               									
               									 String str = "修改密码"+"  时间:"+GetTime.getTime()+"  "+find.findall(str1);
               							      	 IO.updata_ifo(str1,str);
               									
               									JOptionPane.showMessageDialog(null, "修改密码成功", "提示",JOptionPane.PLAIN_MESSAGE);
               								}
               								else
               								{
               									JOptionPane.showMessageDialog(null, "密码不一致", "错误",JOptionPane.ERROR_MESSAGE);
               								}
       									}else {
       										JOptionPane.showMessageDialog(null, "请输入二次修改密码", "提示",JOptionPane.PLAIN_MESSAGE);
       									}
       									
       								}else {
       									JOptionPane.showMessageDialog(null, "请输入修改密码", "提示",JOptionPane.PLAIN_MESSAGE);
       								}
       								
       						 }else {
       							 JOptionPane.showMessageDialog(null, "密码不正确", "错误",JOptionPane.ERROR_MESSAGE);
       						 }
							}else {
								JOptionPane.showMessageDialog(null, "请输入密码", "提示",JOptionPane.PLAIN_MESSAGE);
							}
						 }else {
							JOptionPane.showMessageDialog(null, "账户不存在", "警告 ",JOptionPane.WARNING_MESSAGE);
						 }
            	   }else {
            		   JOptionPane.showMessageDialog(null, "请输入账户", "提示",JOptionPane.PLAIN_MESSAGE);
            	   }
					
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
            }
              
        }); 
    	
    	button_2.addActionListener(new ActionListener(){  
            //单击按钮执行的方法  
            public void actionPerformed(ActionEvent e) {  
               
            	setVisible(false);
                
            }
              
        });  
    	
    	this.add(south,BorderLayout.SOUTH);
    	this.add(north,BorderLayout.NORTH);
    	this.setVisible(true);
    }  
    
    
    public static void main(String[] args){  
    	
        new XiuGai_Password();  
    }  
}
