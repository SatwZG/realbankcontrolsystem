package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bank_dao.cunkuan;
import bank_dao.find;
public class SM extends JFrame{
	public String str1 = null, str2=null, str3=null;
	double l = 0;
      public SM() {
    	  this.setTitle("��ӭ���������");	
    	  this.setSize(380, 500);
    	  this.setLocation(500, 100);
    	  BorderLayout bl=new BorderLayout(10,50);
    	     this.setLayout(bl);

    	  JPanel center =new JPanel(new GridLayout(9, 2, 0, 20));
    	  //this.setContentPane(center);
    	  center.add(new JLabel("�˻�"));
    	  JTextField text_1 = new JTextField(10);
    	  center.add(text_1);
    	  center.add(new JLabel("����"));
    	  JPasswordField text_11 = new JPasswordField(10);
    	  center.add(text_11);
    	  center.add(new JLabel("������"));
    	  JTextField text_2 = new JTextField(10);
    	  center.add(text_2);
    	  JButton b1 = new JButton("ȷ��");
    	  b1.addActionListener(new ActionListener(){  
              //������ťִ�еķ���  
              public void actionPerformed(ActionEvent e) {
            	  if(!text_1.getText().trim().equals(""))
            	  {
            		  str1 = text_1.getText();//��ȡ�˻�
            	  }
            	  
            	  if(!text_2.getText().trim().equals(""))
            	  {
                	  str2 = text_2.getText();//��ȡȡ����
            	  }
            	  if(!text_11.getText().trim().equals(""))
                  {
            		  str3 = text_11.getText();
                  }
           
                  double money = 0;
                  if(str2!=null&& IO.ok(str2)!=-1) {
                	  money = Double.parseDouble(str2);
                  }
                  
                  try {
                	  if(str1!=null) {
                		  if(cunkuan.add(money,str1)==1) {
      						if(str3!=null) {
      							if(find.findkey(str1, str3)==1)
      						    {
      								if(str2!=null)
      								{
      								  
				            		     if(IO.ok(str2)!=-1)
				            		      {
				            		    	 new back_SM(str1, str2, str3);
				            		      }else {
				            		    	  JOptionPane.showMessageDialog(null, "������벻�Ϸ�", "���� ",JOptionPane.ERROR_MESSAGE);
				            		      }
				            		  
      							   }
      							   else {
      									JOptionPane.showMessageDialog(null, "����Ϊ��", "���� ",JOptionPane.WARNING_MESSAGE);
      								}
      								
      						 }else {
      							 JOptionPane.showMessageDialog(null, "���벻��ȷ", "���� ",JOptionPane.ERROR_MESSAGE);
      						 }
      							 
      						 }else {
      							JOptionPane.showMessageDialog(null, "����������", "���� ",JOptionPane.WARNING_MESSAGE);
      						 }
      						}else {
      							JOptionPane.showMessageDialog(null, "�˻�������", "���� ",JOptionPane.WARNING_MESSAGE);
      						}	
  							
                	  }else {
                		  JOptionPane.showMessageDialog(null, "�������˻�", "���� ",JOptionPane.WARNING_MESSAGE);
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
                  
                  setVisible(false);
                  //new Main_View(); 
                  
              }  
                
          });  
    	  
    	  
    	  
    	  
    	  center.add(b1);
    	  center.add(b2);
    	  this.add(center,"Center");
    	  
    	 /* Icon bg = new ImageIcon("image3.jpg");
  		// �ѱ���ͼƬ��ʾ��һ����ǩ��
  		JLabel label = new JLabel(bg);
  		//�ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������
  		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
  		//���ͼƬ��frame�ĵڶ���
  		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
  		//��ȡframe�����ϲ����Ϊ�������䱳����ɫ��JPanel������͸���ķ�����
  		JPanel jp=(JPanel)this.getContentPane();
  		jp.setOpaque(false);//����͸��*/
  		center.setOpaque(false);
  		this.setVisible(true);
  		//this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      }
      public static void main(String[] args)
  	{
  		new SM();
  		
  	}
}
