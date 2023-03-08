public class Loops {
    public static void main(String[] args){
//        for(int i = 0; i <= 100; i++){
//            if(i % 2 == 1){
//                System.out.println("The odd numbers are:");
//                System.out.println(i);
//            }
//        }
        boolean isPrime = true;
        for(int i = 2; i < 500; i++){
            isPrime = true;
            for(int d = 2; d < i / 2; d++){
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
