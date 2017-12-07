/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maloof
 */
public class A5Q2 {

    private int numItems;
    private int[] array;

    public A5Q2() {
        numItems = 0;
        array = new int[10];

    }

    public void add(int index, int num) {
        // if the array is too small to fit the number
        if (numItems + 1 >= array.length) {
            // we make an array twice as big
            int[] temp = new int[array.length * 2];
            // we copy the old array into the new array
            System.arraycopy(array, 0, temp, 0, array.length);
            // after we copy the array we make the main array, 'array' equal temp
            array = temp;
        }
        array[index] = num;

        numItems++;

    }
    // sets number at index to zero, removes number from list
    public void remove(int index) {
        array[index] = 0;
        numItems--;
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
        if (numItems > index) {
            return array[index];
        } else {
            return -999;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q2 list = new A5Q2();

        list.add(0, 1);
        list.add(2, 3);
        list.add(1, 33);
        
        list.remove(2);
    }

}
