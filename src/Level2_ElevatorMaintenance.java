import java.util.*;

public class Level2_ElevatorMaintenance {
         public static class BinaryTree{
         Node root;

         public String[] printInOrderToArray(){
             List<String> arrInOrder = new ArrayList<>();
             traverseInOrder(root, arrInOrder);

             String[] arr = new String[arrInOrder.size()];
             for(int i = 0; i < arrInOrder.size(); i++){
                 arr[i] = arrInOrder.get(i);
             }

             return arr;
         }

         private void traverseInOrder(Node node, List<String> arrInOrder) {
             if (node != null) {
                 traverseInOrder(node.left, arrInOrder);
                 arrInOrder.add(node.value);
                 traverseInOrder(node.right, arrInOrder);
             }
         }

         public void add(String value) {
             root = addRecursive(root, value);
         }

         private Node addRecursive(Node current, String value) {
             if (current == null) {
                 return new Node(value);
             }

             if (nodeValueIsLarger(current.value, value)) {
                 current.left = addRecursive(current.left, value);
             }
             else {
                 current.right = addRecursive(current.right, value);
             }

             return current;
         }

         private boolean nodeValueIsLarger(String nodeValue, String newValue){
             String[] nodeArr = nodeValue.split("[.]");
             String[] newArr = newValue.split("[.]");
             int len = Math.min(nodeArr.length, newArr.length);

             for(int i = 0; i < len; i++){
                 if(Integer.parseInt(nodeArr[i]) != Integer.parseInt(newArr[i])){
                     return Integer.parseInt(nodeArr[i]) > Integer.parseInt(newArr[i]);
                 }

             }

             if(nodeArr.length != newArr.length){
                 return nodeArr.length > newArr.length;
             }

             return false;
         }
     }

     static class Node {
         String value;
         Node left;
         Node right;

         Node(String value) {
             this.value = value;
             right = null;
             left = null;
         }
     }

     public String[] solution(String[] l) {
         // Your code here
         BinaryTree myTree = new BinaryTree();
         // save inputs into bst
         for(String str : l){
             myTree.add(str);
         }
         // read in order
          return myTree.printInOrderToArray();
     }
}
