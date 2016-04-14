/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

/**
 *
 * @author suresh
 */
public class DeleteElementFromMiddle {
    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4,5};
        SingleLinkedList list = new SingleLinkedList(0);
        for(int i : input){
            list.add(i);
        }
        SingleLinkedList tmp = list;
        for(int i=0;i<3;i++){
            tmp = tmp.getNext();
        }
        if(tmp != null){
            tmp.data = tmp.getNext().data;
            tmp.setNext(tmp.getNext());
        }
        list.printList();
    }
    
}
