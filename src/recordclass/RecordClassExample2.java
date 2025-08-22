package recordclass;

//public class RecordClassExample2{
//    public final int id;
//    public final String name;

    /* ====== Canonical Constructor =======*/

//    public RecordClassExample2(int id, String name){
//        if(id == 0) throw new IllegalArgumentException();
//    }
//}
public record RecordClassExample2(int id, String name) {

    //Compact Canonical Constructor
    public RecordClassExample2{
        if(id==0) throw new IllegalArgumentException("Incorrect Id!");
    }

}
