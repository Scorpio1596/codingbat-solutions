public String altPairs(String str) {
    String res = "";

    for (int i=0; i<str.length(); i += 4) {
        int e = i + 2;
        if (e > str.length()) {
            e = str.length();
        }
        res = res + str.substring(i, e);
    }

    return res;
}
