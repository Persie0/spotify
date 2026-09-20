package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ga7 {

    /* JADX INFO: renamed from: a */
    public final ig20 f77986a;

    /* JADX INFO: renamed from: b */
    public final y79 f77987b;

    /* JADX INFO: renamed from: c */
    public final rlx f77988c;

    /* JADX INFO: renamed from: d */
    public final String f77989d;

    /* JADX INFO: renamed from: e */
    public final ag1 f77990e;

    /* JADX INFO: renamed from: f */
    public final boolean f77991f;

    public ga7(ig20 ig20Var, y79 y79Var, rlx rlxVar, String str, ag1 ag1Var, boolean z) {
        this.f77986a = ig20Var;
        this.f77987b = y79Var;
        this.f77988c = rlxVar;
        this.f77989d = str;
        this.f77990e = ag1Var;
        this.f77991f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga7)) {
            return false;
        }
        ga7 ga7Var = (ga7) obj;
        return wj50.m88271j(this.f77986a, ga7Var.f77986a) && wj50.m88271j(this.f77987b, ga7Var.f77987b) && wj50.m88271j(this.f77988c, ga7Var.f77988c) && wj50.m88271j(this.f77989d, ga7Var.f77989d) && this.f77990e == ga7Var.f77990e && this.f77991f == ga7Var.f77991f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77991f) + ((this.f77990e.hashCode() + s571.m77243b((this.f77988c.hashCode() + ((this.f77987b.hashCode() + (this.f77986a.hashCode() * 31)) * 31)) * 31, 31, this.f77989d)) * 31);
    }
}
