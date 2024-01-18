public class Methodover {
    void show(int a ,float b){
        System.out.println("1");


    }
    void show(String a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Methodover t=new Methodover();
        t.show(10,10);
        t.show(10,10.6f);
    }
}
