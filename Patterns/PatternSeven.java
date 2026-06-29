public class PatternSeven {
    public static void main(String[] args){
        int n=5;
        int stars=1;
        // stars = 2*i+1 if index starts with 0
        for(int i=1;i<=n;i++){
            // for front spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for printing stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            stars+=2;
            // for backward spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
