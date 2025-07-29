public String makeTags(String tag, String word) {
    String a = "<";
    String b = ">";
    String c = "/";
    return  a+tag+b + word + a+c+tag+b ;
}
