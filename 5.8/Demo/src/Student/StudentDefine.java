package Student;

public class StudentDefine {
	String name;
	String department;
	int age;
	public String getInfo(){
		return "������"+name+",ϵ��"+department+",����"+age;
	}
	public void introduce(){
		System.out.println(getInfo());
	}
	public void haveClass(String course){
		System.out.println("�������� "+course+" �Σ����ſκ�����˼��");
	}
}
