import java.io.*;
import java.util.*;
interface Department
{
String deptName="Nuclear Research",deptHead="Pranav Mukherjee";
public void dname();
public void dhead();
}
class Hostel
{
protected String hostelName,hostelLocation;
protected int numberOfRooms;
public Hostel(String hostelName,String hostelLocation,int numberOfRooms)
{
this.hostelName=hostelName;
this.hostelLocation=hostelLocation;
this.numberOfRooms=numberOfRooms;
}
}
class Student extends Hostel implements Department
{
private String studentName,electiveSubject;
private int regdNo,avgMarks;
public Student(String hostelName,String hostelLocation,int numberOfRooms,String studentName,String electiveSubject,int regdNo,int avgMarks)
{
super(hostelName,hostelLocation,numberOfRooms);
this.studentName=studentName;
this.electiveSubject=electiveSubject;
this.regdNo=regdNo;
this.avgMarks=avgMarks;
}
public void dname()
{
System.out.println("Department name = "+deptName);
}
public void dhead()
{
System.out.println("Department head = "+deptHead);
}
public void show()
{
System.out.println("hostel name = "+hostelName);
System.out.println("hostel location = "+hostelLocation);
System.out.println("number of rooms = "+numberOfRooms);
System.out.println("Student name = "+studentName);
System.out.println("elective Sublect = "+electiveSubject);
System.out.println("registration number = "+regdNo);
System.out.println("average marks = "+avgMarks);
}
}
class studentTest
{
public static void main(String args[])
{
Student ob=new Student("Gryfindor","kolkata",50,"Abhishek kumar","Nuclear fission",120,86);
ob.dname();
ob.dhead();
ob.show();
}
}