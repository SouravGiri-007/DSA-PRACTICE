public class SearchInString {
    public static void main(String[] args) {
        String str = "Sourav";
        char target = 'a';
        System.out.println(Search(str, target));

    }
    static boolean Search(String Str, char target)
        {
            if (Str.length() == 0)
            {
            return false;
            }
            for(int i = 0; i< Str.length(); i++){
                if(target == Str.charAt(i)){
                    return true;
                }
            }
            return false;
        }

}

static boolean Search2(String Str, char target)
        {
            if (Str.length() == 0)
            {
            return false;
            }
            for(char ch : Str.toCharArray()){
                if(ch == target){
                    return true;
                }
            }
            return false;
        }

}
