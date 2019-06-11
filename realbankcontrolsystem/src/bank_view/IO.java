package bank_view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
	public static void updata_ifo(String str1, String str2) throws Exception{    // 所有异常抛出
		String ans = null;
        ans = show_ifo(str1);
		DataOutputStream dos = null ;            // 声明数据输出流对象
    	File f = new File("C:\\Users\\张振勇\\eclipse-workspace\\custome_ifo\\" + str1 + ".txt") ;        // 实例化File类的对象，给出路径
        dos = new DataOutputStream(new FileOutputStream(f)) ;    // 实例化数据输出流对象
        
        if(ans != null) {
            dos.writeChars(ans);
            dos.writeChar('\n') ;        	
        }
        dos.writeChars(str2);
        dos.writeChar('\n') ;
        dos.close() ;    // 关闭输出流
	}
	public static String show_ifo(String str) throws Exception
	{
		DataInputStream dis = null ;        // 声明数据输入流对象
		File f = new File("C:\\Users\\张振勇\\eclipse-workspace\\custome_ifo\\" + str + ".txt") ;        // 实例化File类的对象，给出路径
        dis = new DataInputStream(new FileInputStream(f)) ;    // 实例化数据输入流对象
        String name = null ;    // 接收名称
        char temp[] = null ;    // 接收商品名称
        int len = 0 ;    // 保存读取数据的个数
        char c = 0;
        String ans = new String("");
        try{
            while(true){
       
                temp = new char[200] ;    // 开辟空间
                len = 0 ;
                while((c=dis.readChar())!='\n'){    // 接收内容，因为直到读取到'\t'才完成了读取一个字符串，未读取到表示还有内容。
                	
                    temp[len] = c ;
                    len ++ ;    // 读取长度加1
                    
                }
                name = new String(temp,0,len) ;    // 将字符数组变为String
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
