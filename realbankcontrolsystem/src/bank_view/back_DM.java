package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import bank_dao.find;
import bank_dao.qukuan;
public class back_DM extends JFrame{
    public back_DM(String str1, String str2, String str3) throws Exception {
 
        
      	 this.setSize(290,300);
      	 this.setLocation(300, 400);
      	 JPanel panel = new JPanel();
      	 JPanel panel2 = new JPanel(new GridLayout(3, 2, 0,10));
      	
      	 panel2.add(new JLabel("ȡ����:"));
     	 panel2.add(new JLabel(str2));
     	 double money1 = Double.parseDouble(str2);
     	 qukuan.add(money1, str1);
     	 
     	 panel2.add(new JLabel("�˻����:"));
     	 String money = "" + find.findmoney(str1);
   	
    	 panel2.add(new JLabel(money));
     	 panel2.add(new JLabel("ȡ��ʱ��:"));
     	 panel2.add(new JLabel(GetTime.getTime()));
      	 JButton b = new JButton("������һҳ");
      	 
      	 String str = "ȡ��"+"  "+"���:"+str2+"  "+"ʱ��:"+GetTime.getTime()+"  "+find.findall(str1);
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
