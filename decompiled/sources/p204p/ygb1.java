package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ygb1 {

    /* JADX INFO: renamed from: a */
    public final ycs0 f272548a;

    /* JADX INFO: renamed from: b */
    public final x430 f272549b;

    /* JADX INFO: renamed from: c */
    public final yfj f272550c;

    public ygb1(ycs0 ycs0Var, x430 x430Var, yfj yfjVar) {
        this.f272548a = ycs0Var;
        this.f272549b = x430Var;
        this.f272550c = yfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygb1)) {
            return false;
        }
        ygb1 ygb1Var = (ygb1) obj;
        return wj50.m88271j(this.f272548a, ygb1Var.f272548a) && wj50.m88271j(this.f272549b, ygb1Var.f272549b) && wj50.m88271j(this.f272550c, ygb1Var.f272550c);
    }

    public final int hashCode() {
        int iHashCode = (this.f272549b.hashCode() + (this.f272548a.hashCode() * 31)) * 31;
        yfj yfjVar = this.f272550c;
        return iHashCode + (yfjVar == null ? 0 : yfjVar.hashCode());
    }
}
