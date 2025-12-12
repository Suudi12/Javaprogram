public class example {
    public static void main(String[] args) {
  //step1 inix=zalation datafeild using refene
        //reference object
  student s1=new student();
  s1.age=10;
  s1.studentid=1;
  s1.studentname="farxiyo";

  s1.display();
        System.out.printf("\n");
  student s2=new student();
  s2.studentname="khadiijo";
  s2.display();
  //
        System.out.printf("\n");
        student s3=new student(90,"xasan",20);
        s3.display();
  //

    }
}
class student{
    int studentid;
    String studentname;
    int age;
    student(){
        studentname="khalid";
        studentid=202;
        age=90;
    }
    //paramatrize
    student(int nid,String nname,int nage){
        studentid=nid;
        studentname=nname;
        age=nage;

    }
    //display
    void display(){
        System.out.printf("id:"+studentid+" "+ "name:"+studentname+" "+"age:"+age);
    }
}
