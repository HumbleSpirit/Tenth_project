/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenth_project;

/**
 *
 * @author Boro_s99
 */
class Student
    {
        String studentName;
        int studentAge;
        boolean studentSex;

    Student() 
    {
        studentName = "Nick";
        studentAge = 20;
        studentSex = false;
    }
     Student(String studentName, int age, boolean sex) 
    {
        this.studentName = studentName;
        this.studentAge = age;
        this.studentSex = sex;
    }
        
        void Print()
        {
            System.out.print(this.studentName + " ");
            System.out.print(this.studentAge + " " );
            System.out.print(this.studentSex + "\n");
        }
        void Print(int age)
        {
            this.studentAge = age;
            System.out.println(this.studentAge);
            
        }
        
    }

public class Tenth_project {

    
    public static void main(String[] args) {
        Student st = new Student();
        st.studentAge = 42;
        st.studentName = "Sergey";
        st.studentSex = true;
        //st.Print(20);
        st.Print();
        
        
        Student st1 = new Student();
        st1.studentAge = 43;
        st1.studentName = "Gennady";
        st1.studentSex = true;
        st1.Print();
        
        
        
        Student st3 = new Student("Nick", 21, false);
        st3.Print();
        //st.Print(20);
        
        //System.out.println(st.studentAge + " "+ st.studentName); // конкатенация c bool невозможна
        
        Student students[] = new Student[2];
        students[0] = new Student("John", 50, true);
        students[1] = new Student();
        for (int i = 0; i < students.length; i++)
        {
            students[i].Print();
            System.out.println(students[i].studentName);
        }
        
    }
    
}
