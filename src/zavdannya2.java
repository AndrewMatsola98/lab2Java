// 2. Утворити третій масив як конкатенацію двох масивів різної довжини.
public class zavdannya2 {
    public static void main(String[] args) {
        int[] mass1 = {0,5,-2};
        int[] mass2 = {6,-7,2,0,3,-6,6};
        int[] mass12 = new int[mass1.length+mass2.length];
        for (int i=0;i<mass12.length;i++){
            if(i<mass1.length){
                mass12[i]=mass1[i];
            }else{
                mass12[i]=mass2[i-mass1.length];
            }
        }
        for (int temp:mass12){
            System.out.print(temp+" ");
        }
    }
}
