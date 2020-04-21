
public static String convert(String s, int numRows) {

        String[] temp = new String[numRows];
        String ret = "";

        int go = 0, row = 0;
        boolean swc = false;

        for(int i=0; i < numRows; i++) {
            temp[i] = "";
        }

        while (go < s.length()) {
        if (row == 0 || row >= numRows - 1) {
            swc = !swc;
        }

        temp[row] += s.charAt(go);

        if (numRows != 1) {
            if (swc == true) {
                row++;
            } else {
                row--;
            }
        }
        go++;

        }


        for(int i= 0; i < numRows; i++) {
            ret += temp[i];
        }

        return ret;
}