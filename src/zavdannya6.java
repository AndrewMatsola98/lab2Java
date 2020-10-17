 /*6.Утворити третій масив з елементів двох масивів однакової довжини,
 які є одночасно непарними. Утворити четвертий масив з індексів цих елементів.
  */
public class zavdannya6 {
    public static void main(String[] args) {
        int arr1[] = {6,6,23,18,16,7,5,2};
        int arr2[] = {2,4,13,43,6,5,0,41};

        System.out.print( "\n");
        for (int temp:arr1)
            System.out.print(temp + " ");
        System.out.print( "\n");
        for (int temp:arr2)
            System.out.print(temp + " ");
        int arr3[] = new int[arr1.length*2];
        int arr4[] = new int[arr1.length];
        int a=0;
        int b=0;
        for (int i=0;i<arr1.length;i++) {
            if ((arr1[i]%2==1)&&(arr2[i]%2==1)) {
                arr3[a] = arr1[i]; a++;
                arr3[a] = arr2[i];
                a++;
                arr4[b] = i+1;
                b++;
            }
        }
        System.out.print( "\nнепарні елементи масиву: ");
        for (int temp:arr3) {
            if (temp!=0) System.out.print(temp + " ");
        }
        System.out.print( "\nчетвертий масив з індексів цих елементів: ");
        for (int temp:arr4) {
            if (temp!=0)
                System.out.print(temp-1 + " ");
        }
    }
}
