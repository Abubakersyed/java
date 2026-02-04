class Student 
{
int rollno;
String name;
String branch;
int marks;

void getData(int rollno,String name,String branch,int marks)
{
this.rollno=rollno;
this.name=name;
this.branch=branch;
this.marks=marks;
}
void display()
{
System.out.println("Roll number ="+rollno);
System.out.println("Name ="+name);
System.out.println("Branch ="+branch);
System.out.println("Marks ="+marks);
System.out.println("----------------------");
}

public static void main(String[] args) 
{
Student s1=new Student();
Student s2=new Student();
s1.getData(1,"Motu","CSE",99);
s2.getData(2,"Patlu","CSE",100);
s1.display();
s2.display();
}
}
