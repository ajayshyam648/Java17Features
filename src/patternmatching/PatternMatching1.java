package patternmatching;

public class PatternMatching1 {

    public static void main(String[] args) {
        formatter("Foor");
    }

    private static void formatter(String str) {
        str = str.trim();

        //Before Java 17
//        if (str == null) {
//            System.out.println("Oops");
//        }
//        else if(str.equals("Foo") || str.equals("Bar")) {
//            System.out.println("Great");
//        }else{
//            System.out.println("ok");
//        }

        //Java 17 Introduced Switch Case
        switch (str) {
            case "" -> System.out.println("oops");
            case "Foo", "Bar" -> System.out.println("Great");
            default -> System.out.println("ok");
        }
    }

}
