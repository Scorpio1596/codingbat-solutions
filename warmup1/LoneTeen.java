public boolean loneTeen(int a, int b) {
    boolean at = (a >= 13 && a <= 19);
    boolean bt = (b >= 13 && b <= 19);

    return (at && !bt) || (!at && bt);
}
