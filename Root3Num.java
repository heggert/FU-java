package root;

import java.lang.Math;

public class Root3Num {
	
	public final int a,b;
	
	public Root3Num(){
		a = 0;
		b = 0;
	}
	
	public Root3Num(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public Root3Num add(Root3Num x){
		return new Root3Num(a + x.a, b + x.b);		
	}
	public Root3Num sub(Root3Num x){
		return new Root3Num(a - x.a, b -x.b);
	}
	
	public Root3Num mul(Root3Num x){
		return new Root3Num(a*x.a+b*x.b,a*x.b+b*x.a);	
	}
	
	public Root3Num times(int n){
		return new Root3Num(n*a,n*b);
	}
		
	public double value(){
		
	}
	/*public static Root3Num add(Root3Num x, Root3Num y){
		
	}
	public static Root3Num sud(Root3Num x, Root3Num y){
		
	}
	public static Root3Num mul(Root3Num x, Root3Num y){
		
	}
	public static Root3Num times(int n, Root3Num x){		
	}*/
	
	
}
