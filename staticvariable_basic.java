public class example {
    public static void main(String[] args) {
  //step1 inix=zalation datafeild using refene
        //reference object
  student s1=new student();
 s1.display();
        System.out.printf("\n");
//        student.changev("simad");
 student s2=new student("farxan",23);
 s2.display();
        System.out.printf("\n");
        student.changev("simad",10);
        student s3=new student("daahir",23);

        s3.display();

        System.out.printf("\n");
        student s4=new student("dadir",23);
        s4.display();
        System.out.printf("\n");
        student s5=new student("xasan",23);
        s5.display();


    }
}
class student{
    int studentid;
    String studentname;
    int age;
    static String university="just";
    static int nid=1;
    student(){
        studentname="khalid";

        studentid=nid;
        nid++;
        age=90;
    }
    //chnage university
    public static void changev(String nuniversity,int id){
        nid=id;
        nid--;
        university=nuniversity;
    }
    //paramatrize
    student(String nname,int nage){
        studentid=nid;
        nid--;
        studentname=nname;
        age=nage;

    }
    //display
    void display(){
        System.out.printf("id:"+studentid+" "+ "name:"+studentname+" "+"age:"+age+" "+"university"+university);
    }
}
