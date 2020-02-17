
import MamaMoney.AddNodes;
import MamaMoney.Node2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MamaMoneyTest {
    @Test
    public void shouldBeAbleToFindTheParentID() {
        Node2.Node node = new Node2.Node(15, 700, "NodeA");

        assertEquals(node.getParentID(), 700);
    }

    @Test
    public void shouldBeAbleToFindTheId() {
        Node2.Node node = new Node2.Node(15, 700, "NodeA");
        assertEquals(node.getId(), 15);
    }

    @Test
    public void shouldBeAbleToFindTheLable() {
        Node2.Node node = new Node2.Node(15, 700, "NodeA");
        assertEquals(node.getLable(), "NodeA");
    }

    @Test
    public void shouldAddNodesToTheList() {
        Node2.Node NodeA = new Node2.Node(0, 7000, "NodeA");
        Node2.Node NodeB = new Node2.Node(7000, 0, "NodeB");
        Node2.Node NodeC = new Node2.Node(5, 7000, "NodeC");
        Node2.Node NodeD = new Node2.Node(0, 5, "NodeD");
        Node2.Node NodeE = new Node2.Node(25, 0, "NodeE");


        AddNodes.addNode(NodeA);
        AddNodes.addNode(NodeB);
        AddNodes.addNode(NodeC);
        AddNodes.addNode(NodeE);
        AddNodes.addNode(NodeD);

        assertEquals(AddNodes.addList.toString(), "[{label= 'NodeA', id= 0, parentID= 7000}, {label= 'NodeB', id= 7000, parentID= 0}, {label= 'NodeC', id= 5, parentID= 7000}, {label= 'NodeE', id= 25, parentID= 0}, {label= 'NodeD', id= 0, parentID= 5}]");
    }

    @Test
    public void shouldAddTheParentsNodesToTheList() {
        Node2.Node NodeA = new Node2.Node(0, 7000, "NodeA");
        Node2.Node NodeB = new Node2.Node(7000, 0, "NodeB");
        Node2.Node NodeC = new Node2.Node(5, 7000, "NodeC");
        Node2.Node NodeD = new Node2.Node(0, 5, "NodeD");
        Node2.Node NodeE = new Node2.Node(25, 0, "NodeE");

        AddNodes.addNode(NodeA);
        AddNodes.addNode(NodeB);
        AddNodes.addNode(NodeC);
        AddNodes.addNode(NodeE);
        AddNodes.addNode(NodeD);
        System.out.println(AddNodes.getParentNodes());
        assertEquals(AddNodes.parentList, AddNodes.getParentNodes());

    }

    @Test
    public void shouldAddTheChildrenNodesToTheList() {
        Node2.Node NodeA = new Node2.Node(0, 7000, "NodeA");
        Node2.Node NodeB = new Node2.Node(7000, 0, "NodeB");
        Node2.Node NodeC = new Node2.Node(5, 7000, "NodeC");
        Node2.Node NodeD = new Node2.Node(0, 5, "NodeD");
        Node2.Node NodeE = new Node2.Node(25, 0, "NodeE");

        AddNodes.addNode(NodeA);
        AddNodes.addNode(NodeB);
        AddNodes.addNode(NodeC);
        AddNodes.addNode(NodeE);
        AddNodes.addNode(NodeD);

        assertEquals(AddNodes.childrenList, AddNodes.getChildrenNodes());


    }
//    @Test
//    public void shouldPrintTheTree() {
//        Node2.Node NodeA = new Node2.Node(0, 7000, "NodeA");
//        Node2.Node NodeB = new Node2.Node(7000, 0, "NodeB");
//        Node2.Node NodeC = new Node2.Node(5, 7000, "NodeC");
//        Node2.Node NodeD = new Node2.Node(0, 5, "NodeD");
//        Node2.Node NodeE = new Node2.Node(25, 0, "NodeE");
//
//        AddNodes.addNode(NodeA);
//        AddNodes.addNode(NodeB);
//        AddNodes.addNode(NodeC);
//        AddNodes.addNode(NodeE);
//        AddNodes.addNode(NodeD);
//
//        assertEquals(AddNodes.getChildrenNodes(), AddNodes.);
//
//
//    }

}






