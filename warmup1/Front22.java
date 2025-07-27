public String front22(String str) {
    int t = 2;
    if (t > str.length()) {
        t = str.length();
    }

    String f = str.substring(0, t);
    return f + str + f;
}
