import java.util.Scanner;

/**
 * Created by cornell on 5/26/2017.
 *
 */
public class run {

    public static void main(String[] args){

        System.out.println("print");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        boolean[][] board=new boolean[n][n];
        putQueen(n,board);

    }
    private static void putQueen(int n, boolean[][] board){

        if(checkCondition()){

        }

    }
    private static boolean checkCondition(){
        return true;
        //Stuck aF
    }


}
