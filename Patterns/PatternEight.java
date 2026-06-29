public class PatternEight {
    public static void main(String[] args){
        int n=5;
        // edge case it should start with index =0
        for(int i=n;i>=1;i--){
        int stars=2*i-1;
        // for spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // for stars
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }

        // for spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
}