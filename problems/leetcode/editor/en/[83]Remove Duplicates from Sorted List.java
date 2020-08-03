// Given a sorted linked list, delete all duplicates such that each element appea
// r only once.
//
// Example 1:
//
//
// Input: 1->1->2
// Output: 1->2
//
//
// Example 2:
//
//
// Input: 1->1->2->3->3
// Output: 1->2->3
//
// Related Topics Linked List
// 👍 1612 👎 114

// leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution83 {
  public ListNode deleteDuplicates(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }
    ListNode temp = head;
    while (temp != null) {
      if (temp.next != null && temp.val == temp.next.val) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
    return head;
  }
}

//class ListNode {
//  int val;
//  ListNode next;
//
//  ListNode() {}
//
//  ListNode(int val) {
//    this.val = val;
//  }
//
//  ListNode(int val, ListNode next) {
//    this.val = val;
//    this.next = next;
//  }
//}
// leetcode submit region end(Prohibit modification and deletion)
