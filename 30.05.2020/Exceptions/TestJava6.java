import java.lang.*;
import java.util.Scanner;
public class TestJava6{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		for(int i=0;i<1;i++){
			float avg;
			String name=s.next();
			String s1=s.next();String s2=s.next();String s3=s.next();
			try{
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n3=Integer.parseInt(s3);
				if (n1 < 0 || n2<0 || n3<0) throw new NegativeValException();
				if (n1 > 100 || n2>100 || n3>100) throw new OutOfRangeException();
				avg = (n1+n2+n3)/3;
				System.out.println("Name:"+name+"\nAverage:"+avg);
			}
			catch (NumberFormatException e){
				System.out.println(e);
			}
			catch (NegativeValException e) {
				System.out.println(e.getMessage());
			} catch (OutOfRangeException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
