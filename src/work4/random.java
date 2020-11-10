package work4;
import java.util.Random;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random(1000);
		for (int i=0;i<50;i++) {
			System.out.print(random.nextInt(100)+" ");
		}
	}

}
