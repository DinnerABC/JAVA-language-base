import java.util.Random;
import java.util.Scanner;

public class answer{
	public static void main(String[] args){
		Random random=new Random();
		Scanner input=new Scanner(System.in);
		int num1,num2,judge,answer,daan,conti;
		
		
		do{
			num1=random.nextInt(9)+1;
			num2=random.nextInt(9)+1;
			answer=num1*num2;

			do{
				System.out.print(num1+"*"+num2+"=");
				daan=input.nextInt();
				if(daan==answer){
					System.out.println("你真棒！");
					judge=1;
				}
				else{
					System.out.println("答错了！在动动你的小脑筋试试吧！");
					judge=0;
				}
			}while(judge==0);
			System.out.print("你想继续做题吗？(1继续，2退出)");
			conti=input.nextInt();
		}while(conti==1);
		input.close();
	}
}