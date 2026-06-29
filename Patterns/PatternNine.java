public class PatternNine {
    public static void main(String[] args){
        int n=5;
        // int Ustars=1;

        for(int i=0;i<n;i++){
            // for spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }

            // for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Ustars+=2;
            System.out.println();
        }

        // for lower half
        for(int i=n;i>=1;i--){
            //for spaces
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<=n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
