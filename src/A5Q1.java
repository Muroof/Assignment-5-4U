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
        // strt at beginning of lista
        IntNode node = head;
        // see if it is first item
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
            numItems++;
        } else if (numItems > 0) {
                if (node.getNum() > num) {
                    IntNode temp = new IntNode(num);
                    temp.setNext(node);
                    head = temp;
                    numItems++;
                }
//                if (node.getNum() < num) {
//                    IntNode temp = new IntNode(num);
//                    temp.setNext(node);
//                    head = temp;
//                    numItems++;
//                }

//                if (node.getNum() <= num) {
//                }
            }

//        else while(node.getNum() <= num) {
//                // travel to the next node
//                node = node.getNext();
//            }
//            // node is the last node in the list
//            // create the new node
//            IntNode temp = new IntNode(num);
//            // insert it into the list
//            node.setNext(temp);
            // increase the size counter

        }
    

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int index) {
        IntNode node = head;
        // move the number of times
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();

    }

//    public void remove(int num) {
//        // if removing from the start
//        if (num == 0) {
//            head = head.getNext();
//        } else if (pos == numItems - 1) {
//            // removing from the end
//            IntNode node = head;
//            for (int i = 0; i < numItems - 1; i++) {
//                node = node.getNext();
//            }
//            // sever the link
//            node.setNext(null);
//        } else {
//            IntNode node = head;
//            // move to teh spot just before
//            for (int i = 0; i < pos - 1; i++) {
//                node = node.getNext();
//            }
//            // node to remove
//            IntNode toRemove = node.getNext();
//            // its next node
//            IntNode next = toRemove.getNext();
//            // set all the links
//            node.setNext(next);
//            toRemove.setNext(null);
//
//
//
//        }
//        // decrease item counter
//        numItems--;
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q1 list = new A5Q1();
        list.add(4);
        list.add(2);
        

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
