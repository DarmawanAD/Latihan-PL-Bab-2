class lintasan {
    private int p, l, k;
    public lintasan(int pjg, int lbr) {
        p = pjg;
        l = lbr;
        k = 2 * (p + l);
    }
    public int getK() {
        return k;
    }
}