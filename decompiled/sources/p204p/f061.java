package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f061 {

    /* JADX INFO: renamed from: a */
    public final w261 f64556a;

    /* JADX INFO: renamed from: b */
    public final int f64557b;

    /* JADX INFO: renamed from: c */
    public final fxh0 f64558c;

    /* JADX INFO: renamed from: d */
    public final gh00 f64559d;

    public f061(w261 w261Var, int i, fxh0 fxh0Var, gh00 gh00Var) {
        this.f64556a = w261Var;
        this.f64557b = i;
        this.f64558c = fxh0Var;
        this.f64559d = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f061)) {
            return false;
        }
        f061 f061Var = (f061) obj;
        return wj50.m88271j(this.f64556a, f061Var.f64556a) && this.f64557b == f061Var.f64557b && wj50.m88271j(this.f64558c, f061Var.f64558c) && wj50.m88271j(this.f64559d, f061Var.f64559d);
    }

    public final int hashCode() {
        return this.f64559d.hashCode() + ((this.f64558c.hashCode() + mt60.m62800g(this.f64557b, this.f64556a.hashCode() * 31, 31)) * 31);
    }
}
