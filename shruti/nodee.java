package com.shruti;

public class nodee {
    private node head;
    private node tail;
    private int size;
     public nodee(){
         this.size=0;

     }
     public void Insert(int val){
         node n=new node(val);
         n.next=head;
         head=n;

         if(tail==null){
             tail=head;
         }
         size+=1;

     }
     public void Insertval(int val){
         if(tail==null){
             Insert(val);
             return;
         }
         node n=new node(val);
         tail.next=n;
         n=tail;
         size++;

     }
     public void display(){
         node temp=head;
         while (temp!=null){
             System.out.print(temp.val+" --> ");
             temp=temp.next;
         }
         System.out.println("end");
     }


    private class node{
        private int val;
        private node next;
        public node(int val){
            this.val=val;
        }
        public node(int val,node next){
            this.val=val;
            this.next=next;
        }
    }

}
