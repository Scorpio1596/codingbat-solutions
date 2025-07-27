public int close10(int a, int b) {
    int ad = Math.abs(a - 10);
    int bd = Math.abs(b - 10);

    if (ad < bd) {
        return a;
    }
    if (bd < ad) {
        return b;
    }
    return 0;
}
