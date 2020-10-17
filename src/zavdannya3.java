// 3. В масиві поміняти місцями максимум та мінімум.
public class zavdannya3 {
    public static void main(String[] args) {
            int a[] = new int[]{6, 4, -5, -9, 2, 21, 6,3, 0, 8};
            int max=0;
            int min =0;
            int imax = 0;
            int imin = 0;
            for(int i=0; i<a.length; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            for(int i=0; i<a.length; i++){
                if(a[i]>max){
                    max=a[i];
                    imax=i;
                }
                if(a[i]<min){
                    min=a[i];
                    imin = i;
                }
            }
            a[imin] =max; a[imax] = min;
            for(int i=0; i<a.length; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            System.out.println(max);
            System.out.println(min);
        }
}