
package pkg11th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<String> list=new ArrayList();
        
        list.add("shahan");
        list.add("shah");
        list.add("kinh");
        list.add("Boss");
        
        Collections.sort(list);
//        System.out.println(list);
        
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            
            System.out.println(s);
        }
    }
    
}
