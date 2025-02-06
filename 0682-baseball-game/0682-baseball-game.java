class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>Scores = new Stack<>();

        for(String OP : operations){
            switch(OP){
                case"+":
                int last = Scores.pop();
                int secondlast = Scores.peek();
                Scores.push(last);
                Scores.push(last+secondlast);
                break;
                
                case "C":
                Scores.pop();
                break;

                case "D":
                Scores.push(2 * Scores.peek());
                break;

                default:
                Scores.push(Integer.parseInt(OP));
            }
        }

         int totalSum = 0;
        for (int score : Scores) {
            totalSum += score;
        }
        
        return totalSum;
     }
}