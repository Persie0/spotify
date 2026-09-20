package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x5w0 {

    /* JADX INFO: renamed from: a */
    public final int f258532a;

    /* JADX INFO: renamed from: b */
    public final qvp f258533b;

    /* JADX INFO: renamed from: c */
    public final mb61 f258534c;

    /* JADX WARN: Multi-variable type inference failed */
    public x5w0(int i, qvp qvpVar, vh00 vh00Var) {
        this.f258532a = i;
        this.f258533b = qvpVar;
        this.f258534c = (mb61) vh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m90049a() {
        return this.f258532a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.mb61, p.vh00] */
    /* JADX INFO: renamed from: b */
    public final vh00 m90050b() {
        return this.f258534c;
    }

    /* JADX INFO: renamed from: c */
    public final qvp m90051c() {
        return this.f258533b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5w0)) {
            return false;
        }
        x5w0 x5w0Var = (x5w0) obj;
        return this.f258532a == x5w0Var.f258532a && wj50.m88271j(this.f258533b, x5w0Var.f258533b) && this.f258534c.equals(x5w0Var.f258534c);
    }

    public final int hashCode() {
        return this.f258534c.hashCode() + ((this.f258533b.hashCode() + (Integer.hashCode(this.f258532a) * 31)) * 31);
    }
}
