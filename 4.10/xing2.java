public class xing2{
	public static void main(String[] args){
		for(int k=1;k<=5;k++){
			for(int m=1;m<=6-k;m++){
				System.out.print(" ");
			}
			for(int l=1;l<=k;l++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}