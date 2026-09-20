package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rdd {

    /* JADX INFO: renamed from: a */
    public final xcl0 f198094a;

    /* JADX INFO: renamed from: b */
    public final int f198095b;

    /* JADX INFO: renamed from: c */
    public final boolean f198096c;

    /* JADX INFO: renamed from: d */
    public final boolean f198097d;

    /* JADX INFO: renamed from: e */
    public final boolean f198098e;

    public rdd(xcl0 xcl0Var, int i, boolean z, boolean z2, boolean z3, int i2) {
        z2 = (i2 & 8) != 0 ? true : z2;
        z3 = (i2 & 32) != 0 ? true : z3;
        this.f198094a = xcl0Var;
        this.f198095b = i;
        this.f198096c = z;
        this.f198097d = z2;
        this.f198098e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdd)) {
            return false;
        }
        rdd rddVar = (rdd) obj;
        return wj50.m88271j(this.f198094a, rddVar.f198094a) && this.f198095b == rddVar.f198095b && this.f198096c == rddVar.f198096c && this.f198097d == rddVar.f198097d && this.f198098e == rddVar.f198098e;
    }

    public final int hashCode() {
        xcl0 xcl0Var = this.f198094a;
        return Boolean.hashCode(this.f198098e) + s571.m77245d(s571.m77245d(s571.m77245d(f710.m40938f(this.f198095b, (xcl0Var == null ? 0 : xcl0Var.hashCode()) * 31, 31), 31, this.f198096c), 31, this.f198097d), 31, true);
    }
}
