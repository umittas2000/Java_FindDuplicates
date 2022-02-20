import java.util.Arrays;

public class Main {

    public static boolean isFind(int[] arr, int value){
        for(int i:arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] liste = {3,7,3,3,2,9,4,4,10,21,1,2,33,9,1};
        int[] findDups = new int[liste.length];
        int startIndex=0;

        for(int i=0;i<liste.length;i++){
            for(int j=0;j<liste.length;j++){
                if((i!=j) &&(liste[i]==liste[j])){
                    if(!isFind(findDups,liste[i]) && liste[i]%2==0){
                        findDups[startIndex++]=liste[i];
                    }
                    break;
                }
            }
        }

        for(int value:findDups){
            if(value!=0){
                System.out.println(value);
            }
        }
    }
}
