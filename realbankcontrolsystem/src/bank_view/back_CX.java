package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import bank_dao.find;
public class back_CX extends JFrame{
    public back_CX(String str1, String str2) throws SQLException {
 
        //this.setTitle("���ı��β���Ϊ");
      	 this.setSize(290,300);
      	 this.setLocation(300, 400);
      	
      	 JPanel panel = new JPanel();
      	 JPanel panel2 = new JPanel(new GridLayout(4, 2, 0,10));
      	 panel2.add(new JLabel("�˻��˺�:"));
      	 panel2.add(new JLabel(str1));
      	 
      	 String name = find.findname(str1);
      	 panel2.add(new JLabel("�˻�����:"));
      	 panel2.add(new JLabel(name));
      	 
     	 panel2.add(new JLabel("�˻����:"));
     	 String money = "" + find.findmoney(str1);
    	 panel2.add(new JLabel(money));
    	 
     	 panel2.add(new JLabel("��������:"));
     	 String kaihudate = "" + find.finddate(str1);
     	 panel2.add(new JLabel(kaihudate));
     	 
      	 JButton b = new JButton("������һҳ");
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
