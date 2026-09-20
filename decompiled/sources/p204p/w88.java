package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w88 {

    /* JADX INFO: renamed from: a */
    public final qf40 f248876a;

    /* JADX INFO: renamed from: b */
    public final qf40 f248877b;

    /* JADX INFO: renamed from: c */
    public final qf40 f248878c;

    /* JADX INFO: renamed from: d */
    public final String f248879d;

    /* JADX INFO: renamed from: e */
    public final qf40 f248880e;

    /* JADX INFO: renamed from: f */
    public final boolean f248881f;

    /* JADX INFO: renamed from: g */
    public final boolean f248882g;

    public w88(qf40 qf40Var, qf40 qf40Var2, qf40 qf40Var3, String str, qf40 qf40Var4, boolean z, boolean z2) {
        this.f248876a = qf40Var;
        this.f248877b = qf40Var2;
        this.f248878c = qf40Var3;
        this.f248879d = str;
        this.f248880e = qf40Var4;
        this.f248881f = z;
        this.f248882g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w88)) {
            return false;
        }
        w88 w88Var = (w88) obj;
        return wj50.m88271j(this.f248876a, w88Var.f248876a) && wj50.m88271j(this.f248877b, w88Var.f248877b) && wj50.m88271j(this.f248878c, w88Var.f248878c) && wj50.m88271j(this.f248879d, w88Var.f248879d) && wj50.m88271j(this.f248880e, w88Var.f248880e) && this.f248881f == w88Var.f248881f && this.f248882g == w88Var.f248882g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248882g) + s571.m77245d(fr0.m42461e(this.f248880e, s571.m77243b(fr0.m42461e(this.f248878c, fr0.m42461e(this.f248877b, this.f248876a.hashCode() * 31, 31), 31), 31, this.f248879d), 31), 31, this.f248881f);
    }
}
