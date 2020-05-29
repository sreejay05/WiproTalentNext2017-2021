class PatientPrgm
{
    String name;
    double w,h;
    Patient(double weight,double height)
    {
     w=weight;
     h=height;
    }
    double bmi()
    {
        double b = (w/(h*h))*703;
        return b;
    }
}
public class Patients{
    public static void main(String[] args)
    {
        Patient p=new Patient(65,15);
        System.out.println("The BMI of the patient is " + p.bmi());
    }
}
