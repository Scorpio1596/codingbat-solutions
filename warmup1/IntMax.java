public int intMax(int a, int b, int c) {
    int largest;

    if (a > b) {
        largest = a;
    } else {
        largest = b;
    }

    if (c > largest) {
        largest = c;
    }

    return largest;
}
