package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Main_View extends JFrame{
	public Main_View()
	{
		this.setTitle("���й���ϵͳ");
		this.setSize(670,810);
		this.setLocation(600,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//����м������
		pan p =new pan();
		this.add(p);
		JPanel south = new JPanel(new GridLayout(4,3,100,100));
		JButton button_1 = new JButton("���");
		south.add(button_1);
		south.add(new JLabel (""));
		
		button_1.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
            	new SM();
            }  
              
        });  
		
		JButton button_2 = new JButton("ȡ��");
		south.add(button_2);
		
		button_2.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
               new DM();
            }  
              
        });  
		
		
		JButton button_3 = new JButton("ת��");
		south.add(button_3);
		button_3.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
               new ZhuanZhang(); 
            }  
              
        });  
		
		
		
		south.add(new JLabel (""));
		JButton button_4 = new JButton("��ѯ");
		south.add( button_4);
		
		button_4.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
               new Select();
            }  
              
        });  
		
		JButton button_6 = new JButton("����");
		south.add(button_6);
		button_6.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
               new XiaoHu();
            }  
              
        }); 
		
		south.add(new JLabel (""));
		JButton button_8 = new JButton("����");
		south.add(button_8);
		button_8.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
              new KaiHu();
            }  
              
        });  
		
		
		
		JButton button_5 = new JButton("�޸�����");
		south.add(button_5);
		
		button_5.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
               
            	new XiuGai_Password(); 
                
            }  
              
        });  
		
		
		
		
		south.add(new JLabel (""));
		JButton button_7 = new JButton("��־��ѯ");
		south.add( button_7);
		
		button_7.addActionListener(new ActionListener(){  
            //������ťִ�еķ���  
            public void actionPerformed(ActionEvent e) {  
               new rizhichaxun();
            }
              
        });  
		
		Icon bg = new ImageIcon("image1.jpg");
		// �ѱ���ͼƬ��ʾ��һ����ǩ��
		JLabel label = new JLabel(bg);
		//�ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		//���ͼƬ��frame�ĵڶ���
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		//��ȡframe�����ϲ����Ϊ�������䱳����ɫ��JPanel������͸���ķ�����
		JPanel jp=(JPanel)this.getContentPane();
		jp.setOpaque(false);//����͸��
		
		
		south.setBackground(Color.darkGray);
	
		this.add(south, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
}
