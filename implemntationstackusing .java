public class last_midterm{
    public static void main(String[] args) {
        stdue s1=new stdue(3);
        s1.push(2);
        s1.push(3);
        s1.push(4);
//        s1.pop();//4
//        s1.pop();//3
//        s1.pop();//2
//        s1.push(4);
//        s1.pop();
        s1.display();;

    }

}
//implement i
class stdue{
    //implemention userdefi
    //implementio stack using array
    //step1
    //arrname
    int []date;
    //topvraible
    int top;
    stdue(int size){
        //create size
        date=new int[size];
        top=-1;//list oo faaruq -1
    }
    //push
    void push(int element){
        if (isfuul()){
            throw new RuntimeException("isfull");

        }
        top++;//
        date[top]=element;
    }
    //pop
    int pop(){
  if (isemtp()){
      throw new RuntimeException("list is emtp");
  }
        int romeve=date[top];
        top--;
        return romeve;
    }
    //peek
    int peek(){
        return date[top];
    }
    //size
    int size(){
        return top+1;
    }
    //
    boolean isemtp(){
        return top==-1;
    }
    //is
    boolean isfuul(){
        return top==date.length-1;
    }
    //display using loop
    void display(){
        for(int i=0;i<=top;i++){
            System.out.printf(""+date[i]);
         
            }
           
            }
        }
    



