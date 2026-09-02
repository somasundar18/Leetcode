/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode prev = head;
        ListNode cur = head.next;
        int len = 0;
        while(prev != null && cur.next != null){
            if((cur.val > prev.val && cur.val > cur.next.val) ||
            (cur.val < prev.val && cur.val < cur.next.val)){
                res.add(len);
            }
            len++;
            prev = cur;
            cur = cur.next;
        }
        if(res.size() < 2){
            return new int[]{-1, -1};
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < res.size(); i++){
            int distance = res.get(i) - res.get(i - 1);
            min = Math.min(distance, min);
        }
        int max = res.get(res.size() - 1) - res.get(0);
        return new int[]{min, max};
    }
}