package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import bank_dao.*;
import javax.swing.*;
public class back_KH extends JFrame{
    public back_KH(String str1, String str2) throws Exception{
     //KaiHu.t += bank_dao.kaihu.row()+1;
     
     String strtime = GetTime.getTime();
     String str3 =((strtime.replace("-", "")).replace(" ", "")).replace(":","");
     
     //str3 = KaiHu.t+"";
     this.setTitle("您开设的帐户信息为");
   	 this.setSize(290,300);
   	 this.setLocation(300, 400);
   	 JPanel panel = new JPanel();
   	 JPanel panel2 = new JPanel(new GridLayout(4, 2,0,10));
   	 panel2.add(new JLabel("开户账户:"));
   	 panel2.add(new JLabel(str3));
   	 panel2.add(new JLabel("初始密码:"));
   	panel2.add(new JLabel("123456"));
   	panel2.add(new JLabel("开户金额:"));
  	 panel2.add(new JLabel(str2));
  	panel2.add(new JLabel("开户时间:"));
  	String strtime2 = GetTime.getTime();
  	 panel2.add(new JLabel(strtime2));
   	 JButton b = new JButton("返回上一页");
   	 
   	 
   	 double money = Double.parseDouble(str2);
   	 bank_dao.kaihu.insert(str3, str1, money,"123456",strtime2);
   	 
   	File f = new File("C:\\Users\\张振勇\\eclipse-workspace\\custome_ifo\\" + str3 + ".txt") ;        // 实例化File类的对象，给出路径
    f.createNewFile() ; // 创建文件，根据给定的路径创建
   	 
   	 
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
