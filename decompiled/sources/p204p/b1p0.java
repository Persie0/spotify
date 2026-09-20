package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b1p0 {

    /* JADX INFO: renamed from: a */
    public final udy0 f22385a;

    /* JADX INFO: renamed from: b */
    public final pa81 f22386b;

    /* JADX INFO: renamed from: c */
    public final aw31 f22387c;

    /* JADX INFO: renamed from: d */
    public final aw31 f22388d;

    public b1p0(udy0 udy0Var, pa81 pa81Var, aw31 aw31Var, aw31 aw31Var2) {
        this.f22385a = udy0Var;
        this.f22386b = pa81Var;
        this.f22387c = aw31Var;
        this.f22388d = aw31Var2;
    }

    /* JADX INFO: renamed from: a */
    public final aw31 m27916a() {
        return this.f22388d;
    }

    /* JADX INFO: renamed from: b */
    public final aw31 m27917b() {
        return this.f22387c;
    }

    /* JADX INFO: renamed from: c */
    public final udy0 m27918c() {
        return this.f22385a;
    }

    /* JADX INFO: renamed from: d */
    public final pa81 m27919d() {
        return this.f22386b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1p0)) {
            return false;
        }
        b1p0 b1p0Var = (b1p0) obj;
        return wj50.m88271j(this.f22385a, b1p0Var.f22385a) && wj50.m88271j(this.f22386b, b1p0Var.f22386b) && wj50.m88271j(this.f22387c, b1p0Var.f22387c) && wj50.m88271j(this.f22388d, b1p0Var.f22388d);
    }

    public final int hashCode() {
        return this.f22388d.hashCode() + ((this.f22387c.hashCode() + ((this.f22386b.hashCode() + (this.f22385a.hashCode() * 31)) * 31)) * 31);
    }
}
