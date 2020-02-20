package stack;

/*package whatever //do not write package name here */

import java.util.*;
        import java.lang.*;
        import java.io.*;

public class parenthesischecker{
    public static void main (String[] args) {
        //code
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt (sc.nextLine());
        String str;
        for(int i=0;i<n;i++){
            LinkedList<Character> ll=new LinkedList<>();
            str=sc.nextLine();
            if(check(str,str.length(),ll))
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }
    public static boolean check(String str,int len,LinkedList<Character>ll)
    {
        int i=0;
        while(i<len)
        {
            char c=str.charAt(i++);
            if(c==')')
            {   if(ll.peek()==null)
                return false;
                if(!match(c,ll.peek()))
                    return false;
                ll.pop();
                continue;
            }
            if(c=='}')
            {
                if(ll.peek()==null)
                    return false;
                if(!match(c,ll.peek()))
                    return false;
                ll.pop();
                continue;
            }
            if(c==']')
            {
                if(ll.peek()==null)
                    return false;
                if(!match(c,ll.peek()))
                    return false;
                ll.pop();
                continue;
            }

            ll.push(c);

        }

        if(ll.size()!=0)
            return false;
        return true;


    }

    public static boolean match(char c,char p)
    {
        if(c==')' && p!='(')
            return false;
        if(c=='}'&&p!='{')
            return false;
        if(c==']'&&p!='[')
            return false;
        return true;

    }
}