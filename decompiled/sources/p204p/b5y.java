package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b5y {

    /* JADX INFO: renamed from: a */
    public final qe10 f23786a;

    /* JADX INFO: renamed from: b */
    public final qe10 f23787b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b5y(qe10 qe10Var, int i) {
        int i2 = i & 2;
        oe10 oe10Var = oe10.f164317a;
        this(oe10Var, i2 != 0 ? oe10Var : qe10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5y)) {
            return false;
        }
        b5y b5yVar = (b5y) obj;
        return wj50.m88271j(this.f23786a, b5yVar.f23786a) && wj50.m88271j(this.f23787b, b5yVar.f23787b);
    }

    public final int hashCode() {
        return this.f23787b.hashCode() + (this.f23786a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.f23786a + ", nonSizeModifiers=" + this.f23787b + ')';
    }

    public b5y(qe10 qe10Var, qe10 qe10Var2) {
        this.f23786a = qe10Var;
        this.f23787b = qe10Var2;
    }
}
