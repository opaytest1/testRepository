package testRepository;

public class TestClass3 {
	public static void main(String[] args) {
		String s = "This is a cool number 12345";
		
		int sum=0;
		char[] cArray = s.replaceAll("\\D", "").toCharArray();
		System.out.println(cArray);
		for(Character c: cArray){
			int digit = c-'0';
			System.out.println(digit);
			sum = sum+digit;
		}
		System.out.println(sum);
	}
}
