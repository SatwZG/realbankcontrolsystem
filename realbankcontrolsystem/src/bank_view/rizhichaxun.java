package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import bank_dao.find;
import bank_dao.xiaohu;
public class rizhichaxun extends JFrame{
	public static int t = 100000;
	public String str1, str2;
    public rizhichaxun() {
      //this.setTitle("��ӭ���뿪������");
  	  this.setSize(330, 400);
  	  this.setLocation(500, 300);
  	  BorderLayout bl=new BorderLayout(10,50);
  	     this.setLayout(bl);

  	  JPanel pane1 =new JPanel();
  	  JPanel pane2 = new JPanel();
  	  JPanel pane3 = new JPanel(new GridLayout(1, 1));
  	  pane1.add(new JLabel("��ѯ�˻�:"));
  	  JTextField text_1 = new JTextField(20);
  	  pane1.add(text_1);
  	  pane2.add(new JLabel("��ѯ����:"));
  	  JPasswordField text_2 = new JPasswordField(20);
  	  pane2.add(text_2);
  	  JButton b1 = new JButton("ȷ��");
  	  b1.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
            	if(!text_1.getText().trim().equals(""))
          	  {
              	  str1 = text_1.getText();
          	  }//��ȡ�˺�
            	if(!text_2.getText().trim().equals(""))
          	  {
              	  str2 = text_2.getText();//��ȡȡ����
          	  }  //��ȡ���� 
            	try {
					find.findall(str1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	try {
            		if(str1!=null) {
            			if(find.findId(str1)==1) {
       						if(str2!=null) {
       							if(find.findkey(str1, str2)==1)
          						 {
          								String str = IO.show_ifo(str1);
          								new history(str);
          								
          						 }else {
          							 JOptionPane.showMessageDialog(null, "���벻��ȷ", "����",JOptionPane.ERROR_MESSAGE);
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
  	  
  	  JButton b2 = new JButton("����");
  	  b2.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
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
  	  
	  this.setVisible(true);

    }
    public static void main(String[] args)
	{
	    new rizhichaxun();
	}
}
