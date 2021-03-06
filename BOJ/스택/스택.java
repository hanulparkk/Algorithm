//First Solution
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();

            if (cmd.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));

            if (cmd.equals("pop")) {
                if (stack.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(stack.pop());
            }

            if (cmd.equals("size"))
                System.out.println(stack.size());

            if (cmd.equals("empty"))
                if(stack.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);

            if (cmd.equals("top"))
                if(stack.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
        }
    }
}

//Second Solution
import java.io.*;
import java.util.*;

class Stack {
    int[] elements;
    int size;

    public Stack(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }

    public void push(int element) {
        elements[size] = element;
        size++;
    }

    public int pop() {
        if (isEmpty())
            return -1;

        int element = elements[size - 1];
        size--;

        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty())
            return -1;

        return elements[size - 1];
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack stack = new Stack(N);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String token = st.nextToken();

            if (token.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));

            if (token.equals("pop"))
                bw.write(stack.pop() + "\n");

            if (token.equals("size"))
                bw.write(stack.size() + "\n");

            if (token.equals("empty"))
                bw.write(stack.isEmpty() ? "1" + "\n" : "0" + "\n");

            if (token.equals("top"))
                bw.write(stack.peek() + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

//Third Soultion
import java.io.*;
import java.util.*;

class Node {
    private int element;
    private Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }

    public int element() {
        return this.element;
    }

    public Node next() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class Stack {
    private Node rear;
    private int size;

    public Stack() {
        this.rear = null;
        this.size = 0;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.setNext(this.rear);
        this.rear = newNode;
        size++;
    }

    public int pop() {
        if (this.isEmpty())
            return -1;

        int removedElement = this.rear.element();
        this.rear = this.rear.next();
        size--;

        return removedElement;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int peek() {
        if (this.isEmpty())
            return -1;

        return this.rear.element();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String token = st.nextToken();

            if (token.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));

            if (token.equals("pop"))
                bw.write(stack.pop() + "\n");

            if (token.equals("size"))
                bw.write(stack.size() + "\n");

            if (token.equals("empty"))
                bw.write(stack.isEmpty() ? "1" + "\n" : "0" + "\n");

            if (token.equals("top"))
                bw.write(stack.peek() + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
