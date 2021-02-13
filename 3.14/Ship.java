import java.util.Scanner;
public class Ship{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int outland,head,able,i=0;
		double weight,rate;
		String str1="",str2="",str3="";

		System.out.print("请输入你的行李重量：");
		weight=input.nextDouble();
		
		if(weight<=40){
			rate=0;
			i=1;
		}
		else{
			System.out.print("你是否是头等舱客户（1为是，0为否）：");
			head=input.nextInt();
			System.out.print("你是否是外国人（1为是，0为否）：");
			outland=input.nextInt();
			System.out.print("你是否是残疾人（1为是，0为否）：");
			able=input.nextInt();

			if(head==1){	//头等舱
				str1="头等舱客户";
				if(outland==0){		//中国人
					str2="国内客户";
					if(able==0){	//正常人
						str3="正常乘客";
						rate=(weight-40)*3;
					}
					else{	//残疾人
						str3="残疾乘客";
						rate=((weight-40)*3)/2;
					}
				}
				else{	//外国人
					str2="国外乘客";
					if(able==0){ // 正常人
						str3="正常乘客";
						rate=(weight-40)*6;
					}
					else{	//残疾人
						str3="残疾乘客";
						rate=((weight-40)*6)/2;
					}
				}
			}
			else{	//普通舱
				str1="头等舱客户";
				if(outland==0){		//中国人
					str2="国内客户";
					if(able==0){	// 正常人
						str3="正常乘客";
						rate=(weight-40)*5;
					}
					else{	//残疾人
						str3="残疾乘客";
						rate=((weight-40)*5)/2;
					}
				}
				else{	//外国人
					str2="国外乘客";
					if(able==0){	// 正常人
						str3="正常乘客";
						rate=(weight-40)*10;
					}
					else{	//残疾人
						str3="残疾乘客";
						rate=((weight-40)*10)/2;
					}
				}
			}
		}
		if(i!=1){	
			System.out.println("请确认你的信息： "+str1+" "+str2+" "+str3+ "。");
		}
		System.out.print("托运行李需要的价格为："+rate+"元");
	}
}
