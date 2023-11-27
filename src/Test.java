
public class Test {
	public static void main(String[]args) {
		Robot taro=new Robot();
		taro.name="asimo";
		
		System.out.println(taro.name);
		
		taro.talk();
		taro.walk();
		taro.run();
	}

}
