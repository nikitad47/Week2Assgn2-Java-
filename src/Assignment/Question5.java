package Assignment;

import java.util.*;

class queue<T> {

    int front = -1; 
    int rear = -1;

    ArrayList<T> A = new ArrayList<>();

    T front()
    {
        if (front == -1)
            return null;
        return A.get(front);
    }

    T rear()
    {
        if (rear == -1)
            return null;
        return A.get(rear);
    }

    void enqueue(T S)
    {
        if (this.isEmpty()) 
        {
            front = 0;
            rear = 0;
            A.add(S);
        }
        else 
        {
            front++;
            if (A.size() > front) 
                A.set(front, S);
            else
                A.add(S);
        }
    }

    void dequeue()
    {
        if (this.isEmpty())
            System.out.println("Queue is already empty");
        else if (front == rear) 
            front = rear = -1;
        else
            rear++;
    }

    boolean isEmpty()
    {
        
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    public String toString()
    {
        if (this.isEmpty())
            return "";

        String Ans = "";

        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(A.get(i)) + "\n";
        }

        Ans += String.valueOf(A.get(front));

        return Ans;
    }
}

class Question5 {

    public static void main(String args[])
    {
        queue<Integer> q1 = new queue<>();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        System.out.println("q1 After enqueue of 3 elements:\n" + q1);
        
        q1.dequeue();
        System.out.println("q1 After dequeue :\n" + q1);

        queue<String> q2 = new queue<>();

        q2.enqueue("Nikita");
        q2.enqueue("Dara");
        q2.enqueue("Nikki");

        System.out.println("\nq2 After enqueue of 3 elements:\n" + q2);

        System.out.println("Q2 front = " + q2.front() + "\nQ2 rear = " + q2.rear());

        queue<Float> q3 = new queue<>();

        System.out.println("\nCreated new Float Queue q3...");

        System.out.println("Checking if queue is  :\n" + q3.isEmpty());
    }
}