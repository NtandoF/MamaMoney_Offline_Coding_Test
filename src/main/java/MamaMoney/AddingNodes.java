package MamaMoney;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class AddNode extends Node2 {


    List<Node2.Node> addNodes = new ArrayList<>();



    public void add(int i, int b, String c) {
        addNodes.add(new Node2.Node(i, b, c));
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        AddNode node = new AddNode();

        while (true){

            System.out.println("Enter ID, ParentID and Lable:");

            int id = myObj.nextInt();
            int parentID = myObj.nextInt();
            myObj.nextLine();
            String lable = myObj.nextLine();

            node.add(id, parentID, lable);
            System.out.println( node.addNodes);
        }
    }
}
