class pelari {
    private String nama, nim;
    private int s, t;
    public pelari(String nm, String nimp, int munyer, int waktu) {
        nama = nm;
        nim = nimp;
        s = munyer;
        t = waktu;
    }
    public String getNama() {
        return nama;
    }
    public int v() {
        return s / t;
    }
    public boolean seleksi(pelari zzz) {
        return (v() > zzz.v()) ? true : false;
    }
    public void showData(lintasan lintasan) {
        System.out.printf("%s %.0f\n", nama, lintasan.getK() * s);
    }
}