

class parent{
    public void hello(){
        System.out.println("parent class");
    }
}
class child extends parent{
    public void hello(){
System.out.println("child class");
    }

    }
class overriding{
    public static void main(String[] args) {
    parent p1= new child();
    p1.hello();
    }
}