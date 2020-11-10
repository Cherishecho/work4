package work4;
import java.util.GregorianCalendar;
public class riqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar tmp=new GregorianCalendar();
		System.out.printf("%d %d %d\n",tmp.get(GregorianCalendar.YEAR),tmp.get(GregorianCalendar.MONTH),tmp.get(GregorianCalendar.DAY_OF_MONTH));
		tmp.setTimeInMillis(1234567898765L);
		System.out.printf("%d %d %d\n",tmp.get(GregorianCalendar.YEAR),tmp.get(GregorianCalendar.MONTH),tmp.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
