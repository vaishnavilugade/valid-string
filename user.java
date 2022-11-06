import java.util.*;
public class user
{
 	public static void main(String[] args)
 	{
        Scanner sc=new Scanner(System.in);		
        String str;
		System.out.println("Enter the string:");
		str=sc.nextLine();
        int count1=0,count2=0;
        for(int i=0;i< str.length();i++)
    	{
            if(str.charAt(i)=='*')
        		count1++;
            else if(str.charAt(i)=='#')
         		count2++;
    		}
        if(count1>count2){
			System.out.println("positive integer");
		}
		else if(count1<count2){
			System.out.println("negative integer");
		}
		else{
			System.out.println("valid string");
		}
		
	}
}