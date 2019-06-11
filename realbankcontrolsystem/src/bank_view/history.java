package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
@SuppressWarnings("serial")
public class history extends JFrame{
     public history(String str) {
    	 this.setTitle("欢迎进入日志查询界面");
    	 this.setSize(400,500);
    	 this.setLocation(300, 400);
    	 JPanel panel = new JPanel();
    	 
    	 JTextArea textArea = new JTextArea(22,30);
    	 
    	 textArea.append(str);
    	 
    	 textArea.setBounds(136, 136, 264, 61);
    	 textArea.setWrapStyleWord(true);
    	 textArea.setEditable(true);
    	 
    	 JScrollPane jsp=new JScrollPane(textArea);//新建一个滚动条界面，将文本框传入
    	 jsp .setBounds(136, 207, 264, 61);
    	 //textArea.setLineWrap(true);
    	 
    	 
    	 jsp.setHorizontalScrollBarPolicy( 
    			 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
    	 jsp.setVerticalScrollBarPolicy( 
    			 JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
    	 //textArea.setCaretPosition(textArea.getText().length());
    	 textArea.setEditable(false);
    	 JPanel panel2 = new JPanel();
    	 this.getContentPane().add(jsp);
    	 JButton b = new JButton("返回上一页");
    	 b.addActionListener(new ActionListener(){  
             //单击按钮执行的方法  
             public void actionPerformed(ActionEvent e) {  
               // new Main_View();
                setVisible(false);
             }  
               
         });  
    	 panel.add(b);
    	 panel2.setVisible(true);
    	 this.add(panel2, "North");
    	 this.add(panel,"South");
    	 this.setVisible(true);
     }
     /*public static void main(String[] args)
   	{
   		new history("kjl");
   		
   	}*/
}
