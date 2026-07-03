import java.util.Arrays;
import java.util.Scanner;

public class Teleportor {
  public static void main(String[] args) {
    
		 Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();

    while (cases-- > 0) {
      int n = sc.nextInt();
      int coin = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt()+(i+1);
      }
                int count = 0;
            Arrays.sort(arr);
      for(int i=0;i<n;i++){
        if(coin>=arr[i]){
          coin-=arr[i];
          count++;

        }else{
          break;
        }

      }
      System.out.println(count);
      

    }

  }
}



  // input
//   10
// 5 6
// 1 1 1 1 1
// 8 32
// 100 52 13 6 9 4 100 35
// 1 1
// 5
// 4 5
// 4 3 2 1
// 5 9
// 2 3 1 4 1
// 5 8
// 2 3 1 4 1
// 4 3
// 2 3 4 1
// 4 9
// 5 4 3 3
// 2 14
// 7 5
// 5 600000000
// 500000000 400000000 300000000 200000000 100000000

  // output
// 2
// 2
// 0
// 1
// 2
// 2
// 1
// 1
// 1
// 2



