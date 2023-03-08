public class PrimeNumbers {
    public static void main(String[] args){
        boolean isPrime = true;
        for (int i = 2; i < 500; i++){
//            Inside the for loop, we check if the number is divisible by any number in the given range (2...num/2) .
//            If num is divisible, flag is set to true and we break out of the loop. This determines num is not
//            a prime number. If num isn't divisible by any number, flag is false and num is a prime number.
            isPrime = true;
            for(int d = 2; d < i / 2; d++ ){
                if(i % d == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
