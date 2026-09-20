package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p50 {

    /* JADX INFO: renamed from: a */
    public final o50 f174034a;

    /* JADX INFO: renamed from: b */
    public final Object f174035b;

    public p50(o50 o50Var, Object obj) {
        this.f174034a = o50Var;
        this.f174035b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final o50 m69158a() {
        return this.f174034a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m69159b() {
        return this.f174035b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return wj50.m88271j(this.f174034a, p50Var.f174034a) && wj50.m88271j(this.f174035b, p50Var.f174035b);
    }

    public final int hashCode() {
        return this.f174035b.hashCode() + this.f174034a.f161808a.hashCode();
    }

    public final String toString() {
        return "(" + this.f174034a.f161808a + ", " + this.f174035b + ')';
    }
}
