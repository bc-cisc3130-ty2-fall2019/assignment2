# cisc3130 assignment 2


Instructor: Katherine Chuang \
Section: MY9 \
Brooklyn College


## Objective

1. Implement a function to check if a linked list is a palindrome.

A [palindrome](https://en.wikipedia.org/wiki/Palindrome) is same forwards as it is backwards (i.e. 0 -> 1 -> 2 -> 1 -> 0)

Implementation: Use the [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) interface.

Sample input: `["r", "a", "c", "e", "c", "a", "r"]` *Assume only numbers or characters*

Output: `boolean` TRUE | FALSE

2. Merge two sorted linked lists into one sorted singly linked list.
Inputs are sorted, you can assume smallest to largest values.

Implementation: Use the [Queue](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html) interface.

Sample input:
`[1,3,5]` and `[2,4,5,6]`

Sample output: `[1,2,3,4,5,5,6]`
