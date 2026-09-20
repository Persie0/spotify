package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gy2 {

    /* JADX INFO: renamed from: a */
    public final ty2 f85408a;

    /* JADX INFO: renamed from: b */
    public final boolean f85409b;

    /* JADX INFO: renamed from: c */
    public final zpe1 f85410c;

    /* JADX INFO: renamed from: d */
    public final cl6 f85411d;

    /* JADX INFO: renamed from: e */
    public final boolean f85412e;

    public gy2(ty2 ty2Var, boolean z, zpe1 zpe1Var, cl6 cl6Var, boolean z2) {
        this.f85408a = ty2Var;
        this.f85409b = z;
        this.f85410c = zpe1Var;
        this.f85411d = cl6Var;
        this.f85412e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy2)) {
            return false;
        }
        gy2 gy2Var = (gy2) obj;
        return wj50.m88271j(this.f85408a, gy2Var.f85408a) && this.f85409b == gy2Var.f85409b && wj50.m88271j(this.f85410c, gy2Var.f85410c) && wj50.m88271j(this.f85411d, gy2Var.f85411d) && this.f85412e == gy2Var.f85412e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85412e) + ((this.f85411d.hashCode() + ((this.f85410c.hashCode() + s571.m77245d(this.f85408a.hashCode() * 31, 31, this.f85409b)) * 31)) * 31);
    }
}
