import java.util.Stack;

public class last_midterm {
    public static void main(String[] args) {

        MyStack<Integer> name = new MyStack(8);

        name.Push(20);
        name.Push(30);
        name.Push(90);

        name.display();
    }
}

class MyStack<t>
{
    private int[] data;
    private int top;

    // size
    public MyStack(int size)
    {
        data = new int[size];
        top = -1;//array inedx0
    }
    // Push
    public void Push(int value)
    {
        top++;
        data[top] = value;
    }

    // Pop
    public int Pop()
    {
        int value = data[top];
        top--;
        return value;
    }

    // Peek
    public int Peek()
    {
        return data[top];
    }

    // Count
    public int size()
    {
        return top + 1;
    }

    // To display

    public void display() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]);
            if (i < top)
                System.out.print(", ");
        }
        System.out.println("]");
    }

}
