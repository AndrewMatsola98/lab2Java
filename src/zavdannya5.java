//5 Масив поділити на два масиви: з додатніх та від’ємних елементів.
public class zavdannya5 {
    public static void main(String[] args) {
        int [] x={3,-2,6,9,-3,6,-4, 3, 9};
        int count=0;
        int k=0;
        int b=0;
        for(int temp:x){
            if(temp<0){
                count++;
            }
        }
        int[] y = new int[count];
        int[] z = new int[x.length-count];
        for (int temp:x){
            if(temp>0){
                z[k]=temp;
                k++;
            }else{
                y[b]=temp;
                b++;
            }
        }
        for(int masiv1:z){
            System.out.print(masiv1+" ");
        }
        System.out.println();
        for(int masiv2:y){
            System.out.print(masiv2+" ");
        }
    }

}

