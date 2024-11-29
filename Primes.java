public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int ceil = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[ceil + 1];
        //initializing values
        isPrime[0] = false;
        if (ceil > 0)
            isPrime[1] = false;
        for (int i = 2; i < ceil + 1; i++) {
            isPrime[i] = true;
        }
        //crossing out multiplications of primes
        int prime = 2;
        while(prime * prime <= ceil)
        {
            if(isPrime[prime]){
                for (int i = prime * prime; i <= ceil; i+=prime) {
                    isPrime[i] = false;
                }
            }
            prime++;
        }
        //printing results and counting primes.
        int count = 0;
        System.out.println("Prime numbers up to " + ceil + ":");
        for (int i = 2; i <= ceil; i++) {
            if(isPrime[i]){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + ceil + " (" + ((count)* 100/ceil) + "% are primes)");
    }
}