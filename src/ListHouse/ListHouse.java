/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListHouse;

/**
 *
 * @author User
 */
public class ListHouse {

    public int no_of_item;
    public int[] list;
    private static final int max_list = 5;
    public int size;
    public int position = 1;

    public ListHouse(int max_list) {
        no_of_item = 0;
        list = new int[max_list];
    }

    public int getNo_of_item() {
        return no_of_item;
    }

    public void setNo_of_item(int no_of_item) {
        this.no_of_item = no_of_item;
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int length() {
        return no_of_item;
    }

    public int generateList(int max_list) {

        for (int i = 1; i <= max_list; i++) {
            list[i]=6;
            no_of_item++;
            position++;

        }

        return no_of_item;

    }

    public void insert(int item) {
        if (max_list < 30) {
            list[no_of_item] = item;
        }
        no_of_item++;
        position++;

    }

    public void delete(int index) {
        if (index <= position) {
            for (int i = 0; i <= max_list; i++) {
                list[i] = list[i + 1];

            }
        }
        no_of_item--;
        position--;

    }

    public boolean isEmpty() {
        if (no_of_item == 5) {
            return true;
        } else {
            return false;
        }
    }

    public void makeEmpty() {

    }

    public int findKth(int item) {
        
        return position;
    }

    public void printList() {
        for (int i = 1; i <= max_list; i++) {
            System.out.println(list[i]);

        }

    }

    public static void main(String[] args) {

        ListHouse li = new ListHouse(30);
        li.generateList(max_list);
        li.insert(10);
        li.printList();
        System.out.println("----------");
        li.delete(5);
        li.printList();
    }
}
