package com.abhinav.magic.matrix;

public class MagicMatrix {
	public static void printMagicMatrix(int n) {
		int [][]matrix = new int[n][n];
		int i , j , k,t;
		
		for(i =0; i <n;i++){
			for(j=0;j<n;j++){
				matrix[i][j]=0;
			}
		}
		if(n%2!=0){
			i=0;
			j =n/2;
			k=1;
			while(k<=n*n){
				matrix[i][j]=k++;
				i--;
				j++;
			}
			if(i<0 && j>n-1){
				i=i+2;
				j--;
			}
			if(i<0){
				i=n-1;
			}
			if(j>n-1){
				j=0;
			}
			
			if(matrix[i][j]>0){
				i=i+2;
				j--;
			}
		}else{
			 k = 1;
             
             /* Filling the matrix with natural numbers from 1 till n*n */
             for(i=0;i<n;i++)
             {
                 for(j=0;j<n;j++)
                     {
                        matrix[i][j] = k++;
                     }
             }
              
             j = n-1;
              
             for(i=0; i<n/2; i++)
             {
                 /* swapping corner elements of primary diagonal */
                 t = matrix[i][i];
                 matrix[i][i] = matrix[j][j];
                 matrix[j][j] = t;
                  
                 /* swapping corner elements of secondary diagonal */
                 t = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = t;
                  
                 j--;
             }
		}

	}
}
