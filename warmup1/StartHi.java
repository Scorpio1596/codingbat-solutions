public boolean startHi(String str) {
    if (str.length() < 2) return false;

    String f = str.substring(0, 2);

    if (f.equals("hi")) {
        return true;
    } else {
        return false;
    }
}
