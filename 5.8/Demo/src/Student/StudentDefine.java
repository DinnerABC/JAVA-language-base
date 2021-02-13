package Student;

public class StudentDefine {
	String name;
	String department;
	int age;
	public String getInfo(){
		return "姓名："+name+",系别"+department+",年龄"+age;
	}
	public void introduce(){
		System.out.println(getInfo());
	}
	public void haveClass(String course){
		System.out.println("我正在上 "+course+" 课，这门课很有意思！");
	}
}
