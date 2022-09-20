public class prob2_2{
    public static void main(String[] args) {
        char grade = 'b';
        //encrypt
        
        grade= (char)(grade+8);
        System.out.println(grade);

        //decrypt

        grade= (char) (grade-8);
        System.out.println(grade);


    }
    
}
