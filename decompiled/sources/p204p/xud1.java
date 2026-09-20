package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xud1 implements eie0 {

    /* JADX INFO: renamed from: a */
    public final sb9 f266097a;

    public xud1(sb9 sb9Var) {
        this.f266097a = sb9Var;
    }

    @Override // p204p.eie0
    /* JADX INFO: renamed from: a */
    public final int mo39096a(c450 c450Var, long j, int i, ko70 ko70Var) {
        int i2 = (int) (j >> 32);
        if (i < i2) {
            return n0e1.m63437n(this.f266097a.mo52864a(i, i2, ko70Var), 0, i2 - i);
        }
        return ms2.m62681f(1, ko70Var != ko70.f124556a ? 0.0f * (-1) : 0.0f, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xud1) && this.f266097a.equals(((xud1) obj).f266097a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f266097a.f207381a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f266097a + ", margin=0)";
    }
}
