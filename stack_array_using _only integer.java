public class last_midterm {
    public static void main(String[] args) {

        MyStackssInt name = new MyStackssInt(8);

        name.push(10);
        name.push(20);
        name.push(30);
        name.push(40);
        name.display();
    }
}

class MyStackssInt
{
    int[] data;
    int top;

    MyStackssInt(int size)
    {
        data = new int[size];
        top = -1;
    }

    void push(int element){
        top++;
        data[top] = element;
    }

    int pop(){
        int value = data[top];
        top--;
        return value;
    }

    int peek(){
        return data[top];
    }

    int size(){
        return top + 1;
    }

    void display(){
        System.out.print("{");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]);
            if (i < top)
                System.out.print(", ");
        }
        System.out.println("}");
    }
}
