
package javaapplication3;

import java.io.BufferedReader;
import java.io.FileReader;

public class one {
    
    
    public static void main(String[] args) {
       String p="C:\\Users\\AHN ASS\\Desktop\\code.txt";
       String ss="";
       try{
           FileReader f= new FileReader(p);
           BufferedReader br= new BufferedReader(f);
           
           while(true){
               
               String s = br.readLine();
               if(s==null){
                   break;
               }
               if(s.equals("Programmer")){
                   ss+=s;
                   break;
               }
               ss +=s+"=";
               
           }
           System.out.println(ss);
       }catch(Exception e){
           System.out.println(e);
       }
        
    }

    
}

