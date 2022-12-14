


public class EvenSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2596));
        System.out.println(getEvenDigitSum(115));
        System.out.println(getEvenDigitSum(354));
        System.out.println(getEvenDigitSum(3254324));
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1 ;
        } else {
            int number_r = number , remain=0,sum=0;
            while(number_r>0){
                remain = number_r%10;
                if(remain%2==0){
                    sum = sum+remain;
                }

                number_r/=10;
            }
            return sum;
        }
    }

}

