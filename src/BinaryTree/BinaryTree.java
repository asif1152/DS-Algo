package BinaryTree;

import java.util.HashSet;

public class BinaryTree {

    Node root;

    public BinaryTree(){
        this.root = null;
    }
    public BinaryTree(Node root){
        this.root = root;
    }

    private String dupSubUtil(Node root, HashSet<String> subtrees, Boolean[] found){

        if(root == null){
            return "$";
        }

        String ltr = dupSubUtil(root.left, subtrees, found);
        if(found[0])
            return "";
        String rtr = dupSubUtil(root.right, subtrees, found);
        if(found[0])
            return "";

        String subT = root.data + "#" + ltr + "#" + rtr;
        if(subtrees.contains(subT) && subT.length() > 5){
            found[0] = true;
            return "";
        }
        subtrees.add(subT);
        return subT;
    }
    public boolean dupSub(Node root){

        HashSet<String> subtrees= new HashSet<>();
        Boolean[] found = new Boolean[]{false};
        dupSubUtil(root, subtrees, found);
        return found[0];
    }

    private int getDiaUtil(Node root, int[] dia){

        if(root == null)
            return 0;

        int lh = getDiaUtil(root.left, dia);
        int rh = getDiaUtil(root.right, dia);
        int h = Math.max(lh, rh) +1; // height of subTree

        int diaTemp = lh + rh +1;
        if(diaTemp > dia[0]){
            dia[0] = diaTemp;
        }
        return h;
    }

    public int getDiameter(Node root){

        int[] dia = new int[]{0};

        getDiaUtil(root, dia);
        return dia[0];
    }
}
