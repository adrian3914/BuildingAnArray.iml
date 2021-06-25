package com.example.arraysdemo;

/*
    Array Class from Scratch
 */

public class Array {
    private int[] items;
    private int count;

    // constructor
    public Array(int length) {
        this.items = new int[length];
    }

    public void insertItem(int item){

        // add the new item at the end
        items[count++] = item;

        // if array is full, resize it
        if (items.length == count){
            // Create a new array (2x the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            // set "items to this new array
            items = newItems;
        }
    }

    // remove item at specific index
    public void removeAt(int index){
        // Validate the index
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        // Shift the items to the left
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        // decreasing the number of items
        count--;
    }

    // printArray
    public void printArray(){
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    // indexOf
    public int indexOf(int item) {
        // Loop and if we find the item in the array we return the index
        // Otherwise we return -1
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    } // end method indexOf

    // Array.max()
    public int max(){

        int max = items[0];

        for (int i = 1; i < count; i++)
        {
            if (items[i] > max)
            {
                max = items[i];
            }
        }
        return max;
    }

    //Array.reverse()
    public void reverse(){
        int[] reversedArray = new int[count];
        int index = count - 1;

        for (int i = 0; i < count; i++){
                reversedArray[index] = items[i];
                index--;
        }
        items = reversedArray;

    } // end method reverse

    // Solution: Array.insertAt()
    public void insertAt(int item, int index){
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
            items[index] = item;
    }


} // end Class Array
