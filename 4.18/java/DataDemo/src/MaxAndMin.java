
import java.util.Scanner;

public class MaxAndMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num[] = new int[5];
		
		for(int i=0;i<num.length;i++){
			System.out.println("请输入第"+(i+1)+"个数：");
			num[i]=input.nextInt();
		}
		
		int max=num[0];
		for(int i=0;i<num.length;i++){
			if(max<num[i]){
				max=num[i];
			}
		}
		
		int min=num[0];
		for(int i=0;i<num.length;i++){
			if(min>num[i]){
				min=num[i];
			}
		}
		
		System.out.println("最大值是："+max);
		System.out.print("最小值是："+min);
		input.close();
	}

}
