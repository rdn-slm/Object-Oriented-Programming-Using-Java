import java.util.*;

class Student
{
    private String name;
    private String matrix;
    private String major;
    private Course[] courseList;
    private int numOfCourse;

    public Student(String n, String m, String j)
    {
        name = n;
        matrix = m;
        major = j;
        courseList = new Course[10];
    }
    public String getName()
    {
        return name;
    }
    public String getMatrix()
    {
        return matrix;
    }
    public void registerCourse(Course cs)
    {
        courseList[numOfCourse] = cs;
        numOfCourse++;
    }
    public int getNumOfCourse()
    {
        return numOfCourse;
    }
    public void printAllInfo()
    {
        System.out.println("\nSTUDENT NAME : " + name);
        System.out.println("\nNUMBER OF SUBJECT(s) TAKEN : " + numOfCourse );
        System.out.println("\nLIST OF SUBJECT(s) TAKEN : ");
        for (int i= 0; i<numOfCourse; i++)
        {
            Course s =(Course)courseList[i];
            System.out.println((i+1) + ". " +s.getName());
        }
    }
    
}

class Course
{
    private String name;
    private String code;
    private int section;

    public Course(String n, String c, int s)
    {
        name = n;
        code = c;
        section = s;
    }

    public String getName()
    {
        return name;
    }
}

public class TestAssociate {
    public static void main(String args[])
    {
        Course cs1 = new Course("OOP", "SECJ2154J", 3);
        Course cs2 = new Course("PT1", "SECJ1013", 2);
        Course cs3 = new Course("PT2", "SECJ1213", 1);
        Course cs4 = new Course("DSA", "SECJ2103", 6);
        
        Student s1 = new Student("ALI" , "AC1234", "2SCS");
        s1.registerCourse(cs1);
        s1.registerCourse(cs2);
        s1.printAllInfo();
        System.out.println();

        Student s2 = new Student("AHMAD" ,"AC1122", "3SCK");
        s2.registerCourse(cs1);
        s2.registerCourse(cs3);
        s2.registerCourse(cs4);
        s2.printAllInfo();
        System.out.println();
        
        Student s3 = new Student("AIMAN" ,"AC9082", "4LOK");
        s3.registerCourse(cs2);
        s3.registerCourse(cs4);
        s3.printAllInfo();
        System.out.println();
    }
}
