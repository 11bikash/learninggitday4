
public class ExceptionPropagationDemo {
	void training() {
		String course =null;
		System.out.println(course.length());
	}
  void participant1() {
	  this.training();
  }
  void Trainer() {
	  try {
		  participant1();
	  }
	  catch(Exception e) {
		  System.out.println("Exception Handled");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagationDemo exc=new ExceptionPropagationDemo();
		exc.Trainer();

	}

}
