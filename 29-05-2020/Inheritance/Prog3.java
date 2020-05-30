public class Person {
	private String name;
	public Person(String n)
	{
		name=n;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return name;
	}
}

public class Student extends Person {
	private int myIdNum;
	public Student1(String name, int idNum) {
		super(name);
		myIdNum = idNum;
	}
	public int getIdNum(){
		return myIdNum;
	}
	public void setIdNum(int idNum){
		myIdNum = idNum;
	}
	public String toString(){
		return super.toString() + ", student id: " + myIdNum ;
	}

}

public class CollegeStudent extends Student{
	private int yr;
	private String m;
	public CollegeStudent(String n, int id,int year,String major) {
		super(n,id);
		yr=year;
		m=major;
	}
	public int getYr(){
		return yr;
	}
	public void setYr(int year){
		yr = year;
	}
	public String getM()
	{
		return m;
	}
	public void setM(String major)

	{
		m=major;
	}
	public String toString(){
		return super.toString() + ", student id: " + super.toString()+", year:"+yr+", major:"+m;
	}
}

public class Prog3{
    public static void main(String[]args){
        Person p= new Person("John");
        Student1 s=new Student1("Jason",7005);
        Teacher t = new Teacher("Cerena",35000,"Chemistry");
        CollegeStudent cs = new CollegeStudent("Olivya",7020,3,"CSE");
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        System.out.println(cs);
    }
}
