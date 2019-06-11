package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import bank_dao.cunkuan;
import bank_dao.find;
import bank_dao.qukuan;
@SuppressWarnings("serial")
public class ZhuanZhang extends JFrame{
	  String str1 = null, str2=null, str3=null, str4=null;
      public ZhuanZhang() {
    	  this.setTitle("欢迎进入转账界面");
    	  this.setSize(500, 650);
    	  this.setLocation(500, 300);
    	  BorderLayout bl=new BorderLayout(10,50);
    	     this.setLayout(bl);

    	  JPanel center =new JPanel(new GridLayout(10, 2, 0, 20));
    	  //this.setContentPane(center);
    	  
    	  center.add(new JLabel("转出账户"));
    	  JTextField text_1 = new JTextField(10);
    	  center.add(text_1);
    	  center.add(new JLabel("密码"));
    	  JPasswordField text_11 = new JPasswordField(10);
    	  center.add(text_11);
    	  center.add(new JLabel("转入账户"));
    	  JTextField text_12 = new JTextField(10);
    	  center.add(text_12);
    	  center.add(new JLabel("转入金额"));
    	  JTextField text_2 = new JTextField(10);
    	  center.add(text_2);
    	  JButton b1 = new JButton("确认");
    	  b1.addActionListener(new ActionListener(){  
              //单击按钮执行的方法  
              public void actionPerformed(ActionEvent e) {  
            	 
            	  if(!text_1.getText().trim().equals(""))
            	  {
                	  str1 = text_1.getText();
            	  }   //获取转出账号
            	  if(!text_11.getText().trim().equals(""))
            	  {
                	  str3 = text_11.getText();
            	  } //获取转出账户密码
            	  if(!text_12.getText().trim().equals(""))
            	  {
                	  str4 = text_12.getText();
            	  }  //获取转入账户
                  if(!text_2.getText().trim().equals(""))
            	  {
                	  str2 = text_2.getText();//获取取款金额
            	  }
            	  double money = 0;
            	  if(str2!=null&&IO.ok(str2)!=-1) {
            		  money = Double.parseDouble(str2);
            	  }
                  try {
                	  if(str1!=null) {
                		  if(find.findId(str1)==1) {
      						if(str3!=null) {
      							if(find.findkey(str1, str3)==1)
      	  						 {
      								if(str4!=null) {
      									
      									if(find.findId(str4)==1) {
      										if(!str4.equals(str1)) {
      											if(str2!=null) {
          	  										if(IO.ok(str2)!=-1) {
          	  											if(find.findmoney(str1)>money) {
          	  												cunkuan.add(money, str4);
          	  												new back_ZZ(str1,str2,str3,str4);
          	  											}else {
          	  												JOptionPane.showMessageDialog(null, "转出账户的余额不足", "警告 ",JOptionPane.WARNING_MESSAGE);
          	  											}
          	  										}else {
          	  											JOptionPane.showMessageDialog(null, "金额输入不合法", "错误",JOptionPane.ERROR_MESSAGE);
          	  										}
          	  										
          	  									}else {
          	  										JOptionPane.showMessageDialog(null, "金额不能为空", "警告 ",JOptionPane.WARNING_MESSAGE);
          	  									}
          									}else {
          										JOptionPane.showMessageDialog(null, "不支持此操作", "错误",JOptionPane.ERROR_MESSAGE);
          									}
      	  								}else {
      	  									JOptionPane.showMessageDialog(null, "转入账户不存在", "警告 ",JOptionPane.WARNING_MESSAGE);
      	  								}
      								}else {
      									 JOptionPane.showMessageDialog(null, "请输入转入账户", "警告 ",JOptionPane.WARNING_MESSAGE);
      								}
      	  						 }else {
      	  							 JOptionPane.showMessageDialog(null, "密码不正确", "错误",JOptionPane.ERROR_MESSAGE);
      	  						 }
      						}else {
      							JOptionPane.showMessageDialog(null, "请输入密码", "警告 ",JOptionPane.WARNING_MESSAGE);
      						}
  						 }else {
  							JOptionPane.showMessageDialog(null, "转出账户不存在", "警告 ",JOptionPane.WARNING_MESSAGE);
  						 }
                	  }else {
                		  JOptionPane.showMessageDialog(null, "请输入转出账户", "警告 ",JOptionPane.WARNING_MESSAGE);
                	  }
					
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
              }  
                
          });  
    	  
    	  JButton b2 = new JButton("完成");
    	  b2.addActionListener(new ActionListener(){  
              //单击按钮执行的方法  
              public void actionPerformed(ActionEvent e) {  
                  //new Main_View(); 
                  setVisible(false);
              }  
                
          });  
    	  center.add(b1);
    	  center.add(b2);
    	  this.add(center,"Center");
    	  
  		this.setVisible(true);
  		
      }
      public static void main(String[] args)
  	{
  		new ZhuanZhang();
  		
  	}
}
