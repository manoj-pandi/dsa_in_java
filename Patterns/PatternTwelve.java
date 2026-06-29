public class PatternTwelve {
    public static void main(String[] args){
        int n=5;
        int space = (n-1)*2-2;
        for(int i=1;i<n;i++){
for(int j=1;j<=i;j++){
System.out.print(j );}
// printing space
for(int j=1;j<=space;j++){
    System.out.print(" ");
        }
// for print num
for(int j=i;j>0;j--){
    System.out.print(j);
}
System.out.println();
space = space-2;
    }
}
}
