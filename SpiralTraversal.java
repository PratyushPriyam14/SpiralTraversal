import java.io.*;
import java.util.*;
public class SpiralTraversal
{
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        int minrow=0;
        int mincol=0;
        int maxrow= arr.length-1;
        int maxcol= arr[0].length-1;
        int total=c*r;
        int count=0;
        while(count<total){
            //left wall column fixed and row vary from min_row to max_row
            for(int i=minrow,j=mincol;i<=maxrow && count<total;i++)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            mincol++;
            //bottom wall row fixed and column vary from min_col to max_col
            for(int i=maxrow,j=mincol;j<=maxcol && count<total;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxrow--;
            //right wall  column fixed and row vary from max_row to min_row
            for(int i=maxrow,j=maxcol;i>=minrow && count<total;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxcol--;
            //top wall row fixed and column vary from max_col to min_col
            for(int i=minrow,j=maxcol;j>=mincol && count<total;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minrow++;
        }
    }
}
