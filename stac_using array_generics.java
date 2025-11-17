import java.util.Stack;

public class last_midterm {
    public static void main(String[] args) {

        MyStackss<Integer> name = new MyStackss<>(8);

        name.push(10);
        name.push(20);
        name.push(30);
        name.push(40);
        name.diplay();

        MyStackss<String> number = new MyStackss<>(9);
        number.push("Ali");
        number.push("Somalia");
        number.diplay();
    }
}

class MyStackss<t>
{
    t[] date;
    int top;


    MyStackss(int size)
    {
        date = (t[]) new Object[size];   // FIXED
        top = -1;
    }

    void push(t elemnt){
        top++;
        date[top] = elemnt;
    }

    t pop(){               // FIXED
        t value = date[top];
        top--;
        return value;
    }

    t peek(){             // FIXED
        return date[top];
    }

    int size(){
        return top + 1;
    }

    void diplay(){
        System.out.print("{");
        for (int i = 0; i <= top; i++) {
            System.out.print(date[i]);
            if (i < top)
                System.out.print(", ");
        }
        System.out.println("}");
    }
}
