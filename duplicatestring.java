public class pyramid{
   public static void main(String []args){
        int n = 4;
        int k;
          for(int i=0;i<n;i++){
            for(int j =n;j>=i;j--){
                System.out.print(" ");
            }
            for( k=i;k>=-i;k--){
              System.out.print((char)(i-Math.abs(k)+65));
            }
	System.out.print("\n");
        }

     }
}
