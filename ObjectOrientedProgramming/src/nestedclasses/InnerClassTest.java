package nestedclasses;

import nestedclasses.Users.InnerUser;

public class InnerClassTest {

	public static void main(String[] args) {

		Users outer = new Users();
		InnerUser inner = outer.new InnerUser();
		
		inner.show();
		
	}

}
