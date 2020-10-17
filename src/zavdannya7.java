// 7. З масиву видалити дублікати максимума та мінімума
public class zavdannya7 {
    public static void main(String[] args) {
        int arr[]= {6,7,4,-9,0,6,2,-3,9,2,1,5,7,7};

        System.out.print( "\nпочатковий масив: ");
        for (int x:arr)
            System.out.print(x + " ");
        int arr_max=arr[0], arr_max2=arr[0];
        for(int i=0;i< arr.length;i++ ){
            if (arr_max<arr[i]) {
                arr_max=arr[i];
            }
            if (arr_max2>arr[i]) {
                arr_max2=arr[i];
            }
        }
        int arr2[]=new int[arr.length];
        int d=0, d1=0, d2=0;
        for(int x:arr){
            if(x==arr_max2 & d1==1 | x==arr_max & d2==1)
                continue;
            if(x==arr_max2) {
                arr2[d]=x;
                d++;
                d1++;
                continue;
            }
            if( x==arr_max) {
                arr2[d]=x;
                d++;
                d2++;
                continue;
            }
            else {
                arr2[d]=x;
                d++;
            }
        }

        System.out.print( "\nмасив без дублікатів: " );
        for (int x:arr2) {
            if(x!=0)
                System.out.print(x + " ");
        }
    }
}
