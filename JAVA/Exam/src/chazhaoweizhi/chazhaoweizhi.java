package chazhaoweizhi;

import java.util.Arrays;
import java.util.Scanner;


public class chazhaoweizhi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������5�����֣�");
		int[] a=new int[5];
		for(int i=0;i<5;i++){
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<5;i++){
			System.out.print(a[i]+"  ");
		}
		
		System.out.print("\n������������ҵ����֣�");
		System.out.println("");
		int b=input.nextInt();
		int po=Arrays.binarySearch(a, b);
		if(po<0){
			System.out.print("û���ҵ������֡�");
		}
		else{
			System.out.print("������λ���ڵ�"+(po+1)+"��λ�á�");
		}
		
		input.close();
	}

}