package sealedclass;

/*
Sealed classes, finalized in Java 17, provide a mechanism to restrict
the inheritance hierarchy of a class or interface.
This feature allows developers to explicitly control which classes can
extend a sealed class or implement a sealed interface.
 */

/*
A sealed class or interface is declared using the sealed keyword,
followed by a permits clause that lists the direct subclasses or implementing
classes/interfaces explicitly allowed to extend or implement it.
 */

sealed class A permits B, C{
    /*
    this sealed class A permits only to class B for extending class A.
    we can permits multiple classes separated by ','.
     */
    void call(){
        System.out.println("Call Method");
    }
    void display() {
        System.out.println("Class A");
    }
}

/*
The classes or interfaces listed in the permits clause must be declared as one of the following:
    1) final: Prevents further extension.
    2) sealed: Allows further, but still controlled, extension within its own permits clause.
    3) non-sealed: Allows unlimited extension, similar to regular classes.
 */
final class B extends A{
    @Override
    void display() {

    }
}

final class C extends A{
    @Override
    void display() {
        System.out.println("Class C");
    }
}
class D{

}
public class SealedClassExample {
    public static void main(String[] args) {
        B b = new B();
        b.call();
        b.display();
    }
}
