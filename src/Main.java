import BinaryTree.BinaryTree;
import BinaryTree.Node;
import Stack.MaxSpan;
import Stack.NextGreaterEle;
import Stack.TwoStackInArray;
import graph.Graph;
import leetcode.dynamicprogramming.Solution_1046;
import leetcode.twoPointer.Solution_795;
//import leetcode.dynamicprogramming.Solution_673;
//import leetcode.dynamicprogramming.Solution_688;
//import leetcode.dynamicprogramming.Solution;
//import leetcode.dynamicprogramming.Solution_174;
//import leetcode.graph.Soluton_802;
//import leetcode.graph.Solution;
//import leetcode.graph.Solution_743;
//import leetcode.graph.Soluton_542;

import javax.print.attribute.standard.PrinterResolution;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        LinkedList list = new LinkedList();
//        list.addNode(1);
//        list.addNode(2);
//        list.addNode(3);
//        list.addNode(4);
//        list.addNode(5);
//        list.addNode(6);
//        list.addNode(7);
//        list.addNode(8);
//        list.addNode(9);

//        list.printList();
//
//        list.reverse();
//        list.printList();
//        System.out.printf("MiddleNode is: %d\n",list.getMiddleNode().getData());
//        list.deleteAlt();
//        list.printList();
//        list.pairSwap();
//        list.printList();
//        list.deleteKthNode(2);
//        list.printList();
//        list.sortAbsoluteGiven();
//        list.printList();
//
//        list.revGrpK(3);
//        list.printList();
//
//        list.rotateCounterClock(3);
//        list.printList();

//        list.rotateBlock(4, 2);
//        list.printList();
//
//        System.out.printf("head data is: %d\n",list.getHead().getData());
//        System.out.printf("tail data is: %d\n",list.getTail().getData());

//        MinStackImpl minStack = new MinStackImpl(4);
//
//        minStack.push(3);
//        minStack.push(4);
//        System.out.printf("Min ele is: %d\n", minStack.getMin());
//        minStack.push(5);
//        minStack.push(1);
//        System.out.printf("Min ele is: %d\n", minStack.getMin());
//        minStack.getSize();
//        System.out.printf("top ele is: %d\n", minStack.pop());
//        System.out.printf("Min ele is: %d\n", minStack.getMin());
//        minStack.push(-1);
//        System.out.printf("Min ele is: %d\n", minStack.getMin());
//
//        TwoStackInArray twoStackInArray = new TwoStackInArray(4);
//        twoStackInArray.push1(1);
//        twoStackInArray.push1(2);
//        twoStackInArray.push2(3);
//        twoStackInArray.push2(4);
//        System.out.printf("top ele is: %d\n", twoStackInArray.pop1());
//        System.out.printf("top ele is: %d\n", twoStackInArray.pop2());
//        System.out.printf("top ele is: %d\n", twoStackInArray.pop1());
//        System.out.printf("top ele is: %d\n", twoStackInArray.pop2());
//        twoStackInArray.push1(6);
//        twoStackInArray.push2(7);
//        System.out.printf("top ele is: %d\n", twoStackInArray.pop1());
//        System.out.printf("top ele is: %d\n", twoStackInArray.pop2());
//        int[] price = {10, 4, 5, 90, 120, 80};
//        MaxSpan.calculateSpan(price, 6);
//
//        price = new int[]{100, 80, 60, 70, 60, 75, 85};
//        MaxSpan.calculateSpan(price, 7);
//        int arr[] = new int[]{13 , 7, 6 , 12};
//        NextGreaterEle.findNGE(arr, 4);

//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(2);
//        root.left.left = new Node(4);
//        root.right.left = new Node(4);
//
//        BinaryTree bt = new BinaryTree();
//        if(bt.dupSub(root)){
//            System.out.println("Tree contains duplicate");
//        }else{
//            System.out.println("Tree does not contain duplicate");
//        }
//
//        int dia = bt.getDiameter(root);
//        System.out.printf("Diameter of the binary tree is: %d\n", dia);

//        Graph graph = new Graph(4);
//        graph.addEdge(1, 2); // 1-based index
//        graph.addEdge(1, 3);Solution
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 4);
//        graph.bfs(1); // 0 based index

//        Solution s = new Solution();
//        List<List<String>> eq = new LinkedList<>();
//        List<String> st1= new LinkedList<>();
//        st1.add("a");
//        st1.add("b");
//        eq.add(st1);
//
//        List<String> st2= new LinkedList<>();
//
//        st2.add("b");
//        st2.add("c");
//        eq.add(st2);
//
//        //st.clear();
//
//        List<List<String>> qr = new LinkedList<>();
//        List<String> st3= new LinkedList<>();
//        st3.add("a");
//        st3.add("c");
//        qr.add(st3);
//        s.calcEquation(eq, new double[]{2.0, 3.0}, qr);

//        Soluton_542 s = new Soluton_542();
//        int mat[][] = {{0,0,0},{0,1,0},{1,1,1}};
//        s.updateMatrix(mat);

//        Solution_743 s = new Solution_743();
//        int times[][] = new int[][] {{2,1,1}, {2,3,1}, {3,4,1}};
//        int ans = s.networkDelayTime(times, 4, 2);
//        System.out.printf("ans is: %d", ans);
//        Soluton_802 s = new Soluton_802();
//        int tmpGraph[][] = new int[][]{{1,2}, {2,3}, {5}, {0}, {5}, {}, {}};
//        System.out.println(s.eventualSafeNodes(tmpGraph));
//
//        Solution s = new Solution();
//        System.out.println(s.findMaxSumKadane(new int[]{2, 2, -1}, 0, 3));

//        Solution_174 s = new Solution_174();
//        int [][] dungeon = new int[][]{{-2,-3,3}, {-5,-10,1}, {10, 30, -5}};
//        s.calculateMinimumHP(dungeon);

//        Solution_688 s = new Solution_688();
//        System.out.println(s.knightProbability(3, 2, 0, 0));

//        Solution_673 s = new Solution_673();
//        System.out.println(s.findNumberOfLIS(new int[]{1,3,5,4,7}));

//        Solution_1046 s = new Solution_1046();
//        System.out.println(s.lastStoneWeight(new int[]{2,7,4,1,8,1}));

        Solution_795 s = new Solution_795();
        s.numSubarrayBoundedMax(new int[]{2, 1, 4,3}, 2, 3);
    }
}