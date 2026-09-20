package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yzb1 {

    /* JADX INFO: renamed from: a */
    public final int f277754a;

    /* JADX INFO: renamed from: b */
    public final q9c1 f277755b;

    /* JADX INFO: renamed from: c */
    public final String f277756c;

    /* JADX INFO: renamed from: d */
    public final x0p0 f277757d;

    public yzb1(int i, q9c1 q9c1Var, String str, x0p0 x0p0Var) {
        this.f277754a = i;
        this.f277755b = q9c1Var;
        this.f277756c = str;
        this.f277757d = x0p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzb1)) {
            return false;
        }
        yzb1 yzb1Var = (yzb1) obj;
        return this.f277754a == yzb1Var.f277754a && this.f277755b.equals(yzb1Var.f277755b) && wj50.m88271j(this.f277756c, yzb1Var.f277756c) && wj50.m88271j(this.f277757d, yzb1Var.f277757d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(edb.m38547C(this.f277754a) * 31, 31, this.f277755b.f186565a), 31, this.f277756c);
        x0p0 x0p0Var = this.f277757d;
        return iM77243b + (x0p0Var == null ? 0 : x0p0Var.hashCode());
    }
}
