package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yra1 implements dsa1 {

    /* JADX INFO: renamed from: a */
    public final String f275433a;

    /* JADX INFO: renamed from: b */
    public final String f275434b;

    /* JADX INFO: renamed from: c */
    public final int f275435c;

    /* JADX INFO: renamed from: d */
    public final int f275436d;

    /* JADX INFO: renamed from: e */
    public final int f275437e;

    /* JADX INFO: renamed from: f */
    public final int f275438f;

    public yra1(int i, int i2, int i3, int i4, String str, String str2) {
        this.f275433a = str;
        this.f275434b = str2;
        this.f275435c = i;
        this.f275436d = i2;
        this.f275437e = i3;
        this.f275438f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yra1)) {
            return false;
        }
        yra1 yra1Var = (yra1) obj;
        return this.f275433a.equals(yra1Var.f275433a) && this.f275434b.equals(yra1Var.f275434b) && this.f275435c == yra1Var.f275435c && this.f275436d == yra1Var.f275436d && this.f275437e == yra1Var.f275437e && this.f275438f == yra1Var.f275438f;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f275437e, mt60.m62800g(this.f275436d, mt60.m62800g(this.f275435c, s571.m77243b(this.f275433a.hashCode() * 31, 31, this.f275434b), 31), 31), 31);
        int i = this.f275438f;
        return iM62800g + (i == 0 ? 0 : edb.m38547C(i));
    }
}
