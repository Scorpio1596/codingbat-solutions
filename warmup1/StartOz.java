public String startOz(String str) {
    String r = "";

    if (str.length() >= 1 && str.charAt(0)=='o') {
        r = r + str.charAt(0);
    }

    if (str.length() >= 2 && str.charAt(1)=='z') {
        r = r + str.charAt(1);
    }
    return r;
}
