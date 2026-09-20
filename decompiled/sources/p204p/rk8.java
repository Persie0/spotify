package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rk8 {

    /* JADX INFO: renamed from: a */
    public final yw6 f200019a;

    /* JADX INFO: renamed from: b */
    public final boolean f200020b;

    /* JADX INFO: renamed from: c */
    public final String f200021c;

    /* JADX INFO: renamed from: d */
    public final String f200022d;

    public rk8(yw6 yw6Var, boolean z, String str, String str2) {
        this.f200019a = yw6Var;
        this.f200020b = z;
        this.f200021c = str;
        this.f200022d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk8)) {
            return false;
        }
        rk8 rk8Var = (rk8) obj;
        return wj50.m88271j(this.f200019a, rk8Var.f200019a) && this.f200020b == rk8Var.f200020b && wj50.m88271j(this.f200021c, rk8Var.f200021c) && wj50.m88271j(this.f200022d, rk8Var.f200022d);
    }

    public final int hashCode() {
        return this.f200022d.hashCode() + s571.m77243b(s571.m77245d(this.f200019a.hashCode() * 31, 31, this.f200020b), 31, this.f200021c);
    }
}
