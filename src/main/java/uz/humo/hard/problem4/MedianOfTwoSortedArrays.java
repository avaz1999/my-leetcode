package uz.humo.hard.problem4;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] res = new int[l];
        int i =0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                res[k++] = nums1[i++];
            }else {
                res[k++] = nums2[j++];
            }
        }
        while(i < nums1.length) res[k++] = nums1[i++];
        while(j < nums2.length) res[k++] = nums2[j++];

        if(l % 2 != 0) return res[l / 2];
        else return (double)(res[l / 2] + res[(l / 2) - 1]) / 2;
    }
}
