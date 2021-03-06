package _0350;/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 *
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/description/
 *
 * algorithms
 * Easy (45.07%)
 * Likes:    204
 * Dislikes: 0
 * Total Accepted:    54.4K
 * Total Submissions: 120.7K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 
 * 示例 1:
 * 
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 
 * 
 * 示例 2:
 * 
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 
 * 说明：
 * 
 * 
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 
 * 
 * 进阶:
 * 
 * 
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// @lc code=start
class Solution {
    public int[] intersect(final int[] nums1, final int[] nums2) {
        if(nums1.length<1||nums2.length<1) return new int[0];
        int p=0;
        int q=0;
        final List<Integer> list =new ArrayList();
        final int[] a;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(p<=nums1.length-1&&q<=nums2.length-1){
            if(nums1[p]==nums2[q]) {
                list.add(nums1[p]);
                p++;
                q++;
            }else if(nums1[p]>nums2[q])
                q++;
            else
                p++;
        }
        a=new int[list.size()];
        for(int i=0;i<=list.size()-1;i++){
            a[i]=list.get(i);
        }
        return a;
        
    }
}
// @lc code=end

