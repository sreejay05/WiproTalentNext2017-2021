import java.util.Scanner;
public class Prog_13 { 
public static void main(String[] args) { 
	int f; 
	for(int n=10;n<100;n++){
	    f=0;
    	for(int i=2;i<=n/2;i++) { 
    		if(n%i==0) {
    			f=1;
    			break;
    		}		
    	}
    	if(f==0) 
	    	System.out.println(n);
	}
	}
}
