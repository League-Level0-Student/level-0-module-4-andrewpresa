import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random randy = new Random();
		int x = randy.nextInt(51);
		int y = randy.nextInt(251);
		int z = randy.nextInt(126)+25;
		int w = randy.nextInt(326)+137;
		int v = randy.nextInt(1000);
		System.out.println("The numbers are " +x+" "+y+" "+z+" "+w+" "+v+" ");
		
	}

}
