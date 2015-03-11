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
    public int size;
    public int position;

    public ListHouse(int item) {
        no_of_item = 10;
        list = new int[item];
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

    public int generateList(int a) {
        
        for (int i = 1; i == a; i++) {
            list[i] = 2 * 2 + list[i];
            no_of_item++;
            position++;
            printList(list);
        }

       return no_of_item;
       
    }

    public void insert(int item) {
        //for (int i = 1; i == list.length; i++) {
        //list[no_of_item] = new int(item);
        no_of_item++;
        position++;

       // }
    }

    public void delete() {
        for (int i = 0; i <= no_of_item; i++) {
            no_of_item--;
            position--;
        }

    }

    public void makeEmpty() {

    }

    public int findKth(String item) {
        return position;
    }

    public void printList(int a[]) {
        for (int i = 1; i <= no_of_item; i++) {
            System.out.println(a[i]);

        }

    }

    public static void main(String[] args) {

        ListHouse li = new ListHouse(100);
        li.generateList(10);
        //li.insert(10);
       

    }
}
