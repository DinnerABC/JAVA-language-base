package zuidazhizuixiaozhi;


import java.util.Scanner;

public class zuidazhizuixiaozhi1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num[] = new int[10];
		
		System.out.println("������10��������");
		for(int i=0;i<num.length;i++){
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
		
		System.out.println("10���������ֵ�ǣ�"+max);
		System.out.print("10��������Сֵ�ǣ�"+min);
		input.close();
	}

}