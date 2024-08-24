//problem link = "Generate Parentheses";
import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    class Solution {

    List<String> ans = new ArrayList<>();
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
}
