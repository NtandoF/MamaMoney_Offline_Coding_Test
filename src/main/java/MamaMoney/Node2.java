package MamaMoney;

public class Node2{

  public static class Node<M> {
        private int id;
        int parentID;
        String lable;

        public Node(int id, int parentID, String lable) {
            this.id = id;
            this.parentID = parentID;
            this.lable = lable;
        }
        public int getParentID(){
            return parentID;
        }

        public void setParentID(int parentID) {
            this.parentID = parentID;
        }

        public String getLable(){
            return lable;
        }

        public void setLable(String lable) {
            this.lable = lable;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "{lable= '" + lable + '\'' + "" +
                    ", id= " + id +
                    ", parentID= " + parentID + "" +
                    '}';
        }
    }
}


