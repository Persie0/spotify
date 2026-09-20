package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xc81 {

    /* JADX INFO: renamed from: a */
    public final boolean f260126a;

    /* JADX INFO: renamed from: b */
    public final boolean f260127b;

    /* JADX INFO: renamed from: c */
    public final boolean f260128c;

    /* JADX INFO: renamed from: d */
    public final boolean f260129d;

    public /* synthetic */ xc81() {
        this(false, true, true, true);
    }

    /* JADX INFO: renamed from: a */
    public static xc81 m90358a(xc81 xc81Var, int i) {
        return new xc81((i & 1) != 0 ? xc81Var.f260126a : true, false, (i & 4) != 0 ? xc81Var.f260128c : false, (i & 8) != 0 ? xc81Var.f260129d : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc81)) {
            return false;
        }
        xc81 xc81Var = (xc81) obj;
        return this.f260126a == xc81Var.f260126a && this.f260127b == xc81Var.f260127b && this.f260128c == xc81Var.f260128c && this.f260129d == xc81Var.f260129d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260129d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f260126a) * 31, 31, this.f260127b), 31, this.f260128c);
    }

    public xc81(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f260126a = z;
        this.f260127b = z2;
        this.f260128c = z3;
        this.f260129d = z4;
    }
}
