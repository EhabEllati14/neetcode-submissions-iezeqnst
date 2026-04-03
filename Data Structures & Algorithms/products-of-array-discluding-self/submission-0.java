class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //Idea & Solution !!!!
// solution: we use prefix and suffix product
//  for each index, we take product of left side and right side

// prefix = product of all elements before current index
// suffix = product of all elements after current index

// for index i:
// result[i] = left product * right product

// first step: build prefix (left products)
// for index 0  ---> no elements on left → so put 1
result[0] = 1;
        result[0]=1;
        for(int i=1; i<=nums.length-1; i++){
            result[i] =result[i-1]*nums[i-1];
        }

       int  suffix =1;
        for(int i = result.length -1 ; i>=0 ; i--){
            result[i]*=suffix;
            suffix*=nums[i];
        
        }
        return result;
    }
}  
