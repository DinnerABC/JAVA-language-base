public class xing3{
	public static void main(String[] args){

		for(int k=1;k<=5;k++){
			for(int m=5;m>=6-k;m--){
				System.out.print(" ");
			}
			for(int l=5;l>=k;l--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}