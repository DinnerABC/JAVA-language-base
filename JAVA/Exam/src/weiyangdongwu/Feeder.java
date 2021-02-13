package weiyangdongwu;

public class Feeder {
	private String name;
	public Feeder(String name){
		this.name=name;
	}
	public void feed(Cat cat,Fish fish){
		cat.eat(fish);
		System.out.println("饲养员"+name+"拿着"+fish.getWeight()+"克"+fish+"喂养"+cat+"。");
	}
	public void feed(Dog dog,Bone bone){
		dog.eat(bone);
		System.out.println("饲养员"+name+"拿着"+bone.getWeight()+"克"+bone+"喂养"+dog+"。");

	}
}
