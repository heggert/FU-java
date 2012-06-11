package root;

import java.io.*;

public class Main {
	public static void main(String [] args){
		Root3Num root1 = new Root3Num(3,2);	
		Root3Num root2 = new Root3Num(1,1);
		Root3Num root3 = root1.mul(root2);
		
		System.out.printf("(%d+%d*sqrt(3))+(%d+%d*sqrt(3))=(%d+%d*sqrt(3))", root1.a ,root1.b ,root2.a,root2.b,root3.a,root3.b);
	}

}
