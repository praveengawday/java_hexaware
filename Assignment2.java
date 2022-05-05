import java.util.*;

class Emp 
{
	String ID,name,designation;
	int age,salary;
	Emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ID:");
		ID=sc.next();
		System.out.print("Name:");
		name=sc.next();
		System.out.print("Age:");
		age=sc.nextInt();
	}
	public void display()
	{
		System.out.println("\nID:"+ID+" ,Name:"+name+" ,Age:"+age+" ,Salary:"+salary+" ,Designation:"+designation);
	}
	public void increment()
	{
		salary+=5000;
		display();
	}
}
final class Clerk extends Emp
{
	public Clerk()
	{
		salary=15000;
		designation="Clerk";
	} 
}
final class Developer extends Emp
{
	public Developer()
	{
		salary=25000;
		designation="Dev";
	} 
}
final class Tester extends Emp
{
	public Tester()
	{
		salary=20000;
		designation="Tester";
	} 
}
final class Manager extends Emp
{
	public Manager()
	{
		salary=50000;
		designation="Mamager";
	} 
}

public class Assignment2
{
	public static void main(String args[])
	{
		int option1=0,option2=0;
		Clerk c=null;Developer d=null;Tester t=null;Manager m=null;
		do
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("------------------------------------------------------------------");
			System.out.println("Enter the option:\n1)Create\n2)Display\n3)Increment\n4)Exit");
			System.out.println("------------------------------------------------------------------");
			option1=sc.nextInt();
			switch (option1)
			{
				case 1:
					//Emp e=new Emp();
					do
					{
						System.out.println("------------------------------------------------------------------");
						System.out.println("Enter the option:\n1)Clerk\n2)Developer\n3)Tester\n4)Manager\n5)Exit");
						System.out.println("------------------------------------------------------------------");
						option2=sc.nextInt();
						switch (option2)
						{
							case 1:
								System.out.println("\nClerk:");	
								c=new Clerk();
								break;
							case 2:
								System.out.println("\nDeveloper:");
								d=new Developer();
								break;
							case 3:
								System.out.println("\nTester:");
								t=new Tester();
								break;
							case 4:
								System.out.println("\nManager:");
								m=new Manager();
								break;
							case 5:
								
								break;
							default:
								System.out.println(option2);
						}
					}while(option2!=5);
					break;
				case 2:
					c.display();
					d.display();
					t.display();
					m.display();
				case 3:
					c.increment();
					d.increment();
					t.increment();
					m.increment();
				case 4:
					break;
				default:
					System.out.println(option1);
			}	
		}while(option1!=4);
		
	}
}