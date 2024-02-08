from typing import List

class SolutionO1:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap = {}
        n = len(nums)

        for i in range(n):
            complement = target - nums[i]
            if complement in numMap:
                return [numMap[complement], i]
            numMap[nums[i]] = i

        return []  # No solution found

class SolutionOn2:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        for i in range(n - 1):
            for j in range(i + 1, n):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return [] 
    
twoSumObj = SolutionOn2() 
print("O(n^2) solution {}",twoSumObj.twoSum([2,3,4,5], 5))

twoSumObj = SolutionO1() 
print("O(1) solution {}",twoSumObj.twoSum([2,3,4,5], 5))