public String everyNth(String str, int n) {
    String r = "";

    for (int i=0; i<str.length(); i = i + n) {
        r = r + str.charAt(i);
    }
    return r;
}
