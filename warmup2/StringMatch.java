public int stringMatch(String a, String b) {

    int l = Math.min(a.length(), b.length());
    int counter = 0;


    for (int i=0; i<l-1; i++) {
        String aSub = a.substring(i, i+2);
        String bSub = b.substring(i, i+2);
        if (aSub.equals(bSub)) {
            counter++;
        }
    }

    return counter;
}
