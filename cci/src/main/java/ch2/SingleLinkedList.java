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
public class SingleLinkedList {
    int data;
    SingleLinkedList next;
    SingleLinkedList(int data){
        this.data = data;
    }
    SingleLinkedList(){
        
    }
    SingleLinkedList getNode(){
        return this;
    }
    SingleLinkedList getNext(){
        return this.next;
    }
    void setNext(SingleLinkedList node){
        this.next=node;
    }
    void add(int data){
        SingleLinkedList tmp = this;
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
        }
        SingleLinkedList nn = new SingleLinkedList(data);
        tmp.next = nn;
       
    }
    int getData(){
        return this.data;
    }
    SingleLinkedList delete(SingleLinkedList list,int data){
        SingleLinkedList head = list;
        int ctr = 0;
        if(head != null && head.getData()==data){
            return head.getNext();
        }
        SingleLinkedList tmp = list;
        while(tmp.getNext()!= null &&
                tmp.getNext().getData()!=data){
            tmp = tmp.getNext();            
        }
        if(tmp.getNext() !=null && tmp.getNext().getData()==data){
            tmp.setNext(tmp.getNext().getNext());
            return head;
        }
        return head;
    }
    @Override
    public String toString(){
        return ""+this.data;
    }
    public static void main(String[] args){
        int[] test = {2,3,4};
        SingleLinkedList list = new SingleLinkedList(1);
        for(int t : test){
            list.add(t);
        }
        list.printList();
        list.add(5);
        list = (list.delete(list,0));
        list.printList();
        list = (list.delete(list,1));
        list.printList();
    }
    void printList(){
         SingleLinkedList tmp = this;
        while(true){
            System.out.println(tmp);
            tmp = tmp.getNext();
            if(tmp == null){
                break;
            }
        }
    }
}


