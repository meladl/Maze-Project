//Maze Project
//Mohamed Eladl, Piyush Sharma, & Tejinder Mann

public class Link {
    
    public Location dData;
    public Link next;
    public Link previous;
    
    public Link(Location data){
        dData = data;
    }
    
    public void displayLink(){
        System.out.print(dData + " ");
    }
}
