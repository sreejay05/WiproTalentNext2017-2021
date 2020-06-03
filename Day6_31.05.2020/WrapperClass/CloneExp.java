class Employee implements Cloneable
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
public class CloneExp{
	public static void main(String[] args) {
			try{
			Employee e=new Employee(1000,"sreejay");
			Employee e2=(Employee)e.clone();
			e.id=2000;
			e.name="jayasree";
			System.out.println("object1:\nid="+e.id+"\nname="+e.name);
			System.out.println("\nobject2 \nid=:"+e2.id+"\nname="+e2.name);
		}
	catch(CloneNotSupportedException e){}
	}
}