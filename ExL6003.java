import java.util.ArrayList;

public class ExL6003 {
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(2);
        nums.add(10);
        nums.add(20);
        nums.add(6);
        nums.add(12);

        int soma = 0;

        for(int i = 0; i<nums.size();i++){
            soma = soma + nums.get(i);
        }
        System.out.println(soma);

        double media = soma/5;

        System.out.println(media);
    }
}