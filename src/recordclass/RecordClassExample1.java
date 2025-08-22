package recordclass;

import java.util.Objects;

// Before Java 17
//public class RecordClassExample1 {
//    private final int recordId;
//    private final String recordName;
//
//    public RecordClassExample1(int recordId, String recordName) {
//        this.recordId = recordId;
//        this.recordName = recordName;
//    }
//
//    public int getRecordId() {
//        return recordId;
//    }
//    public String getRecordName() {
//        return recordName;
//    }
//
//    @Override
//    public String toString() {
//        return "RecordClassExample1{" +
//                "recordId=" + recordId +
//                ", recordName='" + recordName + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        RecordClassExample1 that = (RecordClassExample1) o;
//        return recordId == that.recordId && Objects.equals(recordName, that.recordName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(recordId, recordName);
//    }


// After Java 17, Record class is introduced which is internally has a private final
// variables it means these feature just work when we want to get/fetch data not for update or modify

/*
The Java compiler automatically generates several members for a record:
A private final field for each component.
A public accessor method for each component.
A canonical constructor that takes all components as arguments.
Implementations of equals(), hashCode(), and toString() methods based on the record's components.

 */
public record RecordClassExample1(int recordId, String recordName){
}