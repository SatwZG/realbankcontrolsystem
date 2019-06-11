package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import bank_dao.find;
public class back_CX extends JFrame{
    public back_CX(String str1, String str2) throws SQLException {
 
        //this.setTitle("您的本次操作为");
      	 this.setSize(290,300);
      	 this.setLocation(300, 400);
      	
      	 JPanel panel = new JPanel();
      	 JPanel panel2 = new JPanel(new GridLayout(4, 2, 0,10));
      	 panel2.add(new JLabel("账户账号:"));
      	 panel2.add(new JLabel(str1));
      	 
      	 String name = find.findname(str1);
      	 panel2.add(new JLabel("账户姓名:"));
      	 panel2.add(new JLabel(name));
      	 
     	 panel2.add(new JLabel("账户余额:"));
     	 String money = "" + find.findmoney(str1);
    	 panel2.add(new JLabel(money));
    	 
     	 panel2.add(new JLabel("开户日期:"));
     	 String kaihudate = "" + find.finddate(str1);
     	 panel2.add(new JLabel(kaihudate));
     	 
      	 JButton b = new JButton("返回上一页");
      	 b.addActionListener(new ActionListener(){  
               //单击按钮执行的方法  
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
