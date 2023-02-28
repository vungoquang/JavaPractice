import java.util.LinkedList;

public class DataStructure {

    // Representation of a node
    static class Node
    {
        int data;
        Node next;
    };
    static Node root;
    // Function to insert node
    // Function to insert node
    static Node insert(Node root, int item)
    {
        Node temp = new Node();
        temp.data = item;
        temp.next = root;
        root = temp;
        return root;
    }
    static void display(Node root)
    {
        while (root != null)
        {
            System.out.print(root.data + " ");
            root = root.next;
        }
    }
    public static int arrayToList(int arr[])
    {
        root = null;
        int lenght=0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] != -1){
                root = insert(root, arr[i]);
                lenght++;
            }else{
                root=insert(root,arr[arr.length-1]);
                root=insert(root,arr[i]);
                lenght= lenght+2;
                break;
            }
        }
        display(root);
        return lenght;
    }

    public static void main(String[] args){
//        DataStructure object= new DataStructure();
//        arr.arrListLens(new int[] {1,4,-1,3,1,2});
//        System.out.println("lenght of list: " + object.arrayToList(new int[] {1,4,-1,3,2}));
//        Node root=object.arrayToList(new int[] {1,4,-1,3,2});
//        display(root);

            LinkedList<String> cars = new LinkedList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars);
            System.out.println(cars.size());


    }
}
