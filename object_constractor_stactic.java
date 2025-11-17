public class hasshi {
    public static void main(String[] args) {
   //craerte object>objec
        example1s s1=new example1s(30,"geedi");
        s1.disply();
//  s
        System.out.printf("  \n");
        //
        example1s s2=new example1s(10,"xaashi");
    s2.disply();
        System.out.printf("\n");
        //
        example1s s3=new example1s(90,"farax");
        s3.disply();
        System.out.printf("\n");


        example1s.change("just",20);
        example1s s4=new example1s(100,"jamac");
        example1s s5=new example1s(3,"kaltuumo");
        example1s s6=new example1s(2,"shukri");
        s4.disply();
        System.out.printf("\n");

        s5.disply();
        System.out.printf("\n");
        s6.disply();


    }
}
class example1s {
    //datefeild
    int age;
    String name;
    static  String university="simad";
    int id;
    static  int userid=0;
    //pramataconsta
    example1s(int nage,String nname){
        age=nage;
        name=nname;

        userid++;
        id=userid;

    }
    //sta
    static void change(String chnageu,int nid){
        university=chnageu;
        userid++;
        userid=nid;


    }
    void disply(){
        System.out.printf(id+" "+ name+" "+age+" "+university);

    }
}


///classname()
