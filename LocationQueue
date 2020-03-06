
//Mohamed Eladl, Piyush Sharma, & Tejinder Mann


public class LocationQueue {

    LinkedList locList = new LinkedList();

    public void enQueue(Location loc){
        locList.insertLast(loc);
    }

    public Location deQueue(){
        if(!locList.isEmpty()){
            return locList.removeFirst();
        }
        else {
            return null;
        }
    } 

    public void displayQueue(){
        locList.displayList();
        System.out.println();
    }

    public boolean isEmpty(){
        return locList.isEmpty();
    }
}
