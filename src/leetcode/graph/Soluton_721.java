//package leetcode.graph;
//
//import java.util.*;
//
//public class Soluton_721 {
//
//    private final HashMap<String, List<String>> adj = new HashMap<>();
//    private final HashSet<String> vis = new HashSet<>();
//
//    public void DFS(String email, List<String> account){
//        vis.add(email);
//        account.add(email);
//        if(!adj.containsKey(email)){
//            return;
//        }
//        for(String tmpEmail: adj.get(email)){
//            if(!vis.contains(tmpEmail)){
//                DFS(tmpEmail, account);
//            }
//        }
//    }
//    public List<List<String>> accountsMerge(List<List<String>> accounts) {
//
//        for(List<String> account: accounts){
//            String firstEmail = account.get(1);
//            if(!adj.containsKey(firstEmail))
//            {
//                adj.put(firstEmail, new ArrayList<>());
//            }
//            for(int i=2;i<account.size();++i){
//                String curEmail = account.get(i);
//                adj.get(firstEmail).add(curEmail);
//                if(!adj.containsKey(curEmail)){
//                    adj.put(curEmail, new ArrayList<String>());
//                }
//                adj.get(curEmail).add(firstEmail);
//            }
//        }
//
//        List<List<String>> mergedAccounts =  new ArrayList<>();
//        for(List<String> account: accounts){
//            String name = account.get(0);
//            String accountEmail = account.get(1);
//            if(!vis.contains(accountEmail)){
//                List<String> tmpAcc = new ArrayList<>();
//                tmpAcc.add(name);
//                DFS(accountEmail, tmpAcc);
//                Collections.sort(tmpAcc.subList(1, tmpAcc.size()));
//                mergedAccounts.add(tmpAcc);
//            }
//        }
//        return mergedAccounts;
//    }
//}
