package xueshengpinjunchegnjifushu;
import java.util.Scanner;

public class fushupinjunchegnji {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a=new int[100];
		int count=0,sum=0;
		System.out.println("������ѧ���ɼ�(��������������)");
		for(int i=0;i<=100;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ɼ���");
			a[i]=input.nextInt();
			count++;
			if(a[i]<0){
				break;
			}
		}
		
		for(int k=0;k<count-1;k++){
			sum+=a[k];
		}
		double aver=sum/(count-1);
		System.out.println("ѧ����ƽ���ɼ�Ϊ��"+aver);
		System.out.print("����ƽ���ɼ��ĳɼ�Ϊ��");

		int cou=0;
		for(int j=0;j<count-1;j++){
			if(a[j]>=aver){
				System.out.println("��"+(j+1)+"���ĳɼ�Ϊ��"+a[j]);
				cou++;
			}
		}

		System.out.println("����ƽ���ɼ���ѧ������Ϊ��"+cou);
		input.close();
	}

}