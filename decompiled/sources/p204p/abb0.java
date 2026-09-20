package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class abb0 {

    /* JADX INFO: renamed from: a */
    public final xf81 f14086a;

    /* JADX INFO: renamed from: b */
    public final String f14087b;

    /* JADX INFO: renamed from: c */
    public final d850 f14088c;

    public abb0(xf81 xf81Var, String str, d850 d850Var) {
        this.f14086a = xf81Var;
        this.f14087b = str;
        this.f14088c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abb0)) {
            return false;
        }
        abb0 abb0Var = (abb0) obj;
        return wj50.m88271j(this.f14086a, abb0Var.f14086a) && wj50.m88271j(this.f14087b, abb0Var.f14087b) && wj50.m88271j(this.f14088c, abb0Var.f14088c);
    }

    public final int hashCode() {
        return this.f14088c.hashCode() + s571.m77243b(this.f14086a.hashCode() * 31, 31, this.f14087b);
    }
}
