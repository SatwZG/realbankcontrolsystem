package bank_view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
	public static void updata_ifo(String str1, String str2) throws Exception{    // �����쳣�׳�
		String ans = null;
        ans = show_ifo(str1);
		DataOutputStream dos = null ;            // �����������������
    	File f = new File("C:\\Users\\������\\eclipse-workspace\\custome_ifo\\" + str1 + ".txt") ;        // ʵ����File��Ķ��󣬸���·��
        dos = new DataOutputStream(new FileOutputStream(f)) ;    // ʵ�����������������
        
        if(ans != null) {
            dos.writeChars(ans);
            dos.writeChar('\n') ;        	
        }
        dos.writeChars(str2);
        dos.writeChar('\n') ;
        dos.close() ;    // �ر������
	}
	public static String show_ifo(String str) throws Exception
	{
		DataInputStream dis = null ;        // ������������������
		File f = new File("C:\\Users\\������\\eclipse-workspace\\custome_ifo\\" + str + ".txt") ;        // ʵ����File��Ķ��󣬸���·��
        dis = new DataInputStream(new FileInputStream(f)) ;    // ʵ������������������
        String name = null ;    // ��������
        char temp[] = null ;    // ������Ʒ����
        int len = 0 ;    // �����ȡ���ݵĸ���
        char c = 0;
        String ans = new String("");
        try{
            while(true){
       
                temp = new char[200] ;    // ���ٿռ�
                len = 0 ;
                while((c=dis.readChar())!='\n'){    // �������ݣ���Ϊֱ����ȡ��'\t'������˶�ȡһ���ַ�����δ��ȡ����ʾ�������ݡ�
                	
                    temp[len] = c ;
                    len ++ ;    // ��ȡ���ȼ�1
                    
                }
                name = new String(temp,0,len) ;    // ���ַ������ΪString
               // System.out.println(name);
                ans += "" + name + '\n';
            }
        }catch(Exception e){}
        dis.close() ;
        System.out.println(ans);
        return ans;
	}
	public static double ok(String str)
	{
		
		if(str.charAt(0) == '0')
	       {
	    	   if(str.length() > 1 && str.charAt(1) != '.') return -1;
	       }
		else if(str.charAt(0) == '.') return -1;

	       double ans = 0;
	       double num = 1;
	       int flag = 0, i;
	       for(i = 0; i < str.length(); i++)
	       {
	    	   if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
	    	   {
	    		   if(flag == 1) num *= 10;
	    		   ans = ans*10 + str.charAt(i) - '0';
	    	   }
	    	   else if(str.charAt(i) == '.')
	    	   {
	    		   if(flag == 1) break;
	    		   flag = 1;
	    	   }
	    	   else break;
	       }
	       if(i < str.length() || str.charAt(str.length()-1) == '.') return -1;
	       else return ans/num;
	}

   public static void main(String[] args) throws Exception {
	   IO io = new IO();
	   String str = new String("100002");
	   System.out.println(io.show_ifo(str));
   }
}
