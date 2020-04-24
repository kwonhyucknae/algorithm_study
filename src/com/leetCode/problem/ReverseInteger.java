class Solution {
    public int reverse(int x) {
        String test = Integer.toString(x);
        String ret = "";
        int dap = 0;

        for(int i=test.length() -1; i >= 0; i--) {
            if (ret == "" && test.charAt(i) == '0') {
                continue;
            }

            if (i == 0 && test.charAt(i) == '-') {
                ret = '-' + ret;
            } else {
                ret += Character.toString(test.charAt(i));
            }
        }

        try {
            return Integer.parseInt(ret);
        } catch(Exception e) {
            return 0;
        }
    }
}