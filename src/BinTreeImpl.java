public class BinTreeImpl implements BinTree {

	private class TreeNode {
		Object key;
		BinTree left, right;

		public TreeNode(Object key) {
			this.key = key;
			left = right = null;
		}
	}

	private TreeNode root;

	public BinTreeImpl() {
		root = null;
	};

	public BinTreeImpl(Object k) {
		root = new TreeNode(k);
	}

	public BinTreeImpl(BinTree left, Object k, BinTree right) {
		root = new TreeNode(k);
		if (left != null)
			root.left = left;
		if (right != null)
			root.right = right;
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public Object getValue() {
		if (isEmpty())
			throw new RuntimeException("Baum ist leer");
		return root.key;
	}

	@Override
	public BinTree getLeft() {
		if (isEmpty())
			throw new RuntimeException("Baum ist leer");
		return root.left;
	}

	@Override
	public BinTree getRight() {
		if (isEmpty())
			throw new RuntimeException("Baum ist leer");
		return root.right;
	}

	public String toString() {
		boolean needParentheses = //
				getLeft() != null && !getLeft().isEmpty() //
						&& getRight() != null && !getRight().isEmpty();

		StringBuffer sb = new StringBuffer();

		if (needParentheses)
			sb.append("(");

		if (getLeft() != null && !getLeft().isEmpty())
			sb.append(getLeft().toString());

		if (getValue() != null)
			sb.append(getValue());
		else
			sb.append("NULL");

		if (getRight() != null && !getRight().isEmpty())
			sb.append(getRight().toString());

		if (needParentheses)
			sb.append(")");

		return sb.toString();
	}

}