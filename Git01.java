
public class Git01 {
	public static void main(String[] args) {
		func01();
		
		Git01 g1 = new Git01();
		int i = g1.func02(3);
		System.out.println(i);
	}
	
	public static void func01(){
		System.out.println("hello git");
	}
	
	public int func02(int i) {
		return i;
	}
}
