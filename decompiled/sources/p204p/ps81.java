package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ps81 {

    /* JADX INFO: renamed from: a */
    public final os81 f180774a;

    /* JADX INFO: renamed from: b */
    public final boolean f180775b;

    /* JADX INFO: renamed from: c */
    public final qf40 f180776c;

    public ps81(os81 os81Var, boolean z, qf40 qf40Var) {
        this.f180774a = os81Var;
        this.f180775b = z;
        this.f180776c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps81)) {
            return false;
        }
        ps81 ps81Var = (ps81) obj;
        return wj50.m88271j(this.f180774a, ps81Var.f180774a) && this.f180775b == ps81Var.f180775b && wj50.m88271j(this.f180776c, ps81Var.f180776c);
    }

    public final int hashCode() {
        return this.f180776c.hashCode() + s571.m77245d(this.f180774a.hashCode() * 31, 31, this.f180775b);
    }
}
