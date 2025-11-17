
package Exmaple;


import java.util.Stack;

public class example1 {
    //ch2
    public static void main(String[] args) {
        //bulitin class
        Stack<Integer>newstac=new Stack<Integer>();
        newstac.push(90);
        newstac.push(80);
        newstac.push(70);
        newstac.push(100);
        System.out.printf("\n");
        System.out.printf(""+newstac);
        System.out.printf("\n");
        System.out.printf("remove elemnt"+newstac.pop());
        System.out.printf("\n");
        System.out.printf("peek"+newstac.peek());
        System.out.printf("\n");
        System.out.printf("size"+newstac.size());
        System.out.printf("\n");
        System.out.printf("isemty"+newstac.isEmpty());
        System.out.printf("");
        //usin loop
        System.out.printf(""+newstac.toString());
        int x=newstac.remove(0);
        System.out.printf(""+x);







    }
}
