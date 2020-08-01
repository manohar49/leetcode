// Merge two sorted linked lists and return it as a new sorted list. The new list
// should be made by splicing together the nodes of the first two lists.
//
// Example:
//
//
// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4
//
// Related Topics Linked List
// 👍 4473 👎 606

// leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution21 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    if (l1.val <= l2.val) {
      return new ListNode(l1.val, mergeTwoLists(l1.next, l2));
    } else {
      return new ListNode(l2.val, mergeTwoLists(l1, l2.next));
    }
  }
}

//comment following while submitting
class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
// leetcode submit region end(Prohibit modification and deletion)
