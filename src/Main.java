import recordclass.RecordClassExample1;
import recordclass.RecordClassExample2;

public class Main {
    public static void main(String[] args) {

        RecordClassExample1 recordClassExample1 = new RecordClassExample1(1, "Record");
        System.out.println("Name: " + recordClassExample1.recordName()); // Accessor method
        System.out.println("Id: " + recordClassExample1.recordId());
        System.out.println(recordClassExample1); // Auto-generated toString()

        RecordClassExample2 recordClassExample2 = new RecordClassExample2(0, "Record");
        System.out.println(recordClassExample2);
    }
}