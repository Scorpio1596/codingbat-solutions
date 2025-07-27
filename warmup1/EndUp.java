public String endUp(String str) {
    if (str.length() <= 3) return str.toUpperCase();
    int x = str.length() - 3;
    String f = str.substring(0, x);
    String b  = str.substring(x);
    return f + b.toUpperCase();
}
