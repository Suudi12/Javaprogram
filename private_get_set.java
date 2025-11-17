public class hasshi {
    public static void main(String[] args) {
   //craerte object>objec

example1s s1=new example1s();
//qiimo
s1.setall(10,"suuid");
        System.out.printf(s1.getName()+s1.getage());
        System.out.printf("\n");
        s1.disply();
    }
}
class example1s {
    //datefeild
    private  int age;
    private String name;
//get mthod//return
    public  int getage(){
        return age;

    }
    //getname
    public String getName(){
        return name;
    }
    //set
    void setall(int age,String name ){
        this.age=age;
        this.name=name;
    }


    void disply(){
        System.out.printf( name+" "+age);

    }
}


///classname()
