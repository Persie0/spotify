package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c1f extends g1f {

    /* JADX INFO: renamed from: b */
    public final eq5 f33081b;

    /* JADX INFO: renamed from: c */
    public final int f33082c;

    public c1f(eq5 eq5Var, int i) {
        super(d1f.f44253d);
        this.f33081b = eq5Var;
        this.f33082c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1f)) {
            return false;
        }
        c1f c1fVar = (c1f) obj;
        return wj50.m88271j(this.f33081b, c1fVar.f33081b) && this.f33082c == c1fVar.f33082c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33082c) + (this.f33081b.hashCode() * 31);
    }
}
