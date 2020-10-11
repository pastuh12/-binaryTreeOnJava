public class List {
    List next;
    Leaf words;
    public void List(){
        Leaf element = new Leaf();
        List next = new List();
        this.next = next;
    }
    List jump(List p){
        return p.next;
    }

    public List getNext() {
        return next;
    }

    public Leaf getWords() {
        return words;
    }
}
