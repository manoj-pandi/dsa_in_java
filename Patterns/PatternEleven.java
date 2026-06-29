public class PatternEleven {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
   int num =1;

            if(i%2==0){
                num=1;}
                else{
                    num=0;
                }
   for(int j=0;j<=i;j++){
    System.out.print(num + " ");
    // if(num>0){
    //     num=0;
    // }else{
    //     num=1;
    // }
    num = 1-num;
   }
   System.out.println();
        }
    }
}
