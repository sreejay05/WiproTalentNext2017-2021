//5.Initialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s 
//a number then print "Digit" and for other characters print "Special Character"

public class Prog5{
public static void main(String args[])
    {
        char ch='5';
        if(ch>=48 && ch<=57)
        {
            System.out.print("Digit");

        }
        else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("Special Character");

        }
    }
}
