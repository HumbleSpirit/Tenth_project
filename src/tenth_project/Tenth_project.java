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
        st.Print(20);
        st.Print();
        Student st1 = new Student();
        st.studentAge = 43;
        st.studentName = "Gennady";
        st.studentSex = true;
        st.Print();
        st.Print(20);
        //System.out.println(st.studentAge + " "+ st.studentName); // конкатенация c bool невозможна
        
    }
    
}
