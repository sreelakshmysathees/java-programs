import java.util.*;
public class StringOperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(&quot;\nEnter your name : &quot;);
        String str=sc.nextLine();
        System.out.print(&quot;\nEntered name is : &quot;+str+&quot;\n&quot;);
        System.out.print(&quot;\nLength of the inputted string is :
&quot;+str.length()+&quot;\n&quot;);
        String s1=&quot;Hello &quot;;
        String s2=s1.concat(str);
        System.out.print(&quot;\nAfter concatination the string is :
&quot;+s2+&quot;\n&quot;);
        String s3=&quot;Java&quot;;
        String restr=str.replace(str,s3);
        System.out.print(&quot;\nReplaced the string &quot;+str+&quot;
to &quot;+restr+&quot;\n&quot;);
        String s4=s1.concat(restr);
        System.out.print(&quot;\nAfter replace the string is :
&quot;+s4+&quot;\n&quot;);
    }
}

	
