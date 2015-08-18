public class PriorityQueue  {

    // so that methods from my list are not accessible from this class
    private MyList myList;

    PriorityQueue(){
        myList = new MyList();
    }

    public int size(){
        return myList.size();
    }

    public void add(int j){
        for (int i = 0; i < size(); i++) {
            if (j < myList.PeekAt(i)){
              myList.AddAt(i, j);
                return;
            }
        }
        myList.AddToBack(j);
    }

    public int take(){
        return myList.takeItemFromFront();
    }

}
