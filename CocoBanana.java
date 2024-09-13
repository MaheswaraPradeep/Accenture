package com.Accenture;
class CocoBanana {
    public static void main(String[] args) {
        //code for koko eating args
        int h=8;
        int[] arr={4,9,11,17};
        int n=arr.length;
        solve(h,arr,n);
    }
    static void solve(int h,int[] arr,int n){
        int s=1;
        int e=max(arr);
        int c=0;
        int rh=0;
        while(s<=e){
            int mid=(s+e)/2;
            for(int i=0;i<n;i++){
                rh+=(arr[i]/mid)+(arr[i]%mid!=0?1:0);
            }
            if(rh>h){
                s=mid+1;
            }
            else{
                c=rh;
                e=mid-1;
            }
        }
        System.out.println(c);
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
