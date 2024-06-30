//package leetcode.dynamicprogramming;
//
//public class Solution_678 {
//
//    public boolean checkValidString(String s) {
//
//        int n = s.length();
//        boolean[][] isValidSub = new boolean[n+1][n+1];
//        isValidSub[0][0] = true;
//        for(int l =1;l<=n;++l){
//            for(int i=1;i<=n-l+1;++i){
//                int j= i+l-1;
//                if(l==1){
//                    if(s.charAt(i-1)=='*')
//                        isValidSub[i][j] = true;
//                    else{
//                        isValidSub[i][j] = false;
//                    }
//                }else if(l==2){
//                    if((s.charAt(i-1)=='(' && s.charAt(j-1)==')') || (s.charAt(i-1)=='*' && s.charAt(j-1)==')') ||
//                            (s.charAt(i-1)=='(' && s.charAt(j-1)=='*')|| ((s.charAt(i-1)=='*' && s.charAt(j-1)=='*'))){
//                        isValidSub[i][j] = true;
//                    }
//                } else{
//                    if(s.charAt(i-1)=='(' && s.charAt(j-1)==')' && isValidSub[i+1][j-1]){
//                        isValidSub[i][j] = true;
//                    }else if(s.charAt(i-1)=='*' && s.charAt(j-1)== ')'){
//                        if(isValidSub[i+1][j-1] || isValidSub[i+1][j]){
//                            isValidSub[i][j] = true;
//                        }
//                    }else if(s.charAt(i-1)=='(' && s.charAt(j-1)== '*'){
//                        if(isValidSub[i+1][j-1] || isValidSub[i][j-1]){
//                            isValidSub[i][j] = true;
//                        }
//                    }else if(s.charAt(i-1)=='*' && s.charAt(j-1)== '*'){
//                        if(isValidSub[i+1][j-1] || isValidSub[i][j-1] || isValidSub[i+1][j]){
//                            isValidSub[i][j] = true;
//                        }
//                    }
//                }
//            }
//        }
//        return isValidSub[1][n];
//    }
//
//}
