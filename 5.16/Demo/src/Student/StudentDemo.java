package Student;

public class StudentDemo {

	public static void main(String[] args) {
		StudentDefine stuOne=new StudentDefine();
		
		//stuOne.name="小明";
		//stuOne.department="计算机系";
		//stuOne.age=18;
		stuOne.setName("小明");
		stuOne.setDepartment("会计系");
		stuOne.setAge(18);
		stuOne.introduce();
		stuOne.haveClass("高等数学");
		
		StudentDefine stuTwo=new StudentDefine("小刚","计算机系",27);
		stuTwo.introduce();
		stuTwo.haveClass("线性代数");
	}

}
