class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target > x+y) return false;
        if(x==0) return y==target;
        if(y==0) return x==target;
        return target % gcd(x,y)==0;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}