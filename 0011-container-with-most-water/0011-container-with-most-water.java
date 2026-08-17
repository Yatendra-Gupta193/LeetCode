class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int maxArea = 0;
        int l=0;
        int r=n-1;
        while(l<r){
            int area=0;
            if(h[l]<h[r]){
                area=h[l]*(r-l);
                l++;
            }else{
                area=h[r]*(r-l);
                r--;
            }
            maxArea= Math.max(maxArea,area);
        }
        return maxArea;
    }
}