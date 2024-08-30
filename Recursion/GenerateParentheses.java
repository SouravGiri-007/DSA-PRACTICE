/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sourav
 */

 //Problem Link = "https://leetcode.com/problems/generate-parentheses/"
public class GenerateParentheses {
    
    @SuppressWarnings({ "unchecked", "rawtypes" }) //Ignore This
    List<String> ans = new ArrayList();
    public List<String> generateParenthesis(int n) {
        backtracking(n, 0, 0, new StringBuilder());
        return ans;
    }
    private void backtracking(int n, int countOpen, int countClose, StringBuilder sb) {
        if(sb.length() == n * 2) {
            ans.add(sb.toString());
            return;
        }
        if(countOpen < n) {
            sb.append('(');
            backtracking(n, countOpen + 1, countClose, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(countClose < countOpen) {
            sb.append(')');
            backtracking(n, countOpen, countClose + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

