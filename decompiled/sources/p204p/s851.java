package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s851 {

    /* JADX INFO: renamed from: a */
    public final v851 f206559a;

    /* JADX INFO: renamed from: b */
    public final int f206560b;

    /* JADX INFO: renamed from: c */
    public final boolean f206561c;

    /* JADX INFO: renamed from: d */
    public final boolean f206562d;

    /* JADX INFO: renamed from: e */
    public final boolean f206563e;

    public s851(v851 v851Var, int i, boolean z, boolean z2, boolean z3) {
        this.f206559a = v851Var;
        this.f206560b = i;
        this.f206561c = z;
        this.f206562d = z2;
        this.f206563e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s851)) {
            return false;
        }
        s851 s851Var = (s851) obj;
        return wj50.m88271j(this.f206559a, s851Var.f206559a) && this.f206560b == s851Var.f206560b && this.f206561c == s851Var.f206561c && this.f206562d == s851Var.f206562d && this.f206563e == s851Var.f206563e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206563e) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f206560b, this.f206559a.hashCode() * 31, 31), 31, this.f206561c), 31, this.f206562d);
    }
}
