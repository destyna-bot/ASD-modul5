
package Single_Linked_List_Non_Circular;

public class SinglyLinkedListApp {
     public static void main(String[] ar )
   {
       SinglyLinkedList lk = new SinglyLinkedList();
       lk.insertAwal(100);
       lk.display();
       lk.insertAkhir(200);
       lk.display();
       lk.insertAwal(50);
       lk.display();
       lk.insertAtPos(80, 2);
       lk.display();
       lk.deleteAtPos(1);       //untuk menghapus 50
       lk.display();
   }
}
