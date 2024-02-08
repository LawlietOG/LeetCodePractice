package Easy;

import java.util.*;

class SolutionO1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}

class SolutionOn2 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
           for(int j = i+1; j < n; j++){
            if (nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
           }
        }

        return new int[]{}; // No solution found
    }
}

class twoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int numElement = sc.nextInt();
        
        int[] nums = new int[numElement];

        System.out.println("Enter elements with space");
        for (int i = 0; i < numElement; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter Target");
        int target = sc.nextInt();
        

        SolutionOn2 oN2 = new SolutionOn2();
        SolutionO1 o1 = new SolutionO1();

        System.out.println("O(n2) solution " + Arrays.toString(oN2.twoSum(nums, target)));
        System.out.println("O(1) solution " + Arrays.toString(o1.twoSum(nums, target)));
        sc.close();
    }
}