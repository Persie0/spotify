package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g8l implements i8l {

    /* JADX INFO: renamed from: a */
    public final qe70 f77552a;

    /* JADX INFO: renamed from: b */
    public final Object f77553b;

    /* JADX WARN: Multi-variable type inference failed */
    public g8l(gh00 gh00Var, th00 th00Var) {
        this.f77552a = (qe70) gh00Var;
        this.f77553b = th00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.th00] */
    /* JADX INFO: renamed from: a */
    public final th00 m43961a() {
        return this.f77553b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8l)) {
            return false;
        }
        g8l g8lVar = (g8l) obj;
        return this.f77552a.equals(g8lVar.f77552a) && this.f77553b.equals(g8lVar.f77553b);
    }

    public final int hashCode() {
        return this.f77553b.hashCode() + (this.f77552a.hashCode() * 31);
    }
}
