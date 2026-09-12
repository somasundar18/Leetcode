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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;
        int r = 0;
        while(temp != null){
            li.add(temp.val);
            r++;
            temp = temp.next;
        }
        int l = 0;
        while(l < r){
            if(li.get(l) != li.get(r - 1)) return false;
            l++;
            r--;
        }
        return true;
    }
}