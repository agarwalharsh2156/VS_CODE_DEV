import java.util.*;

public class UniquePaths{
    public static void main(String[] args){
        int m = 3;
        int n = 7;
        Integer[][] mat = new Integer[m][n];

        for(int i = 0; i < m; i++){
            mat[i][0] = 1;
        }
        
        for(int j = 0; j < n; j++){
            mat[0][j] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                mat[i][j] = mat[i][j-1] + mat[i-1][j];
            }
        }

        System.out.println(mat[m-1][n-1]);
    }
}