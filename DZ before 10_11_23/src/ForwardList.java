public class ForwardList
{
    Element Head;

    public ForwardList()

    {
        this.Head = null;
        System.out.println("LConstructor:\t" + Integer.toHexString(this.hashCode()));
    }

    public void push_front(int Data)  // начало списка
    {
        Element New = new Element(Data);
        New.setNext(Head);
        Head = New;
    }
    public void push_back(int Data)   //  добавляет значение в конец списка
    {
        if (Head == null)
        {
            push_front(Data);
            return;                  //  без return функция отработает дважды
                                     // и запишет первое значение два раза
        }
        Element Temp = Head;
        while (Temp.getNext() != null )Temp = Temp.getNext();  // 1 Доходим до конца списка

        Temp.setNext(new Element(Data)); // 2 Добавляем элемент в конец списка
    }

    public void pop_front()  //  удаляет началный элемент списка
    {
        Head = Head.getNext();
    }

    public void  pop_back()   //  удаляет последний элемент списка
    {
        Element Temp = Head;
        while (Temp.getNext().getNext() != null)Temp = Temp.getNext(); // вызываем  два раза getNext()
                                                                       // оказываемся на предпоследнем элементе
        Temp.setNext(null);
    }


    public void print()  // заполняем список
    {
        Element Temp = Head;  // Temp - итератор или указатель, при помощи котрого можно получить доступ к началу списка
        while (Temp != null)
        {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
        System.out.println();
    }
}
