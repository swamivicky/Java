class Factorial{
    public static void main(String args[]){
        int count = 1;
        long fact = 1;
        System.err.println("Number" + "\t" + " factorial value");
        while (count <= 10) {
            fact = fact * count;
            System.out.println(count + "\t" + fact);
            count++;
        }
    }
}