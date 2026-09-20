package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ub9 implements jb3 {

    /* JADX INFO: renamed from: a */
    public final float f228656a;

    public ub9(float f) {
        this.f228656a = f;
    }

    @Override // p204p.jb3
    /* JADX INFO: renamed from: a */
    public final int mo52864a(int i, int i2, ko70 ko70Var) {
        float f = (i2 - i) / 2.0f;
        ko70 ko70Var2 = ko70.f124556a;
        float f2 = this.f228656a;
        if (ko70Var != ko70Var2) {
            f2 *= -1;
        }
        return ms2.m62681f(1, f2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub9) && Float.compare(this.f228656a, ((ub9) obj).f228656a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f228656a);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("Horizontal(bias="), this.f228656a, ')');
    }
}
