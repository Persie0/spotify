package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class h4d0 implements uw40 {

    /* JADX INFO: renamed from: a */
    public final int f87519a;

    public h4d0(int i) {
        this.f87519a = i;
        if (i >= 0) {
            return;
        }
        pt40.m70891a("maxLength must be at least zero");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4d0) && this.f87519a == ((h4d0) obj).f87519a;
    }

    @Override // p204p.uw40
    /* JADX INFO: renamed from: g */
    public final void mo46635g(mpz0 mpz0Var) {
        qr60[] qr60VarArr = jpz0.f114758a;
        lpz0 lpz0Var = hpz0.f93942R;
        qr60 qr60Var = jpz0.f114758a[29];
        mpz0Var.mo62511a(lpz0Var, Integer.valueOf(this.f87519a));
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87519a);
    }

    @Override // p204p.uw40
    /* JADX INFO: renamed from: i */
    public final void mo33950i(t571 t571Var) {
        if (t571Var.f217234c.length() > this.f87519a) {
            t571Var.m80102k();
        }
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("InputTransformation.maxLength("), this.f87519a, ')');
    }
}
