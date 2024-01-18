public class methodoverriding {

    void show(){
        System.out.println("1");
    }
    

}
class xyz extends methodoverriding{
    void show(){
        System.out.println("2");
 
   }
   public static void main(String[] args) {
    methodoverriding t=new methodoverriding();
    t.show();
   }
}