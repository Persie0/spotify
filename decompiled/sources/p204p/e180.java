package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e180 {

    /* JADX INFO: renamed from: a */
    public final x080 f55137a;

    /* JADX INFO: renamed from: b */
    public final int f55138b;

    /* JADX INFO: renamed from: c */
    public final int f55139c;

    /* JADX INFO: renamed from: d */
    public final boolean f55140d;

    /* JADX INFO: renamed from: e */
    public final boolean f55141e;

    /* JADX INFO: renamed from: f */
    public final boolean f55142f;

    /* JADX INFO: renamed from: g */
    public final m761 f55143g;

    /* JADX INFO: renamed from: h */
    public final d180 f55144h;

    public e180(x080 x080Var, int i, int i2, boolean z, boolean z2, boolean z3, m761 m761Var, d180 d180Var) {
        this.f55137a = x080Var;
        this.f55138b = i;
        this.f55139c = i2;
        this.f55140d = z;
        this.f55141e = z2;
        this.f55142f = z3;
        this.f55143g = m761Var;
        this.f55144h = d180Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e180)) {
            return false;
        }
        e180 e180Var = (e180) obj;
        return wj50.m88271j(this.f55137a, e180Var.f55137a) && this.f55138b == e180Var.f55138b && this.f55139c == e180Var.f55139c && this.f55140d == e180Var.f55140d && this.f55141e == e180Var.f55141e && this.f55142f == e180Var.f55142f && this.f55143g == e180Var.f55143g && wj50.m88271j(this.f55144h, e180Var.f55144h);
    }

    public final int hashCode() {
        return this.f55144h.hashCode() + ((this.f55143g.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f55139c, mt60.m62800g(this.f55138b, this.f55137a.hashCode() * 31, 31), 31), 31, this.f55140d), 31, this.f55141e), 31, this.f55142f)) * 31);
    }
}
