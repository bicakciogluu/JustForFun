public class Harshad{
    public static boolean harsahdChecker(int a){
        int temp1 = a;
        int temp2 = a;
        int digit = 0;
        int divider = 0;
        
        while(temp1 > 0){
            temp1 /= 10;
            digit++;
        }
        
        for(int i = 0; i < digit; i++){
            divider += temp2 % 10;
            temp2 /= 10;
        }
        
        if((a / divider) * divider == a){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(harsahdChecker(12));
        System.out.println(harsahdChecker(14));
        System.out.println(harsahdChecker(16));
        System.out.println(harsahdChecker(24));
    }
}