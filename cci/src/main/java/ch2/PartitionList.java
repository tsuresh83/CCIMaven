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
public class PartitionList {
    public static void main(String[] args){
        int[] input = new int[]{4,3,4,2,3,4};
        SingleLinkedList list = new SingleLinkedList(1);
        for(int i : input){
            list.add(i);
        }
        list.printList();
        partitionList(list,2).printList();
    }
    static SingleLinkedList partitionList (SingleLinkedList list, int partition){
        SingleLinkedList partitionedList = null;
        SingleLinkedList tmp = list;
        if(tmp == null){
            return null;
        }
        int ctr = 0;
        while(tmp !=null){
            if(tmp.getData()<=partition){
                if(partitionedList == null){
                    partitionedList = new SingleLinkedList(tmp.getData());
                }else{
                    partitionedList.add(tmp.getData());
                }
                System.out.println("data "+tmp.getData());
            }
            tmp = tmp.getNext();
        }
        //partitionedList.add(partition);
        tmp = list;
        while(tmp != null){
            if(tmp.getData()>partition){
                partitionedList.add(tmp.getData());
            }
            tmp = tmp.getNext();
        }
        return partitionedList;
    }
}
