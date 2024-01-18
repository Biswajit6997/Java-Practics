interface l1{
    public void show();
}
interface l2{
   public void display();
}
class Test implements l1,l2{
    public void show(){
        System.out.println("1");
    }
    public void display(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.display();
    }
}