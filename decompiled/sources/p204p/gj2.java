package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gj2 {

    /* JADX INFO: renamed from: a */
    public final tf60 f80333a;

    /* JADX INFO: renamed from: b */
    public final boolean f80334b;

    /* JADX INFO: renamed from: c */
    public final mb61 f80335c;

    /* JADX WARN: Multi-variable type inference failed */
    public gj2(tf60 tf60Var, boolean z, vh00 vh00Var) {
        this.f80333a = tf60Var;
        this.f80334b = z;
        this.f80335c = (mb61) vh00Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.mb61, p.vh00] */
    /* JADX INFO: renamed from: a */
    public static gj2 m44862a(gj2 gj2Var) {
        tf60 tf60Var = gj2Var.f80333a;
        ?? r1 = gj2Var.f80335c;
        gj2Var.getClass();
        return new gj2(tf60Var, true, r1);
    }

    /* JADX INFO: renamed from: b */
    public final tf60 m44863b() {
        return this.f80333a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44864c() {
        return this.f80334b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj2)) {
            return false;
        }
        gj2 gj2Var = (gj2) obj;
        return wj50.m88271j(this.f80333a, gj2Var.f80333a) && this.f80334b == gj2Var.f80334b && this.f80335c.equals(gj2Var.f80335c);
    }

    public final int hashCode() {
        return this.f80335c.hashCode() + s571.m77245d(this.f80333a.hashCode() * 31, 31, this.f80334b);
    }
}
