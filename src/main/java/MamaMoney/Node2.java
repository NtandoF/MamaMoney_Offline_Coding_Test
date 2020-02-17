package MamaMoney;

public class Node2<N> {

  public static class Node<M> {
        private int id;
        int parentID;
        String label;

        public Node(int id, int parentID, String lable) {
            this.id = id;
            this.parentID = parentID;
            this.label = lable;
        }


        public int getParentID(){
            return parentID;
        }

        public void setParentID(int parentID) {
            this.parentID = parentID;
        }

        public String getLable(){
            return label;
        }

        public void setLable(String lable) {
            this.label = lable;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "{label= '" + label + '\'' + "" +
                    ", id= " + id +
                    ", parentID= " + parentID + "" +
                    '}';
        }
    }
}


