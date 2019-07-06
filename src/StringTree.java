
public class StringTree { // made off nodes (including the root node), the add()-->adding() and
							// inOrderTraversal() to print alphabetically

	Node root; // root of type node

	private void add(String value) { // method to add strings to the binary tree
		Node node = new Node(value); // initializing the node
		if (root == null) {
			root = node; // if the root is empty, add the value to the root, otherwise run down the tree
			System.out.println(root);
			return;
		}

		Node runner; // Runs down the tree to find a place for the new value
		runner = root; // Start at the root of subtrees.

		while (true) {
			if (value.equals(runner.value)) {
				// The word is already in the tree. No need to add duplicates
				System.out.println(value); // printing new item added to the tree
				return;
			}
			if (value.compareTo(runner.value) < 0) { // Compares two strings lexicographically.
				// The comparison is based on the Unicode value of each character in the
				// strings.

// If the new item is less than the item value in runner, it'll be placed in the left subtree of runner.  
				if (runner.left == null) { // nested if to fill runner.left if it's empty, otherwise keep going down to
											// the left
					runner.left = new Node(value);
					System.out.println(value); // printing new item added to the tree
					return; // New item has been added to the tree.
				} else // else corresponding to the nested if
					runner = runner.left;

			} // closing the if containing the nested if

			else { // else corresponding to the if condition in line 22.
					// This else refers to when value.compareTo(runner.value) >= 0 the value will be
					// placed in the right subtree

				if (runner.right == null) {// nested if inside the else
					// If there is an open space at runner.right, add the new node otherwise go down
					// to the right
					runner.right = new Node(value);
					System.out.println(value); // printing new item added to the tree
					return; // New item has been added to the tree.
				} else // else for the nested if condition
					runner = runner.right;
			}
			// System.out.println(runner); //use it to follow the trail of runner and how
			// items are added
		} // closing the while loop

	} // closing my method

	public void adding(String value) {
		add(value);
	}

	// end inorderPrint()

	public void inOrderTraversal(Node runner) {
		if (runner != null) {
			inOrderTraversal(runner.left);
			System.out.println(runner.value + " ");
			inOrderTraversal(runner.right);
		}
	}

}
