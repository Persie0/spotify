package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gkm0 {

    /* JADX INFO: renamed from: a */
    public final Integer f80837a;

    /* JADX INFO: renamed from: b */
    public final zt91 f80838b;

    public gkm0(Integer num, zt91 zt91Var) {
        this.f80837a = num;
        this.f80838b = zt91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkm0)) {
            return false;
        }
        gkm0 gkm0Var = (gkm0) obj;
        return wj50.m88271j(this.f80837a, gkm0Var.f80837a) && wj50.m88271j(this.f80838b, gkm0Var.f80838b);
    }

    public final int hashCode() {
        Integer num = this.f80837a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        zt91 zt91Var = this.f80838b;
        return iHashCode + (zt91Var != null ? zt91Var.hashCode() : 0);
    }

    public /* synthetic */ gkm0(Integer num, zt91 zt91Var, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : zt91Var);
    }
}
