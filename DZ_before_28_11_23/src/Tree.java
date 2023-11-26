public class Tree
{
    class Element
    {
        protected int Data;
        protected Element Left;
        protected Element Right;
        public Element(int data) {
            Data = data;
            Left = null;
            Right = null;
            // System.out.println("EConstructor:\t" + Integer.toHexString(hashCode()));
        }

        @Override
        protected void finalize()  {

            //         super.finalize();

            // System.out.println("EDestructor:" + Integer.toHexString(hashCode()));

        }
    }

    protected Element Root;

    public Element getRoot() {
        return Root;
    }

    public Tree()
    {
        Root = null;
        System.out.println("TConstructor\t" + Integer.toHexString(hashCode()));
    }

    public Tree(int[] arr)
    {
        for (int i: arr)
        {
            insert(i, Root);
        }
        System.out.println("Constructor:\t" + Integer.toHexString(hashCode()));
    }


    public void insert(int Data)
    {
        insert(Data, Root);
    }

    private void insert(int Data, Element Root)
    {
        if (this.Root == null)this.Root = new Element(Data);
        if (Root == null)return;
        if(Data < Root.Data)
        {
            if(Root.Left == null)Root.Left = new Element(Data);
            else insert(Data, Root.Left);
        }
        else
        {
            if(Root.Right ==null)Root.Right = new Element(Data);
            else insert(Data, Root.Right);
        }
    }

    public void erase(int Data)     //удаляет элемент с заданным значением
    {
        erase(Data, Root);
    }

    private Element erase(int Data, Element Root) {
        if (Root == null) {
            return Root;
        }
        if (Data < Root.Data) {
            Root.Left = erase(Data, Root.Left);
        } else if (Data > Root.Data) {
            Root.Right = erase(Data, Root.Right);
        } else {
            if (Root.Left == null) {
                return Root.Right;
            } else if (Root.Right == null) {
                return Root.Left;
            }
            Root.Data = minValue(Root.Right);
            Root.Right = erase(Root.Data, Root.Right);
        }
        return Root;
    }

    public void clear()
    {
        Root = null;
        System.gc();     // Garbage Collektor - сборщик мусора
    }

    public int minValue()
    {
        return minValue(Root);
    }

    private int minValue(Element Root)
    {
       /* if (Root.Left == null)return Root.Data;
        else return minValue(Root.Left);*/                                                         // через if

        if (Root == null)return 0;
        return Root.Left == null ? Root.Data : minValue(Root.Left);    // через тернарник

    }

    public int maxValue ()
    {
        return maxValue(Root);
    }

    private int maxValue(Element Root)
    {
        /*if (Root.Right == null)return Root.Data;
        else return maxValue(Root.Right);*/                                                             // через if
        if (Root == null)return 0;
        return Root.Right == null ? Root.Data : maxValue(Root.Right);       // через тернарник
    }

    public int sum()
    {
        return sum(Root);
    }

    private int sum(Element Root)
    {
       /* if (Root == null)return 0;                                        // через if
        else return sum(Root.Left) + sum(Root.Right) + Root.Data;*/
        return Root == null ? 0 : sum(Root.Left) + sum(Root.Right) + Root.Data;  // через тернарник
    }

    public int count()
    {
        return count(Root);
    }

    private int count(Element Root)
    {
        /*if (Root == null)return 0;                                              // через if
        else return count(Root.Left) + count(Root.Right) + 1;*/
        return Root == null ? 0 : count(Root.Left) + count(Root.Right) + 1;       // через тернарник
    }

    public double avg()
    {
        return (double) sum(Root)/count(Root);
    }

    public int depht()
    {
        return depht(Root);
    }

    private int depht(Element Root)
    {
        if (Root == null)return 0;
        /*if (depht(Root.Left) + 1 >depht(Root.Right) + 1)  // через IF
            return depht(Root.Left) + 1;
        else
            return depht(Root.Right) + 1;*/

        int l_depth = depht(Root.Left) +1;
        int r_depth = depht(Root.Right) + 1;
        return  l_depth > r_depth ? l_depth : r_depth;   // через тернарник
    }
    public void print()
    {
        print(Root);
        System.out.println();
    }
    private void print(Element Root)
    {
        if (Root == null)return;
        print(Root.Left);
        System.out.print(Root.Data + "\t");
        print(Root.Right);
    }
}
