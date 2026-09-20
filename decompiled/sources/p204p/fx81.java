package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fx81 {

    /* JADX INFO: renamed from: a */
    public final t0v0 f74291a;

    /* JADX INFO: renamed from: b */
    public final boolean f74292b;

    /* JADX INFO: renamed from: c */
    public final boolean f74293c;

    /* JADX INFO: renamed from: d */
    public final boolean f74294d;

    /* JADX INFO: renamed from: e */
    public final boolean f74295e;

    /* JADX INFO: renamed from: f */
    public final boolean f74296f;

    public fx81(t0v0 t0v0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f74291a = t0v0Var;
        this.f74292b = z;
        this.f74293c = z2;
        this.f74294d = z3;
        this.f74295e = z4;
        this.f74296f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx81)) {
            return false;
        }
        fx81 fx81Var = (fx81) obj;
        return wj50.m88271j(this.f74291a, fx81Var.f74291a) && this.f74292b == fx81Var.f74292b && this.f74293c == fx81Var.f74293c && this.f74294d == fx81Var.f74294d && this.f74295e == fx81Var.f74295e && this.f74296f == fx81Var.f74296f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74296f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f74291a.hashCode() * 31, 31, this.f74292b), 31, this.f74293c), 31, this.f74294d), 31, this.f74295e);
    }
}
