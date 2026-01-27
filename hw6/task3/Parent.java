package hw6.task3;

@MyAnnotation("Parent")
class Parent {
    @Deprecated
    public void oldMethod() {
    }

    @SuppressWarnings("unchecked")
    public void warningMethod() {
    }

    @Override
    public String toString() {
        return "parent";
    }
}

class Child extends Parent {

}
