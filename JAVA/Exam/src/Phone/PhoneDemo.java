package Phone;

public class PhoneDemo {

	public static void main(String[] args) {
		phone phone1 = new phone();
		phone1.brand="小米";
		phone1.type="小米9";
		phone1.price=3299;
		phone1.os="Android 9";
		phone1.memortSize=128;
				
		phone1.about();
		phone1.call(1);
		phone1.playGame();
		phone1.playMusic("好汉歌");
		System.out.println("***********************");
		
		phone phone2 = new phone("苹果","iphone X","ios 12.3",9999,256);
		phone2.about();
		phone2.call(2);
		phone2.playGame();
		phone2.playMusic("中国龙");
	}
}
