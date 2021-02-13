import java.util.Scanner;

public class tall{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double father,mather,child;
		int sex;
		System.out.print("请输入父亲的身高：");
		father=input.nextDouble();
		System.out.print("请输入母亲的身高：");
		mather=input.nextDouble();
		System.out.print("请输入孩子的性别(0为男孩，1为女孩)：");
		sex=input.nextInt();
		if(sex==0)
			child=(father+mather)*1.08/2;
		else
			child=(father*0.923+mather)/2;
		System.out.print("孩子的身高是："+child);
		input.close();
	}
}