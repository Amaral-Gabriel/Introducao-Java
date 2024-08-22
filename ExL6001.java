import java.util.Arrays;
public class ExL6001 {
    public static void main(String[] args) {
        int[] nums = {18,6,26,44,8,2,2,97,1,10};
        int maior = 0;
        int menor = nums[1];

        for(int i = 0; i < nums.length; i++){
            if (nums[i] > maior){
                maior = nums[i];
            }
            if (nums[i] < menor){
                menor = nums[i];
            }
        }
        System.out.println("Maior valor: "+maior);
        System.out.println("Menor valor: "+menor);
    }
}
