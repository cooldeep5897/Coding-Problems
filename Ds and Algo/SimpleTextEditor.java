import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        List<String> s1=new ArrayList();
        for(int i=0;i<n;i++){
           int op = scan.nextInt();
            if(op==1){
                String str=scan.nextLine();
                str=str.trim();
                if(i!=0){
                 String last =s1.get(s1.size()-1);  
                    last=last+str;
                    s1.add(last);
                }else{
                    s1.add(str);
                }
            }
            else if(op==2){
                int del=scan.nextInt();
                 String last =s1.get(s1.size()-1);  
                    int rem=last.length()-del;
                String put1=last.substring(0,rem);
                
                s1.add(put1);
            }
            else if(op==3){
                int print=scan.nextInt();
                String last =s1.get(s1.size()-1);
                System.out.println(last.charAt(print-1));
            }
            else if(op==4){
                System.out.println(s1);
                s1.remove(s1.size()-1);
                System.out.println(s1);
            }
            
        }
    
    }
}
