
public class Demo {

	public static void main(String[] args) {
		int []b = new int [5];
		int j=0;
		for(int i=0;i<5;i++){
			j+=2;
			b[i]=j;
			System.out.println("����Ľ���ǣ�"+b[i]);
		}
		for(int i=0;i<5;i++){
			System.out.println("����Ľ���ǣ�"+b[i]);
		}
	}

}