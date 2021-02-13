import java.util.Scanner;

public class Order{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个订单标识：");
		int Order=input.nextInt();
		System.out.print("此订单的状态为："+getOrder(Order));
		input.close();
	}
	public static String getOrder(int Order){
		String str="";
		switch(Order){
			case 10:
				str="新订单，未付款。";
				break;
			case 20:
				str="已付款，未发货。";
				break;
			case 30:
				str="已发货，未收获。";
				break;
			case 40:
				str="已收货，为评价。";
				break;
			case 0:
				str="订单取消。";
				break;
			default:
				str="编号错误，请重新输入！";
				break;
		}
		return str;
	}
}