package MamaMoney;



import java.util.*;

 public class AddNodes {

     public static List<Node2.Node> addList = new ArrayList<>();
     public static List<Node2.Node> parentList = new ArrayList<>();
     public  static  List<Node2.Node> childrenList = new ArrayList<>();

    public static List getParentNodes() {
        for (int i = 0; i < addList.size() ; i++) {
            for (int j = 1; j < addList.size() ; j++) {
                if (addList.get(i).getId() == addList.get(j).getParentID()) {
                    if (parentList.contains(addList.get(i))) {
                        continue;
                    }
                    parentList.add(addList.get(i));
                    System.out.println( parentList.add(addList.get(i)));
                }
            }
        }
        return parentList;
    }

    public static List getChildrenNodes() {
        for (int i = 0; i < addList.size() ; i++) {
            for (int j = 1; j < addList.size() ; j++) {
                if (addList.get(i).getId() == addList.get(j).getParentID()) {
                    if (childrenList.contains(addList.get(i))) {
                        continue;
                    }
                    childrenList.add(addList.get(i));
                    System.out.println( childrenList.add(addList.get(i)));
                }
            }
        }
        return parentList;
    }

  public void printTree(List <Node2.Node> nodes) {
        Map<Integer, Node2.Node> map = new HashMap<>();

        int i = 0;
        int j = 0;

        while (i < addList.size()){
            int currnItem = addList.get(i).getId();
            while (j < addList.size()){
                if (currnItem == addList.get(j).getParentID()){
                   map.put(currnItem, addList.get(j));
                }
            }
        }
    }



    public static String addNode(Node2.Node node) {
        if (!addList.contains(node)) {
            addList.add(node);
            return "Node is successfully added";
        } else {
            return "The node is already exist";
        }

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        AddNodes node = new AddNodes();

        while (true){

            Node2.Node node1 = new Node2.Node(2, 15, "NodeA");
            Node2.Node node2 = new Node2.Node(0, 20, "NodeB");


            System.out.println( node.addList);
        }
    }
}
