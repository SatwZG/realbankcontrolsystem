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
     this.setTitle("��������ʻ���ϢΪ");
   	 this.setSize(290,300);
   	 this.setLocation(300, 400);
   	 JPanel panel = new JPanel();
   	 JPanel panel2 = new JPanel(new GridLayout(4, 2,0,10));
   	 panel2.add(new JLabel("�����˻�:"));
   	 panel2.add(new JLabel(str3));
   	 panel2.add(new JLabel("��ʼ����:"));
   	panel2.add(new JLabel("123456"));
   	panel2.add(new JLabel("�������:"));
  	 panel2.add(new JLabel(str2));
  	panel2.add(new JLabel("����ʱ��:"));
  	String strtime2 = GetTime.getTime();
  	 panel2.add(new JLabel(strtime2));
   	 JButton b = new JButton("������һҳ");
   	 
   	 
   	 double money = Double.parseDouble(str2);
   	 bank_dao.kaihu.insert(str3, str1, money,"123456",strtime2);
   	 
   	File f = new File("C:\\Users\\������\\eclipse-workspace\\custome_ifo\\" + str3 + ".txt") ;        // ʵ����File��Ķ��󣬸���·��
    f.createNewFile() ; // �����ļ������ݸ�����·������
   	 
   	 
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
