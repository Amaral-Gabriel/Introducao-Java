import java.util.LinkedList;

public class ExL6004 {
    public static void main(String[] args) {
        
        LinkedList<Integer> nums = new LinkedList<Integer>();

        nums.add(2);
        nums.add(10);
        nums.add(20);
        nums.add(6);
        nums.add(12);

        System.out.println(nums);

        nums.add(2, 9);

        System.out.println(nums);
    }
}