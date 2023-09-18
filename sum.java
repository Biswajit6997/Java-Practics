// when we use package
package calculate;
public class sum {
    int a=10;
    int b=20;
    public void cal(){
        int s=a+b;
        System.out.println("sum: "+ s);
    }

}

package maths.calculate;
import calculate.*;
class sumTest{
    public static void main(String[] args) {
        sum s=new sum();
        s.cal();
    }
}
 