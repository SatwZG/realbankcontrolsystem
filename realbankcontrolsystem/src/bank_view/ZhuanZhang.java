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
    	  this.setTitle("��ӭ����ת�˽���");
    	  this.setSize(500, 650);
    	  this.setLocation(500, 300);
    	  BorderLayout bl=new BorderLayout(10,50);
    	     this.setLayout(bl);

    	  JPanel center =new JPanel(new GridLayout(10, 2, 0, 20));
    	  //this.setContentPane(center);
    	  
    	  center.add(new JLabel("ת���˻�"));
    	  JTextField text_1 = new JTextField(10);
    	  center.add(text_1);
    	  center.add(new JLabel("����"));
    	  JPasswordField text_11 = new JPasswordField(10);
    	  center.add(text_11);
    	  center.add(new JLabel("ת���˻�"));
    	  JTextField text_12 = new JTextField(10);
    	  center.add(text_12);
    	  center.add(new JLabel("ת����"));
    	  JTextField text_2 = new JTextField(10);
    	  center.add(text_2);
    	  JButton b1 = new JButton("ȷ��");
    	  b1.addActionListener(new ActionListener(){  
              //������ťִ�еķ���  
              public void actionPerformed(ActionEvent e) {  
            	 
            	  if(!text_1.getText().trim().equals(""))
            	  {
                	  str1 = text_1.getText();
            	  }   //��ȡת���˺�
            	  if(!text_11.getText().trim().equals(""))
            	  {
                	  str3 = text_11.getText();
            	  } //��ȡת���˻�����
            	  if(!text_12.getText().trim().equals(""))
            	  {
                	  str4 = text_12.getText();
            	  }  //��ȡת���˻�
                  if(!text_2.getText().trim().equals(""))
            	  {
                	  str2 = text_2.getText();//��ȡȡ����
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
          	  												JOptionPane.showMessageDialog(null, "ת���˻�������", "���� ",JOptionPane.WARNING_MESSAGE);
          	  											}
          	  										}else {
          	  											JOptionPane.showMessageDialog(null, "������벻�Ϸ�", "����",JOptionPane.ERROR_MESSAGE);
          	  										}
          	  										
          	  									}else {
          	  										JOptionPane.showMessageDialog(null, "����Ϊ��", "���� ",JOptionPane.WARNING_MESSAGE);
          	  									}
          									}else {
          										JOptionPane.showMessageDialog(null, "��֧�ִ˲���", "����",JOptionPane.ERROR_MESSAGE);
          									}
      	  								}else {
      	  									JOptionPane.showMessageDialog(null, "ת���˻�������", "���� ",JOptionPane.WARNING_MESSAGE);
      	  								}
      								}else {
      									 JOptionPane.showMessageDialog(null, "������ת���˻�", "���� ",JOptionPane.WARNING_MESSAGE);
      								}
      	  						 }else {
      	  							 JOptionPane.showMessageDialog(null, "���벻��ȷ", "����",JOptionPane.ERROR_MESSAGE);
      	  						 }
      						}else {
      							JOptionPane.showMessageDialog(null, "����������", "���� ",JOptionPane.WARNING_MESSAGE);
      						}
  						 }else {
  							JOptionPane.showMessageDialog(null, "ת���˻�������", "���� ",JOptionPane.WARNING_MESSAGE);
  						 }
                	  }else {
                		  JOptionPane.showMessageDialog(null, "������ת���˻�", "���� ",JOptionPane.WARNING_MESSAGE);
                	  }
					
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
              }  
                
          });  
    	  
    	  JButton b2 = new JButton("���");
    	  b2.addActionListener(new ActionListener(){  
              //������ťִ�еķ���  
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
