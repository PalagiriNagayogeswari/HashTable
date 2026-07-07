# Hash Table

This repository contains Java implementations of Hash Table concepts developed as part of the Bridgelabz Data Structures and Algorithms learning program. The project demonstrates how a Hash Table can be implemented from scratch using Linked Lists for collision handling instead of Java's built-in `HashMap`.

## Features

- Custom Hash Table implementation
- Key-Value pair storage using `MyMapNode`
- Hashing using `hashCode()`
- Collision handling using Separate Chaining
- Linked List implementation for each bucket
- Word frequency counting
- Deletion of words from the Hash Table

## Concepts Covered

- Hash Table
- Hash Function
- `hashCode()`
- Linked List
- Separate Chaining
- Collision Handling
- Word Frequency Counting
- Node Deletion
- Object-Oriented Programming

## Use Cases

### UC1 - Find Frequency of Words in a Sentence

Implemented a Hash Table to find the frequency of words in the sentence:

```
To be or not to be
```

**Objectives**

- Create `MyMapNode` with key-value pairs.
- Use Linked List to store map nodes.
- Count the occurrence of each word.
- Display the frequency of every word.

---

### UC2 - Find Frequency of Words in a Paragraph

Implemented a Hash Table to count the frequency of words in the paragraph:

```
Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations
```

**Objectives**

- Use `hashCode()` to compute the bucket index.
- Create an array of Linked Lists representing Hash Table buckets.
- Store words with their frequencies.
- Handle collisions using Separate Chaining.
- Display bucket-wise word frequencies.

---

### UC3 - Remove a Word from the Hash Table

Implemented deletion of a word from the Hash Table.

**Word Removed**

```
avoidable
```

**Objectives**

- Locate the correct bucket using `hashCode()`.
- Traverse the Linked List.
- Remove the required node.
- Preserve the remaining structure of the Hash Table.

---

## Project Structure

```
HashTable/
│── HashTable.java
```

## Technologies Used

- Java
- Object-Oriented Programming
- Linked Lists
- Hash Tables

## Learning Outcomes

- Implemented a Hash Table without using Java's built-in `HashMap`.
- Understood how hashing distributes data into buckets.
- Learned collision handling using Separate Chaining.
- Implemented insertion, searching, updating, and deletion operations.
- Applied Hash Tables to solve word frequency problems efficiently.

## Author

**Palagiri Nagayogeswari**
