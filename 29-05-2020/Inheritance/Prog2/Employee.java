public class Employee extends Person {
	private double salary;
	private int yr;
	private int insuranceNo;
	public Employee(String n,double a, int y, int i)
	{
		super(n);
		salary=a;
		yr=y; insuranceNo=i;
	}
	public void
	setSalary(double a)
	{
		salary=a;
	}
	public void setYear(int y)
	{
		yr=y;
	}
	public void setInsurance_no(int i)
	{
		insuranceNo=i;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getYear()
	{
		return yr;
	}
	public int getInsurance_no()
	{
		return insuranceNo;
	}
	public String toString()
	{
		return super.toString()+" "+salary+" "+yr+" "+insuranceNo;
	}
}
