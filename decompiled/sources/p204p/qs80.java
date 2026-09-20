package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qs80 {

    /* JADX INFO: renamed from: a */
    public final qla1 f192032a;

    /* JADX INFO: renamed from: b */
    public final boolean f192033b;

    /* JADX INFO: renamed from: c */
    public final int f192034c;

    /* JADX INFO: renamed from: d */
    public final int f192035d;

    /* JADX INFO: renamed from: e */
    public final int f192036e;

    public qs80(qla1 qla1Var, boolean z, int i, int i2, int i3) {
        this.f192032a = qla1Var;
        this.f192033b = z;
        this.f192034c = i;
        this.f192035d = i2;
        this.f192036e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs80)) {
            return false;
        }
        qs80 qs80Var = (qs80) obj;
        return wj50.m88271j(this.f192032a, qs80Var.f192032a) && this.f192033b == qs80Var.f192033b && this.f192034c == qs80Var.f192034c && this.f192035d == qs80Var.f192035d && this.f192036e == qs80Var.f192036e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f192036e) + mt60.m62800g(this.f192035d, mt60.m62800g(this.f192034c, s571.m77245d(this.f192032a.hashCode() * 31, 31, this.f192033b), 31), 31);
    }
}
