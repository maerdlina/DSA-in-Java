public class Main {
    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(4);
        priorityQ.insert(5);
        priorityQ.insert(3);
        priorityQ.insert(7);

        priorityQ.show();
    }
}