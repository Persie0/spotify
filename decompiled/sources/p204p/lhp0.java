package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lhp0 implements shp0 {

    /* JADX INFO: renamed from: a */
    public final String f133616a;

    /* JADX INFO: renamed from: b */
    public final String f133617b;

    /* JADX INFO: renamed from: c */
    public final int f133618c;

    /* JADX INFO: renamed from: d */
    public final qz80 f133619d;

    public lhp0(String str, String str2, int i, qz80 qz80Var) {
        this.f133616a = str;
        this.f133617b = str2;
        this.f133618c = i;
        this.f133619d = qz80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhp0)) {
            return false;
        }
        lhp0 lhp0Var = (lhp0) obj;
        return wj50.m88271j(this.f133616a, lhp0Var.f133616a) && wj50.m88271j(this.f133617b, lhp0Var.f133617b) && this.f133618c == lhp0Var.f133618c && wj50.m88271j(this.f133619d, lhp0Var.f133619d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f133618c, s571.m77243b(this.f133616a.hashCode() * 31, 31, this.f133617b), 31);
        qz80 qz80Var = this.f133619d;
        return iM62800g + (qz80Var == null ? 0 : qz80Var.hashCode());
    }
}
