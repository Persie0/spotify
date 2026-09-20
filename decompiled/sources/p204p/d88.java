package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d88 {

    /* JADX INFO: renamed from: a */
    public final v851 f46400a;

    /* JADX INFO: renamed from: b */
    public final boolean f46401b;

    /* JADX INFO: renamed from: c */
    public final int f46402c;

    /* JADX INFO: renamed from: d */
    public final boolean f46403d;

    public d88(v851 v851Var, boolean z, int i, boolean z2) {
        this.f46400a = v851Var;
        this.f46401b = z;
        this.f46402c = i;
        this.f46403d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d88)) {
            return false;
        }
        d88 d88Var = (d88) obj;
        return wj50.m88271j(this.f46400a, d88Var.f46400a) && this.f46401b == d88Var.f46401b && this.f46402c == d88Var.f46402c && this.f46403d == d88Var.f46403d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46403d) + mt60.m62800g(this.f46402c, s571.m77245d(this.f46400a.hashCode() * 31, 31, this.f46401b), 31);
    }
}
