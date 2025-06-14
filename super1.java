class superclass{
    int n=56;
}
class subclass extends superclass{
    int n=96;
    void display(){
        System.out.println("number in subclass is"+n);
        System.out.println("number in superclass is"+super.n);
    }
}
class super1{
    public static void main(String[] args) {
        subclass s1= new subclass();
        s1.display();
    }
}