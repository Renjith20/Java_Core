class Student{
    int roll_no ;
    String name ;
    int marks;
}


public class ArrayofObjects {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "Marsh";
        s1.marks = 90;

        Student s2 = new Student();
        s2.roll_no = 1;
        s2.name = "Smith";
        s2.marks = 67;

        Student s3 = new Student();
        s3.roll_no = 1;
        s3.name = "Aiden";
        s3.marks = 78;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i = 0 ; i < student.length ; i++){
            System.out.println(student[i].name + " : " + student[i].marks );
        }
    }
}
