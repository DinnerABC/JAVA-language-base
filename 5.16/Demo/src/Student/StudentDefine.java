package Student;

public class StudentDefine {
	private String name;
	private String department;
	private int age;
	
	public StudentDefine() {
		// TODO Auto-generated constructor stub
	}
	public StudentDefine(String name, String department, int age){
		this.name=name;
		this.department=department;
		this.age=age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int getAge() {
		return age;
	}
	public String getInfo(){
		return "姓名："+name+",系别："+department+",年龄："+age;
	}
	public void introduce(){
		System.out.println(getInfo());
	}
	public void haveClass(String course){
		System.out.println("正在上 "+course+" 课，这门课很有意思！");
	}
}
