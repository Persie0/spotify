package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iab1 implements kab1 {

    /* JADX INFO: renamed from: a */
    public final hab1 f100213a;

    /* JADX INFO: renamed from: b */
    public final gab1 f100214b;

    /* JADX INFO: renamed from: c */
    public final gab1 f100215c;

    /* JADX INFO: renamed from: d */
    public final agl0 f100216d;

    public iab1(hab1 hab1Var, gab1 gab1Var, gab1 gab1Var2, agl0 agl0Var) {
        this.f100213a = hab1Var;
        this.f100214b = gab1Var;
        this.f100215c = gab1Var2;
        this.f100216d = agl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iab1)) {
            return false;
        }
        iab1 iab1Var = (iab1) obj;
        return this.f100213a == iab1Var.f100213a && wj50.m88271j(this.f100214b, iab1Var.f100214b) && wj50.m88271j(this.f100215c, iab1Var.f100215c) && wj50.m88271j(this.f100216d, iab1Var.f100216d);
    }

    public final int hashCode() {
        int iHashCode = (this.f100215c.hashCode() + ((this.f100214b.hashCode() + (this.f100213a.hashCode() * 31)) * 31)) * 31;
        agl0 agl0Var = this.f100216d;
        return iHashCode + (agl0Var == null ? 0 : agl0Var.hashCode());
    }
}
