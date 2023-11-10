public class Element {
    int Data;
    Element Next;

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Element getNext() {
        return Next;
    }

    public void setNext(Element next) {
        Next = next;
    }
    public Element(int Data)
    {
        setData(Data);
        setNext(null);
        System.out.println("EConstructor:\t" + Integer.toHexString(this.hashCode()));

    }

    public Element(int Data, Element Next)
    {
        setData(Data);
        setNext(Next);
        System.out.println("EConstructor:\t" + Integer.toHexString(this.hashCode()));
    }
}
