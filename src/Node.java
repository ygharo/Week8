
public class Node {
	public String value;
	public Node left;
	public Node right;

	public Node(String value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public String toString() {
		return value;

	}

}