package weiyangdongwu;

public class Feeder {
	private String name;
	public Feeder(String name){
		this.name=name;
	}
	public void feed(Cat cat,Fish fish){
		cat.eat(fish);
		System.out.println("����Ա"+name+"����"+fish.getWeight()+"��"+fish+"ι��"+cat+"��");
	}
	public void feed(Dog dog,Bone bone){
		dog.eat(bone);
		System.out.println("����Ա"+name+"����"+bone.getWeight()+"��"+bone+"ι��"+dog+"��");

	}
}
