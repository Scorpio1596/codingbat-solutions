public String frontTimes(String str, int n) {
    int x = 3;
    if (x > str.length()) {
        x = str.length();
    }
    String f = str.substring(0, x);

    String res = "";
    for (int i=0; i<n; i++) {
        res = res + f;
    }
    return res;
}
