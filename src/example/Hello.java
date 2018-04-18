package example;
import com.amazonaws.services.lambda.runtime.Context;

public class Hello {

	public String handleRequest(MyClass myclass, Context context) {

//		try {
//			Thread.sleep(30000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
        return myclass.getName();
	}
}