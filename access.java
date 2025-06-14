class student{
int id;
String name;
float stipend;
    public student() {
    }
    student(int id){
        this.id=id;
System.out.println("id is"+this.id);
        
    }

    public student(int id, String name, float stipend) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
        System.out.println("id is"+this.id+" name is"+this.name+" stipend we get is"+this.stipend);
    }
    
}
class access{
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student(101);
        student s3=new student(102,"samrudh",2400);

    }
}

    
