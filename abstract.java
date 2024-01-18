abstract class vehiacle{
    int no_of_tyre;
     abstract void start();
}
class car extends vehiacle{
    void start(){
        System.out.println("starts eith key");
    }
}
class bike extends vehiacle{
    void start(){
        System.out.println("starts with kick");
    }
    public static void main(String[] args) {
        car c=new car();
        c.start();
        bike b=new bike();
        b.start();
    }
}