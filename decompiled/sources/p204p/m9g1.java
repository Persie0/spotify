package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class m9g1 implements Comparable {

    /* JADX INFO: renamed from: a */
    public int f141308a;

    /* JADX INFO: renamed from: b */
    public long f141309b;

    /* JADX INFO: renamed from: c */
    public long f141310c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jlg1.m53703m(Long.valueOf(this.f141309b), Long.valueOf(((m9g1) obj).f141309b));
    }

    public final String toString() {
        String strM88466P0 = wl51.m88466P0(10, String.valueOf(this.f141309b / ((long) this.f141308a)));
        String strM88466P1 = wl51.m88466P0(10, String.valueOf(this.f141310c));
        String strM88466P2 = wl51.m88466P0(10, String.valueOf(this.f141309b));
        String strM88466P3 = wl51.m88466P0(5, String.valueOf(this.f141308a));
        int length = String.valueOf(strM88466P0).length();
        int length2 = String.valueOf(strM88466P1).length();
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 16 + String.valueOf(strM88466P2).length() + 14 + String.valueOf(strM88466P3).length());
        klh.m56844p(sb, "avgExecutionTime: ", strM88466P0, " us| maxExecutionTime: ", strM88466P1);
        return klh.m56837i(sb, " us| totalTime: ", strM88466P2, " us| #Usages: ", strM88466P3);
    }
}
