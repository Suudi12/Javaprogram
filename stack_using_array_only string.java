public class last_midterm {
    public static void main(String[] args) {

        MyStackssString names = new MyStackssString(8);

        names.push("Ali");
        names.push("Hodan");
        names.push("Ayaan");
        names.push("Mahad");

        names.display();
    }
}

class MyStackssString
{
    String[] data;
    int top;

    MyStackssString(int size)
    {
        data = new String[size];
        top = -1;
    }

    void push(String element){
        top++;
        data[top] = element;
    }

    String pop(){
        String value = data[top];
        top--;
        return value;
    }

    String peek(){
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
