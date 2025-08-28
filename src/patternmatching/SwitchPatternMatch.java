package patternmatching;

public class SwitchPatternMatch {

    public void test(Object o){
        if(o instanceof String s){
            System.out.println("String Type");
        }else if(o instanceof Integer i){
            System.out.println("Integer Type");
        }else if(o instanceof Double d){
            System.out.println("Double Type");
        }else{
            System.out.println("Object Type");
        }
    }
}
