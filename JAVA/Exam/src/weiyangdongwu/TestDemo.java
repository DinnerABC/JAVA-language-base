package weiyangdongwu;

public class TestDemo {
	public static void main(String[] args){
		Feeder feeder = new Feeder("уехЩ");
		Dog dog = new Dog();
		Bone bone = new Bone(500);
		feeder.feed(dog,bone);
		feeder.feed(new Cat(),new Fish(3000));
	}
}
