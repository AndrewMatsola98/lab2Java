/*8. Визначити середні арифметичні двох масивів. Утворити третій масив з елементів обидвох масивів,
        що знаходяться в межах між значеннями середніх арифметичних.
 */
public class zavdannya8 {
    public static void main(String[] args) {
        int mass1[] = {6,7,4,-9,0,6,2,-3,9,2,1,5,7,7};
        int mass2[] = {4,234,2,54,13,22,14,54};
        double ser1=0, ser2=0;

        for (int temp:mass1)
            ser1+=temp;
        ser1/=mass1.length;
        for (int temp:mass2)
            ser2+=temp;
        ser2/=mass2.length;

        System.out.print( "\nМасив перший: ");
        for (int temp:mass1)
            System.out.print(temp + " ");
        System.out.print(" Cереднє значення: " + ser1);
        System.out.print( "\nМасив другий: ");
        for (int temp:mass2)
            System.out.print(temp + " ");
        System.out.print(", Cереднє значення: " + ser2);
        int a,a2;
        if (ser1<ser2) {
            a=(int)ser1;
            a2=(int)ser2;
        }
        else {
            a=(int)ser2;
            a2=(int)ser1;
        }
        int mass21[] = new int[mass1.length+mass2.length];
        int count=0;
        for (int i=0;i<mass21.length;i++){
            if (i<mass1.length && mass1[i]>a && mass1[i]<a2  ) {
                mass21[count]=mass1[i];
                count++;
            }
            if (i>=mass1.length && mass2[i-mass1.length]>a && mass2[i-mass1.length]<a2) {
                mass21[count]=mass2[i-mass1.length];
                count++;
            }
        }

        System.out.print( "\nШуканий масив: ");
        for (int temp:mass21) {
            if(temp!=0)
                System.out.print(temp + " ");
        }
    }
}
