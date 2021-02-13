import java.util.Scanner;

public class brea{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++){
			if(i==3){
				continue;
			}
			sum+=i;
		}
		System.out.print("sum="+sum);
	}
}