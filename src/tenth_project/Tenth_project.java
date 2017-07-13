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
    class Animal
    {
        String animalName;
        int animalSpeed;
        int animalWeight;
    
    Animal()
    {
        animalName = "Lion";
        animalSpeed = 20;
        animalWeight = 450;
    }
    Animal (String _animalName, int _animalSpeed, int _animalWeigth)
    {
        this.animalName = _animalName;
        this.animalSpeed = _animalSpeed;
        this.animalWeight = _animalWeigth;
    }
    void Print()
        {
            System.out.print(this.animalName + " ");
            System.out.print(this.animalSpeed + " " );
            System.out.print(this.animalWeight + "\n");
        }
    }



class Student
    {
        String studentName;
        int studentAge;
        boolean studentSex;

    Student() //дефолтный конструктор экземпляра класса
    {
        studentName = "Nick";
        studentAge = 20;
        studentSex = false;
    }
     Student(String studentName, int age, boolean sex) //конструктор класса
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
        /*Student st = new Student();
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
        for (int i = 0; i < students.length; i++) 
        {
            String name;
            int age;
            boolean sex;
            students[i] = new Student();
        }
        students[0] = new Student("John", 50, true);
        students[1] = new Student(); //значение конструктора по умолчанию
        for (int i = 0; i < students.length; i++)
        {
            students[i].Print();
            System.out.println(students[i].studentName);
        }*/
     
        Animal animals[] = new Animal[5];
        animals[0] = new Animal();
        animals[1] = new Animal("Wolf", 20, 40);
        animals[2] = new Animal("Fox", 25, 10);
        animals[3] = new Animal("Hedgehog", 5, 1);
        animals[4] = new Animal("Rabbit",4 ,1);
        for (int i = 0; i < animals.length; i++)
        {
            animals[i].Print();
        }
    }
    
}
