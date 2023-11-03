public class asd {
    public static void main(string[] args) {
        int min = 100, max = 0

                random r = new random();
        int nums[] = new int[10];
        for(int i = 0;i < nums.length; i++){
            nums[i] = math.round((r.nextint(bound 100)+1));
            system.out.print(nums[i]+", ");
            if(nums[i] < min ) min = nums[i];
            if(nums[i] > max ) max = nums[i];
        }
        system.out.print();
        system.out.print("the smallest value is: " + min);
        system.out.print("the greatest value is: " + max
        )




    }


}
