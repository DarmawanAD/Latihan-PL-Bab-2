class pelari {
    private String nama, nim;
    private double s, t;
    public pelari(String nm, String nimp, double munyer, double waktu) {
        nama = nm;
        nim = nimp;
        s = munyer;
        t = waktu;
    }
    public String getNama() {
        return nama;
    }
    public double v() {
        return s / t;
    }
    public boolean seleksi(pelari zzz) {
        return (v() > zzz.v()) ? true : false;
    }
    public void showData(lintasan lintasan) {
        System.out.printf("%s %.0f\n", nama, lintasan.getK() * s);
    }
}