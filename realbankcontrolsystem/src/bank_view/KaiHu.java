package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bank_dao.find;
public class KaiHu extends JFrame{
	public static int t = 100000;
	public String str1 = null, str2 =null;
    public KaiHu() {
      this.setTitle("��ӭ���뿪������");
  	  this.setSize(330, 400);
  	  this.setLocation(500, 300);
  	  BorderLayout bl=new BorderLayout(10,50);
  	     this.setLayout(bl);

  	  JPanel pane1 =new JPanel();
  	  JPanel pane2 = new JPanel();
  	  JPanel pane3 = new JPanel(new GridLayout(1, 1));
  	  pane1.add(new JLabel("��������"));
  	  JTextField text_1 = new JTextField(20);
  	  pane1.add(text_1);
  	  pane2.add(new JLabel("�������"));
  	  JTextField text_2 = new JTextField(20);
  	  pane2.add(text_2);
  	  JButton b1 = new JButton("ȷ��");
  	  b1.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
            	if(!text_1.getText().trim().equals(""))//�������������Ϊ��ִ�еĲ���
            	{
            		str1 = text_1.getText(); 
            	}
            	if(!text_2.getText().trim().equals(""))//���������Ϊ��ִ�еĲ���
            	{
            		str2 = text_2.getText(); 
            	}
            	try {
                    if(str1!=null) 
					{
                    	if(str2!=null) {
                    		if(IO.ok(str2)!=-1) {
                    			new back_KH(str1, str2);
                    		}else {
                    			JOptionPane.showMessageDialog(null, "������Ϸ�", "���� ",JOptionPane.ERROR_MESSAGE);
                    		}
                    		
                    	}else {
                    		JOptionPane.showMessageDialog(null, "����Ϊ��", "���� ",JOptionPane.WARNING_MESSAGE);
                    	}
					}else {
						JOptionPane.showMessageDialog(null, "������������Ϊ��", "���� ",JOptionPane.WARNING_MESSAGE);
					}
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
  	  /*Icon bg = new ImageIcon("image3.jpg");
		// �ѱ���ͼƬ��ʾ��һ����ǩ��
		JLabel label = new JLabel(bg);
		//�ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		//���ͼƬ��frame�ĵڶ���
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//��ȡframe�����ϲ����Ϊ�������䱳����ɫ��JPanel������͸���ķ�����
		JPanel jp=(JPanel)this.getContentPane();
		jp.setOpaque(false);//����͸��
		center.setOpaque(false);*/
		this.setVisible(true);
		//this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
	{
	    KaiHu k = new KaiHu();
	}
}
