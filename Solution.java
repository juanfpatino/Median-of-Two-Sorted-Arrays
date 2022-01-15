class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        
        int[] comb = new int[n + m];
        
        int i = 0;
        int j = 0;

        int k = 0;
        
        while(i < m && j < n){
            
            if(nums1[i] <= nums2[j]){
                
                comb[k] = nums1[i];
                i++;
            }
            else{
                
                comb[k] = nums2[j];
                j++;
            }
            
               k++;
            
        }
        
        
        while(i < m){
            
            comb[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j < n){
            
            comb[k] = nums2[j];
            j++;
            k++;
            
        }

        //for(int ii = 0; ii < n + m; ii++){
            
          //  System.out.println(comb[ii]);
            
        //}
        
        
        if((n + m) % 2 == 0){//even
            
            return (double)(comb[(n + m) / 2 - 1] + comb[(n + m) / 2])/2;
            
        }
               
        //odd
               
        return (double)comb[(int)Math.floor((n + m)/2)];
        
        
    }
}