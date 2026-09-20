package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d4z0 {

    /* JADX INFO: renamed from: a */
    public final rpy0 f45272a;

    /* JADX INFO: renamed from: b */
    public final boolean f45273b;

    /* JADX INFO: renamed from: c */
    public final String f45274c;

    /* JADX INFO: renamed from: d */
    public final g6z f45275d;

    /* JADX INFO: renamed from: e */
    public final hzy0 f45276e;

    /* JADX INFO: renamed from: f */
    public final gzy0 f45277f;

    /* JADX INFO: renamed from: g */
    public final kpy0 f45278g;

    /* JADX INFO: renamed from: h */
    public final qbm0 f45279h;

    public d4z0(rpy0 rpy0Var, boolean z, String str, g6z g6zVar, hzy0 hzy0Var, gzy0 gzy0Var, kpy0 kpy0Var, qbm0 qbm0Var) {
        this.f45272a = rpy0Var;
        this.f45273b = z;
        this.f45274c = str;
        this.f45275d = g6zVar;
        this.f45276e = hzy0Var;
        this.f45277f = gzy0Var;
        this.f45278g = kpy0Var;
        this.f45279h = qbm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4z0)) {
            return false;
        }
        d4z0 d4z0Var = (d4z0) obj;
        return wj50.m88271j(this.f45272a, d4z0Var.f45272a) && this.f45273b == d4z0Var.f45273b && wj50.m88271j(this.f45274c, d4z0Var.f45274c) && wj50.m88271j(this.f45275d, d4z0Var.f45275d) && wj50.m88271j(this.f45276e, d4z0Var.f45276e) && this.f45277f == d4z0Var.f45277f && wj50.m88271j(this.f45278g, d4z0Var.f45278g) && wj50.m88271j(this.f45279h, d4z0Var.f45279h);
    }

    public final int hashCode() {
        return this.f45279h.hashCode() + ((this.f45278g.hashCode() + ((this.f45277f.hashCode() + ((this.f45276e.hashCode() + ((this.f45275d.hashCode() + s571.m77243b(s571.m77245d(this.f45272a.hashCode() * 31, 31, this.f45273b), 31, this.f45274c)) * 31)) * 31)) * 31)) * 31);
    }
}
