package Tutorial5;

public class T5Q6 {
	public static void main(String[] args) {
		int randomNum = (int)(Math.random() * 256);
		String[] arr = Integer.toBinaryString(randomNum).split("");
		System.out.println("Random number generated = " + randomNum);
		for(String n : arr)
			System.out.print(n);
	}
}
