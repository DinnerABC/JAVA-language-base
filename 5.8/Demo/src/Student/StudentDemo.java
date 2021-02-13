package Student;

public class StudentDemo {

	public static void main(String[] args) {
		StudentDefine stuone=new StudentDefine();
		stuone.name="小明";
		stuone.department="计算机系";
		stuone.age=18;
		stuone.introduce();
		stuone.haveClass("高等数学");
		
		StudentDefine stutwo=new StudentDefine();
		stutwo.name="小刚";
		stutwo.department="计算机系";
		stutwo.age=28;
		stutwo.introduce();
		stutwo.haveClass("线性代数");
	}

}
