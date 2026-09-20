package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bez {

    /* JADX INFO: renamed from: a */
    public final r1z0 f26497a;

    /* JADX INFO: renamed from: b */
    public final q1z0 f26498b;

    /* JADX INFO: renamed from: c */
    public final n1z0 f26499c;

    /* JADX INFO: renamed from: d */
    public final boolean f26500d;

    /* JADX INFO: renamed from: e */
    public final boolean f26501e;

    /* JADX INFO: renamed from: f */
    public final boolean f26502f;

    /* JADX INFO: renamed from: g */
    public final w1z0 f26503g;

    public bez(r1z0 r1z0Var, q1z0 q1z0Var, n1z0 n1z0Var, boolean z, boolean z2, boolean z3, w1z0 w1z0Var) {
        this.f26497a = r1z0Var;
        this.f26498b = q1z0Var;
        this.f26499c = n1z0Var;
        this.f26500d = z;
        this.f26501e = z2;
        this.f26502f = z3;
        this.f26503g = w1z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bez)) {
            return false;
        }
        bez bezVar = (bez) obj;
        return wj50.m88271j(this.f26497a, bezVar.f26497a) && wj50.m88271j(this.f26498b, bezVar.f26498b) && wj50.m88271j(this.f26499c, bezVar.f26499c) && this.f26500d == bezVar.f26500d && this.f26501e == bezVar.f26501e && this.f26502f == bezVar.f26502f && wj50.m88271j(this.f26503g, bezVar.f26503g);
    }

    public final int hashCode() {
        return this.f26503g.f247199a.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d((this.f26499c.hashCode() + ((this.f26498b.hashCode() + (this.f26497a.hashCode() * 31)) * 31)) * 31, 31, this.f26500d), 29791, this.f26501e), 31, this.f26502f);
    }
}
