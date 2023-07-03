class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        
//         Arrays.sort(nums);
//         List<List<Integer>>list=new ArrayList<List<Integer>>();
        
        
//         for(int i=0;i<nums.length-2;i++)
//         {
            
//             if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
            
            
//             //now we use two pointers to find the remainder
            
//             int l=i+i,h=nums.length-1,remainder=0-nums[i];
//             while(l<h)
//             {
//                 if(nums[l]+nums[h]==remainder)
//                 {
//                                List<Integer> temp=new ArrayList<Integer>();

                    
//                     temp.add(nums[i]);
//                     temp.add(nums[l]);
//                     temp.add(nums[h]);
//                     list.add(temp);
                   
//                      while (l < h && nums[l] == nums[l + 1]) l++;
//                         while (l< h && nums[h] == nums[h - 1]) h--;

//                          l++;
//                         h--;
//                      }
                
//                 else if (nums[l] + nums[h] < remainder) l++;

//                      else h--;
//             }
//         }
        
//         }
//        return list;
        
        
        
          Arrays.sort(num);

        List<List<Integer>>res=new ArrayList<List<Integer>>();

        for (int i = 0; i < num.length - 2; i++) {

            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {

                int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];

                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        ArrayList < Integer > temp = new ArrayList < > ();
                        temp.add(num[i]);
                        temp.add(num[lo]);
                        temp.add(num[hi]);
                        res.add(temp);

                        while (lo < hi && num[lo] == num[lo + 1]) lo++;
                        while (lo < hi && num[hi] == num[hi - 1]) hi--;

                        lo++;
                        hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;

                    else hi--;
                }
            }
        }
        return res;
        
        
    }
}