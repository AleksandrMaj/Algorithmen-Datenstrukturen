package Testat1;

/**
 * This class implements the nodes, which are important for the data structures
 * @author Aleks
 */

public class Node {
    private Object element;
    private Node next;

    /**
     * The constructor to create a node.
     * @param element Your data.
     * @param next A reference to the next node.
     */
    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    /**
     * This method returns the saved data object of the node.
     * @return The data object.
     */
    public Object getElement() {
        return element;
    }

    /**
     * This method returns the node, this node is referencing to.
     * @return The referenced node.
     */
    public Node getNext() {
        return next;
    }

    /**
     * This method sets the data value that should be saved in this node.
     * @param element The value that should be saved in this node.
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * This method sets the node, this node should reference.
     * @param next The node, that should be referenced.
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
