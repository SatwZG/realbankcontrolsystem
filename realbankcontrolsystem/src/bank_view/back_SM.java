package bank_view;
import java.awt.*;

import bank_dao.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class back_SM extends JFrame{
    public back_SM(String str1, String str2, String str3) throws Exception {
    	
        //this.setTitle("���ı��β���Ϊ");
      	 this.setSize(290,300);
      	 this.setLocation(300, 400);
      	 JPanel panel = new JPanel();
      	 JPanel panel2 = new JPanel(new GridLayout(3, 2,0,10));
      	
      	 panel2.add(new JLabel("�����:"));
     	 panel2.add(new JLabel(str2));
     	panel2.add(new JLabel("�˻����:"));
     	String money = "" + find.findmoney(str1);
    	 panel2.add(new JLabel(money));
     	 panel2.add(new JLabel("���ʱ��:"));
     	 panel2.add(new JLabel(GetTime.getTime()));
      	 JButton b = new JButton("������һҳ");
      	 
      	 String str = "���"+"  ���:"+str2+"  ʱ��:"+GetTime.getTime()+"  "+find.findall(str1);
      	 IO.updata_ifo(str1,str);
      	
      	 b.addActionListener(new ActionListener(){  
               //������ťִ�еķ���  
               public void actionPerformed(ActionEvent e) {  
               
                  setVisible(false);
               }  
                 
           });  
      	 panel.add(b);
      	 this.add(panel2, "North");
      	 this.add(panel,"South");
      	 this.setVisible(true);
    }
}
