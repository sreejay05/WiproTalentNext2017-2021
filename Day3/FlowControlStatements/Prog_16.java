public class Prog_16 { 
public static void main(String[] args) { 
	int n = Integer.parseInt(args[0]);
	if(args.length==0){
		System.out.println("Please enter an integer number");}
	else{
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.println("*");}
			System.out.println();
		}
	}
	
       }
}
