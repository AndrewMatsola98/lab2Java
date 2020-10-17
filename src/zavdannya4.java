//4 В масиві усунути максимум та мінімум.
public class zavdannya4 {
    public static void main(String[] args) {
        int [] x={2,-3,1,7,4,-3,2,6,7,5,-3};
        int max=(int)Double.NEGATIVE_INFINITY;
        int min=(int)Double.POSITIVE_INFINITY;

        int indexMin=x.length-1;
        int indexMax=indexMin;
        for (int i=0;i<x.length;i++){
            if (x[i]>max){
                max=x[i];
                indexMax=i;
            }
            if(x[i]<min){
                min=x[i];
                indexMin=i;
            }
        }
        int count=0;
        for (int temp:x){
            if(temp==max||temp==min){
                count++;
            }
        }
        int[]res=new int[x.length-count+2];
        int j=0;
        for(int i=0;i<x.length;i++){
            if (x[i]!=min&&x[i]!=max){
                res[j++]=x[i];
            }else{
                if(i==indexMax||i==indexMin){
                    res[j++]=x[i];
                }
            }
        }
        for(int temp:res){
            System.out.print(temp+" ");
        }
    }

}

