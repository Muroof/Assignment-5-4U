/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A5Q1 {

    private IntNode head;
    private int numItems;

    public A5Q1() {

        head = null;
        numItems = 0;
    }

    public void add(int num) {
        // start at beginning of list
        IntNode node = head;
        // see if it is the first item
        if (node == null) {
            // create node temp and assign num to it
            IntNode temp = new IntNode(num);
            // make head equal temp
            head = temp;

            // if the number is not the first item
        } else {
            // goes through the list until it finds the number one before it should be inserted
            while (node.getNext() != null && node.getNext().getNum() <= num) {
                node = node.getNext();

            }
            // create a node temp, and assign it num
            IntNode temp = new IntNode(num);
            // link the node
            temp.setNext(node.getNext());
            // assign the next node to temp
            node.setNext(temp);

        }
        // add one to numItems as a number was added
        numItems++;
    }

    // returns the size of the list
    public int size() {
        return numItems;
    }

    // returns a true or false if the list is empty
    public boolean isEmpty() {
        return numItems == 0;
    }

    // returns a number at a specific position 
    public int get(int index) {
        IntNode node = head;
        // move the number of times
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();

    }

    public void remove(int num) {
        IntNode node = head;
        // if removing from the start
        if (node.getNum() == num) {
            head = head.getNext();
            // if removing from the end
        } else if (num == (numItems - 1)) {
            // travel to the second last itme
            for (int i = 0; i < numItems - 1; i++) {
                node = node.getNext();
            }
            // sever the link
            node.setNext(null);

        } else {
            // runs through the list until it reaches one number behind the number desired
            while (num != node.getNext().getNum()) {
                node = node.getNext();
            }
            // node to remove
            IntNode toRemove = node.getNext();
            // its next node
            IntNode next = toRemove.getNext();
            // set all the links
            node.setNext(next);
            toRemove.setNext(null);

        }
        // decrease item counter
        numItems--;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q1 list = new A5Q1();
        list.add(-1);
        list.add(5);
        list.add(-4);
        list.add(2);
        list.add(15);

//        list.remove(2);
//        list.remove(-4);
//        list.remove(-1);
//        list.remove(5);
//        list.remove(15);
        System.out.println(list.isEmpty());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
