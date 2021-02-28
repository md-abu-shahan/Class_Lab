
package pkg9th;

import java.io.File;

public class Main {
  
        public Main(){
            File f = new File ("D:\\");
            File[] files =f.listFiles();
            for(int i=0;i<files.length;i++){
                File file = files[i];
                String name = file.getName();
               //sir  
                System.out.println(name);
                //pic
                if(name.endsWith(".jpg")){
                    System.out.println(name);
                }
                //hidden
                if(file.isHidden()){
                    System.out.println(name);
                }
            }
        }
  
    public static void main(String[] args) {
        Main s = new Main();
        
    }
}