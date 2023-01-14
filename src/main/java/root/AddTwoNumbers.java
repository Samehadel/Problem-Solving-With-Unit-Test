package root;

import java.util.List;

public class AddTwoNumbers {

	public static void main(String [] args){
		ListNode n1 = new ListNode(9);/*
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;*/

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(9);
		ListNode l3 = new ListNode(9);
		ListNode l4 = new ListNode(9);
		ListNode l5 = new ListNode(9);
		ListNode l6 = new ListNode(9);
		ListNode l7 = new ListNode(9);
		ListNode l8 = new ListNode(9);
		ListNode l9 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;


		ListNode result = addTwoNumbers(n1, l1);

	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int listOneValue = calculateListNumber(l1);
		int listTwoValue = calculateListNumber(l2);
		int sum = listOneValue + listTwoValue;


		return convertIntToList(sum);
	}

	private static int calculateListNumber(ListNode node) {
		int factor = 1;
		int listValue = node.val * factor;

		while(node.next != null){
			factor *= 10;
			node = node.next;
			listValue += (node.val * factor);
		}
		return listValue;
	}

	private static ListNode convertIntToList(int sum) {
		int factor = 1;
		int numberOfDigits = String.valueOf(sum).length();
		ListNode result = new ListNode((sum % (factor * 10) / factor));
		ListNode current = result;

		for(int i = 0; i < numberOfDigits - 1; i++){
			factor *= 10;
			current.next = new ListNode((sum % (factor * 10) / factor));
			current = current.next;
		}

		return result;
	}


	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}


