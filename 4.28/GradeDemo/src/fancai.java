import java.util.Scanner;

public class fancai {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a=new int[20];
		int yi=0;int er=0;int san=0;int si=0; int wu=0;
		for(int i=0;i<20;i++){
			System.out.print("���"+(i+1)+"��ѧ�����з������ۣ�");
			a[i]=input.nextInt();
		}
		
		for(int k=0;k<20;k++){
			switch (a[k]){
				case 1:
					yi++;
					break;
				case 2:
					er++;
					break;
				case 3:
					san++;
					break;
				case 4:
					si++;
					break;
				case 5:
					wu++;
					break;
			}
		}
		

		System.out.println("��ֵ                ѧ����");
		System.out.println(" 1         "+yi);
		System.out.println(" 2         "+er);
		System.out.println(" 3         "+san);
		System.out.println(" 4         "+si);
		System.out.println(" 5         "+wu);
        
		input.close();
	}

}