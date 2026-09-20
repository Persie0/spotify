package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ag80 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2524w8 f15308a;

    /* JADX INFO: renamed from: b */
    public final zf80 f15309b;

    /* JADX INFO: renamed from: c */
    public final vf80 f15310c;

    public ag80(AbstractC2524w8 abstractC2524w8, zf80 zf80Var, vf80 vf80Var) {
        this.f15308a = abstractC2524w8;
        this.f15309b = zf80Var;
        this.f15310c = vf80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag80)) {
            return false;
        }
        ag80 ag80Var = (ag80) obj;
        return wj50.m88271j(this.f15308a, ag80Var.f15308a) && wj50.m88271j(this.f15309b, ag80Var.f15309b) && wj50.m88271j(this.f15310c, ag80Var.f15310c);
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.f15309b.hashCode() + (this.f15308a.hashCode() * 31)) * 31;
        vf80 vf80Var = this.f15310c;
        if (vf80Var == null) {
            i = 0;
        } else {
            vf80Var.getClass();
            i = 1889685554;
        }
        return iHashCode + i;
    }
}
