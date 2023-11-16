public class List
{
    private class Element
    {
        private int Data;
        private Element Next;   //Указатель на следующий элемент списка
        private Element Prev;   //Previous - указатель на предыдущий элемент списка

        private static int count = 0;
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

        public Element getPrev() {
            return Prev;
        }

        public void setPrev(Element prev) {
            Prev = prev;
        }

        public Element(int Data) {
            this.Data = Data;
            count++;
            System.out.println("EConstructor:\t" + Integer.toHexString(hashCode()));
        }
        public Element(int Data, Element Next)
        {
            this.Data = Data;
            this.Next = Next;
            count++;
            System.out.println("EConstructor:\t" + Integer.toHexString(hashCode()));
        }

        @Override
        protected void finalize() {
//            super.finalize();
            count--;
            System.out.println("EDestructor:\t" + Integer.toHexString(hashCode()));
        }
    }
    private Element Head, Tail;
    private int size;

    public Element getHead() {
        return Head;
    }

    public Element getTail() {
        return Tail;
    }

    public int getSize() {
        return size;
    }

    public List()
    {
        Head = Tail = null;
        size = 0;
        System.out.println("LConstructor:\t" + Integer.toHexString(hashCode()));
    }

    //                          Adding elements:
    public void push_front(int Data)
    {
        if(Head == null && Tail == null)
        {
            Head = Tail = new Element(Data);
        }
        else
        {
            /*Element New = new Element(Data);
            New.setNext(Head);
            Head.setPrev(New);
            Head = New;*/
            Head = Head.Prev = new Element(Data, Head);
        }
        size++;
    }
    public void push_back(int Data)
    {
        if(Head == null && Tail == null)
        {
            Head = Tail = new Element(Data);
        }
        else
        {
            Element New = new Element(Data);
            New.setPrev(Tail);
            Tail.setNext(New);
            Tail=New;
        }
        size++;
    }

    //                  Removing elements:
    public void pop_front()
    {
        if(Head == null && Tail == null)return;
        else if(Head == Tail)
        {
            Head.finalize();
            Head = Tail = null;
        }
        else
        {
            Head = Head.Next;
            Head.Prev.finalize();
            Head.Prev = null;
        }
        size--;
    }
    public void pop_back()
    {
        if(Head == null && Tail == null)return;
        if(Head == Tail)
        {
            Tail.finalize();
            Head = Tail = null;
        }
        else
        {
            Tail = Tail.Prev;
            Tail.Next.finalize();
            Tail.Next = null;
        }
        size--;
    }
    //                  Methods:
    /*public void clear()
    {
        while (Head != null)pop_front();
    }*/
    public void print()
    {
        /*Element Temp = Head;    //Temp - это итератор.
        while(Temp != null)
        {
            System.out.print(Temp.Data+"\t");
            Temp = Temp.Next;
        }*/
        //for(Counter; Condition; Expression)
        //for(Iterator;Condition; Expression)
        for(Element Temp = Head; Temp != null; Temp = Temp.Next)
            System.out.print(Temp.Data + "\t");
        System.out.println("\nКоличество элементов списка: " + size);
        System.out.println("Общее количесто элементов: " + Element.count);
    }
    /*public void reverse_print()
    {
        for(Element Temp = Tail; Temp != null; Temp = Temp.Prev)
            System.out.print(Temp.Data + "\t");
        System.out.println("\nКоличество элементов списка: " + size);
        System.out.println("Общее количесто элементов: " + Element.count);
    }*/

    public void insert(int data, int pos) { //вставка элемента
        Element temp = new Element(data);
        if (pos == 1) {
            push_front(data);
        }
        else {
            Element curr = Head;
            int currPos = 1;
            while (curr != null && currPos < pos) {
                curr = curr.Next;
                currPos++;
            }
            if (curr == null) {
                push_back(data);
            }
            else {
                temp.Next = curr;
                temp.Prev = curr.Prev;
                curr.Prev.Next = temp;
                curr.Prev = temp;
            }
        }
        size++;
    }

    public void erase(int pos) { //удаляет элемент
        if (Head == null) {
            return;
        }

        if (pos == 1) {
            pop_front();
            return;
        }

        Element curr = Head;
        int count = 1;

        while (curr != null && count != pos) {
            curr = curr.Next;
            count++;
        }

        if (curr == null) {
            System.out.println("Неверный индекс");
            return;
        }

        if (curr == Tail) {
            pop_back();
            return;
        }
        curr.Prev.Next = curr.Next;
        curr.Next.Prev = curr.Prev;
        curr.Prev = null;
        curr.Next = null;
        size--;

    }
}
