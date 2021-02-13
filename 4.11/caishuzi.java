import java.util.Scanner;
import java.util.Random;

public class caishuzi{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random random=new Random();

		int Randnumber=1;
		int guess;
		int count=0;
		Randnumber=random.nextInt(100)+1;

		do{
			System.out.println("请输入你猜的数：");
			guess=input.nextInt();
			if(guess>Randnumber){
				System.out.println("你猜的数太大了，继续猜吧！");
				}
			else if(guess<Randnumber){
				System.out.println("你猜的数太小了，继续猜吧！");
			}
			count++;
		}while(guess!=Randnumber);
		switch(Randnumber){
			case 1:
				System.out.println("快来看，上帝……");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("这么快就猜对了，你很聪明啊！");
				break;
			default:
				System.out.println("猜了半天才猜出来，小同志，尚需努力啊");
				break;
		}
	}
}