package Student;

public class StudentDemo {

	public static void main(String[] args) {
		StudentDefine stuone=new StudentDefine();
		stuone.name="С��";
		stuone.department="�����ϵ";
		stuone.age=18;
		stuone.introduce();
		stuone.haveClass("�ߵ���ѧ");
		
		StudentDefine stutwo=new StudentDefine();
		stutwo.name="С��";
		stutwo.department="�����ϵ";
		stutwo.age=28;
		stutwo.introduce();
		stutwo.haveClass("���Դ���");
	}

}
