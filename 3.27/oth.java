import java.util.Scanner;

public class oth{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("你想算前几项的和？");
		int times=input.nextInt();
		int i=1;
		int sum=0;
		while(i<=times){
			sum=sum+i;
			i++;
		}
		System.out.print("前"+times+"的和为："+sum);
		input.close();
	}
}