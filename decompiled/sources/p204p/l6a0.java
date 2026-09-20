package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l6a0 {

    /* JADX INFO: renamed from: a */
    public final qu80 f130285a;

    /* JADX INFO: renamed from: b */
    public final boolean f130286b;

    /* JADX INFO: renamed from: c */
    public final uvf0 f130287c;

    /* JADX INFO: renamed from: d */
    public final boolean f130288d;

    public l6a0(qu80 qu80Var, boolean z, uvf0 uvf0Var, boolean z2) {
        this.f130285a = qu80Var;
        this.f130286b = z;
        this.f130287c = uvf0Var;
        this.f130288d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6a0)) {
            return false;
        }
        l6a0 l6a0Var = (l6a0) obj;
        return wj50.m88271j(this.f130285a, l6a0Var.f130285a) && this.f130286b == l6a0Var.f130286b && wj50.m88271j(this.f130287c, l6a0Var.f130287c) && this.f130288d == l6a0Var.f130288d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130288d) + ((this.f130287c.hashCode() + s571.m77245d(this.f130285a.hashCode() * 31, 31, this.f130286b)) * 31);
    }
}
