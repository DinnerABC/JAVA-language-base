package Student;

public class StudentDemo {

	public static void main(String[] args) {
		StudentDefine stuOne=new StudentDefine();
		
		//stuOne.name="С��";
		//stuOne.department="�����ϵ";
		//stuOne.age=18;
		stuOne.setName("С��");
		stuOne.setDepartment("���ϵ");
		stuOne.setAge(18);
		stuOne.introduce();
		stuOne.haveClass("�ߵ���ѧ");
		
		StudentDefine stuTwo=new StudentDefine("С��","�����ϵ",27);
		stuTwo.introduce();
		stuTwo.haveClass("���Դ���");
	}

}
