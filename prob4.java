import java.util.*;

public class prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter mile : ");
        float miles=sc.nextFloat();

        float km=miles*1.609344f;
        
        System.out.println(km+"km in "+miles+"mile");
    }
    
}
