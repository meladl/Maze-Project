//Mohamed Eladl, Piyush Sharma, & Tejinder Mann


public class LinkedList {
    private Link first;               
    private Link last;              

    public LinkedList(){

        first = null;                 
        last = null;

    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(Location dd){

        Link newLink = new Link(dd);  

        if (isEmpty()){
            last = newLink;            
        } 

        else {
            first.previous = newLink;  
        }

        newLink.next = first;         
        first = newLink;             

    }

    public  void insertLast(Location dData){
        Link newLink = new Link(dData);  
        if (isEmpty()){
            newLink.next = null;
            first = newLink;            
            last = newLink;

        } 

        else {
            last.next = newLink;       
            last = newLink;
            last.next = null;   
        }
        last = newLink;                
    }

    // -------------------------------------------------------------
    public Location deleteFirst(){                              
        Link temp = first;
        if (first != null) {
            if (first.next == null) {
                last = null;               
            }
            first = first.next;
            temp.next = null;
            return temp.dData;

        } 

        else {
            return null;
        }

    }

    public Link deleteLast() {                              
        Link temp = last;
        if (first.next == null){
            first = null;               
        } 
        else {
            last.previous.next = null;
        }

        last = last.previous;         
        return temp;

    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link current = last;         
        while (current != null){
            current.displayLink();     
            current = current.previous; 

        }

        System.out.println("");

    }

    public Location removeFirst() {
        Link temp = first;
        if (first != null) {
            if (first.next == null) {
                last = null;
            }
            first = first.next;
            temp.next = null;
            return temp.dData;
        } 

        else {
            return null;
        }

    }

    public void displayList() {
        Link current = first;
        while (current != null) {

            current.displayLink();
            current = current.next;

        }

    }

}

