package chazhaoweizhi;

import java.util.Arrays;
import java.util.Scanner;


public class chazhaoweizhi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入5个数字：");
		int[] a=new int[5];
		for(int i=0;i<5;i++){
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<5;i++){
			System.out.print(a[i]+"  ");
		}
		
		System.out.print("\n请输入你想查找的数字：");
		System.out.println("");
		int b=input.nextInt();
		int po=Arrays.binarySearch(a, b);
		if(po<0){
			System.out.print("没有找到此数字。");
		}
		else{
			System.out.print("此数字位置在第"+(po+1)+"个位置。");
		}
		
		input.close();
	}

}
