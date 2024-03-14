class countNnumbers{

    public static void main(String[] args) {

        //Method 1 TIME COMPLEXITY - O(n)
        int n=5;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);

        //Best Approach TIME COMPLEXITY -O(1)
        sum=n*(n+1)/2;
        System.out.println("The value is "  + sum);

    }
}