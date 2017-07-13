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
        
    }
public class Tenth_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student();
        st.studentAge = 42;
        //st.studentName = "Sergey";
        st.studentSex = true;
        System.out.println(st.studentName);
        // TODO code application logic here
    }
    
}
