// 1. Утворити третій масив як попарну суму елементів двох масивів однакової довжини.
public class zavdannya1 {
    public static void main(String[] args) {
        int aar1[] = {1,2,4,-6,7,0,3,-6};
        int arr2[] = {0,-3,6,-7,-1,4,7,8};
        System.out.println("\n");
        for (int temp:aar1)
            System.out.print(temp + " ");
        System.out.println("\n");
        for (int temp:arr2)
            System.out.print(temp + " ");
        System.out.println("\n");
        int arr3[] = new int[aar1.length];
        for (int i=0;i<aar1.length;i++)
            arr3[i] = aar1[i]+arr2[i];
        for (int temp:arr3)
            System.out.print(temp + " ");
    }
}
