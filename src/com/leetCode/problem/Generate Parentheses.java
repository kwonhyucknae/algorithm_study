class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList();
        process(n, 0,0,"", ret);
        return ret;
    }

    public void process(int n, int open, int close, String str, List<String> ret) {

        if (open == n && close == n) {
            ret.add(str);
            return;
        }

        if (n > open) {
            process(n, open + 1, close, str + "(" , ret);
        }

        if (close < open) {
            process(n, open, close + 1 , str + ")" , ret);
        }

    }
}