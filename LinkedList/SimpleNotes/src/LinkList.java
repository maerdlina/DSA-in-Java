public class LinkList {

    private Link first;

    public void LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("List (first --> last)");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public Link find(int key){
        Link current = first;
        while(current.iData != key){
            if(current.next == null) return null;
            else current = current.next;
        }
        return current;
    }
}
