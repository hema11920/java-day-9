import java.util.*;
public class countchararrayforsmalllet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //for capital letters
        String a="devara";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[(int)(a.charAt(i))-97]++;
        }
        System.out.println(Arrays.toString(c));
    }
}