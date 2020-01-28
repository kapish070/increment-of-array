import java.util.*;
public class addnolast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int b=0;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		a[a.length-1]+=1;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

}
