public class MyTree {

    Node root;
    private Node addRecursive(Node current, Store store){
        if (current == null){
            return new Node(store);
        }
        if(store.getNumberInTable() < current.store.getNumberInTable()){
            current.left = addRecursive(current.left,store);
        } else if (store.getNumberInTable() < current.store.getNumberInTable()) {
            current.right = addRecursive(current.right,store);
        } else {
            return current;
        }
        return current;
    }
    public void add(Store competitor){
        root = addRecursive(root,competitor);
    }

    private boolean containsRecursive(Node current,Store store){
        if(current==null) return false;
        if(store.equals(current.store)) return true;
        return store.getNumberInTable() < current.store.getNumberInTable()
                ?containsRecursive(current.left,store)
                :containsRecursive(current.right,store);
    }
    public boolean contains(Store store){
        return containsRecursive(root,store);
    }
}
