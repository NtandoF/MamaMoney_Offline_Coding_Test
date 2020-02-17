

import MamaMoney.AddNodes;
import MamaMoney.Node2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class CreatJsonFile {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("NodesTree.json"))
        {
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            Node2.Node nodeB = new Node2.Node(7, 7000,"nodeB");
            Node2.Node nodeC = new Node2.Node(80, 123, "NodeC");
            Node2.Node nodeA = new Node2.Node(7000, 0,"nodeA");
            Node2.Node nodeD = new Node2.Node(12, 7000,"nodeD");
            Node2.Node nodeE = new Node2.Node(800, 0,"nodeE");
            Node2.Node nodeF = new Node2.Node(70, 800,"nodeF");
            AddNodes addingNodes = new AddNodes();

           AddNodes.addNode(nodeA);
           AddNodes.addNode(nodeB);
           AddNodes.addNode(nodeC);
           AddNodes.addNode(nodeD);
           AddNodes.addNode(nodeE);
           AddNodes.addNode(nodeF);


            jsonArray.add(AddNodes.addList);
            PrintWriter pw = new PrintWriter("NodesTree.json");
            pw.write(jsonArray.toJSONString());

            pw.flush();
            pw.close();
            Object object = jsonParser.parse(String.valueOf(reader.read()));
            JSONObject jsonArray1 = (JSONObject) object;
            jsonArray.forEach(list -> {
                System.out.println(list.toString());
            } );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}




