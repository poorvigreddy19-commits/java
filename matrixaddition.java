public class matrixaddition {
    public static void main(String[] args) {
        int a[][]={{5,6,4},{15,8,5},{8,3,9}};
        int b[][]={{9,8,2},{6,5,6},{1,5,10}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
