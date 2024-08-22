import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;

public class ExL6002 {
    public static void main(String[] args) {

        String[] nums = new String[5];

        nums[0] = "g";
        nums[1] = "a";
        nums[2] = "b";
        nums[3] = "r";
        nums[4] = "i";

        for(int i = 0; i< nums.length; i++){
            System.out.print(nums[i].toUpperCase());
        }
    }
}
